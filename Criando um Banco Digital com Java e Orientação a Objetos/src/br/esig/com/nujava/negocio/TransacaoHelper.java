package br.esig.com.nujava.negocio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import br.esig.com.nujava.dominio.CartaoCredito;
import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.dominio.Genero;
import br.esig.com.nujava.interfaces.Operacoes;

/** Esta é a entidade que executa as transações no sistema.
 * 
 * Uma transação é definada na interface de {@link Operacoes}. <p><br />
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
 */
public class TransacaoHelper implements Operacoes {

	@Override
	public void sacar(Conta conta, double valor) {
		if(ValidacaoHelper.isPossivelRealizarOperacaoBancaria(conta, valor)) {
			double novoSaldo = conta.getSaldo() - valor;
			conta.setSaldo(novoSaldo);
			
			System.out.println("Você sacou: R$ " + valor);
		}
	}

	@Override
	public void depositar(Conta conta, double valor) {
		if(ValidacaoHelper.isPossivelRealizarDeposito(valor)) {
			double novoSaldo = conta.getSaldo() + valor;
			conta.setSaldo(novoSaldo);
			
			System.out.println("Você depositou: R$ " + valor);
		}
	}

	@Override
	public void transferir(Conta suaConta, Conta contaDestino, double valor) {
		if(ValidacaoHelper.isPossivelRealizarOperacaoBancaria(suaConta, valor)) {
			sacar(suaConta, valor);
			depositar(contaDestino, valor);
			
			System.out.println("Você transferiu para " + contaDestino.getPessoa().getNome() + " o total de: R$ " + suaConta.getSaldo());
			System.out.println("Seu saldo atual da sua conta é: R$ " + suaConta.getSaldo());
		}
	}
	
	@Override
	public void solicitarCartao(Conta conta) throws ParseException {
		if(ValidacaoHelper.isPossivelSolicitarCartao(conta)) {
			CartaoCredito cartaoCredito = new CartaoCredito();
			conta.setCartaoCredito(cartaoCredito);
			
			System.out.println("Cartão de Crédito solicitado com sucesso!");
		}
	}

	@Override
	public void exibirDadosBancarios(Conta conta) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("Nome: " + conta.getPessoa().getNome());
		System.out.println("CPF: " + conta.getPessoa().getCpf());
		System.out.println("Gênero: " + Genero.getNomeGenero(conta.getPessoa().getGenero().getGenero()));
		System.out.println("Data de Nascimento: " + simpleDateFormat.format(conta.getPessoa().getDataNascimento()));
		System.out.println("Banco: " + conta.getNome());
		System.out.println("Agência: " + conta.getCodigo());
		System.out.println("Nº da Conta: " + conta.getNumero());
	}

}
