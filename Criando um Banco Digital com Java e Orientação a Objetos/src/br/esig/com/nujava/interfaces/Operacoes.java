package br.esig.com.nujava.interfaces;

import java.text.ParseException;

import br.esig.com.nujava.dominio.Conta;

/** Esta entendidade representa um contrato para operações bancárias.
 * 
 * Uma operação deve ser saque, depósito e transferência <p><br />
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
 */
public interface Operacoes {
	
	/** Esta função é responsável por sacar dinheiro de uma conta.
	 * 
	 * @author Frank Laércio
	 * @since 02/03/2021
	 * @version 1.0
	 */
	public void sacar(Conta conta, double valor);
	
	/** Esta função é responsável por inserir dinheiro em uma conta.
	 * 
	 * @author Frank Laércio
	 * @since 02/03/2021
	 * @version 1.0
	 */
	public void depositar(Conta conta, double valor);
	
	/** Esta função é responsável por transferir dinheiro entre contas bancárias.
	 * 
	 * @author Frank Laércio
	 * @since 02/03/2021
	 * @version 1.0
	 */
	public void transferir(Conta suaConta, Conta contaDestino, double valor);
	
	/** Esta função é responsável por solicitar cartões de crédito.
	 * 
	 * @author Frank Laércio
	 * @since 02/03/2021
	 * @version 1.0
	 */
	public void solicitarCartao(Conta conta) throws ParseException;
	
	/** Esta função é responsável por exibir os dados bancários de uma conta.
	 * 
	 * @author Frank Laércio
	 * @since 02/03/2021
	 * @version 1.0
	 */
	public void exibirDadosBancarios(Conta conta);
}
