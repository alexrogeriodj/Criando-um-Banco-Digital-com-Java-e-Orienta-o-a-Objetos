package br.esig.com.nujava.dominio;

import java.util.Date;
import java.util.Random;

/** Esta entendidade representa uma Conta.
 * 
 * Uma conta deve ser ligada apenas uma {@link Pessoa}. <p><br />
 * Quem regulamenta a conta é a {@link Instituicao}. <p><br />
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
 */
public class Conta extends Instituicao {
	private String numero;
	
	private boolean ativa;
	
	private Double saldo;
	
	private Pessoa pessoa;
	
	private Date dataCriacao;
	
	private CartaoCredito cartaoCredito;
	
	private boolean possuiCredito;
	
	public Conta() {
		Random random = new Random();
		this.numero = "" + random.nextInt(4) + "-" + random.nextInt(1);
		this.pessoa = new Pessoa();
		this.saldo = 0.0;
		this.ativa = Boolean.TRUE;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isAtiva() {
		return ativa;
	}

	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public boolean isPossuiCredito() {
		return possuiCredito;
	}

	public void setPossuiCredito(boolean possuiCredito) {
		this.possuiCredito = possuiCredito;
	}
	
}
