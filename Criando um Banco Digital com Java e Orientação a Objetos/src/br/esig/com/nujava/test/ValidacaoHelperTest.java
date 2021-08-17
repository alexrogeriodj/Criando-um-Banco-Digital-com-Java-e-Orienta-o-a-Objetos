package br.esig.com.nujava.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.dominio.Genero;
import br.esig.com.nujava.dominio.Pessoa;
import br.esig.com.nujava.negocio.ValidacaoHelper;

/** Esta entendidade testa as validações da {@link Conta}.
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
  */
public class ValidacaoHelperTest {

	@Test
	public void testDeveCadastrarContaComTodosDados() {
		Conta conta = new Conta();
		conta.getPessoa().setNome("Teste");
		conta.getPessoa().setCpf("111-111-111-11");
		conta.getPessoa().setGenero(Genero.modificarStringToGenero("Masculino"));
		conta.getPessoa().setDataNascimento(new Date());
		conta.setNumero("000000-0");
		
		assertTrue(ValidacaoHelper.isPossivelCadastrarConta(conta));
	}
	
	@Test
	public void testNaoDeveCadastrarContaComTodosDados() {
		Conta conta = null;
		
		assertFalse(ValidacaoHelper.isPossivelCadastrarConta(conta));
	}
	
	@Test
	public void testPossivelDepositarDinheiro() {
		assertTrue(ValidacaoHelper.isPossivelRealizarDeposito(10.0));
	}
	
	@Test
	public void testNaoPossivelDepositarDinheiro() {
		assertFalse(ValidacaoHelper.isPossivelRealizarDeposito(0.0));
	}
	
	@Test
	public void testDeveSerPossivelRealizarTransacao() {
		Conta conta = new Conta();
		conta.setSaldo(50.0);
		
		assertTrue(ValidacaoHelper.isPossivelRealizarOperacaoBancaria(conta, 10.0));
	}
	
	@Test
	public void testNaoDeveSerPossivelRealizarTransacao() {
		Conta conta = new Conta();
		conta.setSaldo(50.0);
		
		assertFalse(ValidacaoHelper.isPossivelRealizarOperacaoBancaria(conta, 60.0));
	}
	
	@Test
	public void testExisteConta() {
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta conta = new Conta();
		conta.setPessoa(new Pessoa());
		conta.getPessoa().setCpf("111-111-111-11");
		
		contas.add(conta);
		
		assertTrue(ValidacaoHelper.isContaExistente(contas, conta.getPessoa().getCpf()));
	}
	
	@Test
	public void testNaoExisteConta() {
		List<Conta> contas = new ArrayList<Conta>();
		
		assertFalse(ValidacaoHelper.isContaExistente(contas, "111-111-111-11"));
	}
	
	@Test
	public void testDeveSolicitarCartaoCreditoComSaldoMaiorQueCinquentaReais() {
		Conta conta = new Conta();
		conta.setSaldo(60.0);
		
		assertTrue(ValidacaoHelper.isPossivelSolicitarCartao(conta));
	}
	
	@Test
	public void testNaoDeveSolicitarCartaoCreditoComSaldoMenorQueCinquentaReais() {
		Conta conta = new Conta();
		conta.setSaldo(10.0);
		
		assertFalse(ValidacaoHelper.isPossivelSolicitarCartao(conta));
	}

}
