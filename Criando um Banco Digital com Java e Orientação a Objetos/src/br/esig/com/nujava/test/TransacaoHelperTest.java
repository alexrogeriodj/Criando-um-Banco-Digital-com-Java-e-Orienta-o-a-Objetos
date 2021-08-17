package br.esig.com.nujava.test;

import static org.junit.Assert.*;

import org.junit.Test;

import br.esig.com.nujava.dominio.Conta;
import br.esig.com.nujava.negocio.TransacaoHelper;

/** Esta entendidade testa a {@link TransacaoHelper}.
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
  */
public class TransacaoHelperTest {

	@Test
	public void testDeveSacar() {
		Conta conta = new Conta();
		conta.setSaldo(50.0);
		
		TransacaoHelper transacaoHelper = new TransacaoHelper();
		transacaoHelper.sacar(conta, 10.0);
		
		assertTrue(conta.getSaldo() == 40.0);
	}
	
	@Test
	public void testNaoDeveSacar() {
		Conta conta = new Conta();
		conta.setSaldo(50.0);
		
		TransacaoHelper transacaoHelper = new TransacaoHelper();
		transacaoHelper.sacar(conta, 60.0);
		
		assertTrue(conta.getSaldo() == 50.0);
	}
	
	@Test
	public void testDeveDepositar() {
		Conta conta = new Conta();
		
		TransacaoHelper transacaoHelper = new TransacaoHelper();
		transacaoHelper.depositar(conta, 10.0);
		
		assertTrue(conta.getSaldo() == 10.0);
	}
	
	@Test
	public void testDeveTransferir() {
		Conta conta1 = new Conta();
		conta1.setSaldo(50.0);
		
		Conta conta2 = new Conta();
		
		TransacaoHelper transacaoHelper = new TransacaoHelper();
		transacaoHelper.transferir(conta1, conta2, 10.0);
		
		assertTrue(conta1.getSaldo() == 40.0 && conta2.getSaldo() == 10.0);
	}
	
	@Test
	public void testNaoDeveTransferir() {
		Conta conta1 = new Conta();
		conta1.setSaldo(50.0);
		
		Conta conta2 = new Conta();
		
		TransacaoHelper transacaoHelper = new TransacaoHelper();
		transacaoHelper.transferir(conta1, conta2, 60.0);
		
		assertTrue(conta1.getSaldo() == 50.0 && conta2.getSaldo() == 0.0);
	}

}
