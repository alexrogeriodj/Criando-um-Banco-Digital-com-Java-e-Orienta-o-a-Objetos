package br.esig.com.nujava.dominio;

import java.util.Date;

/** Esta entendidade representa uma Instituição Bancária.
 * 
 * Uma instituição possui CNPJ único. <p><br />
 * Uma instituição ela é regulamentada pelo Governo Federal. <p><br />
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
 * @see <a href="https://pt.wikipedia.org/wiki/Brasil">Site do Brasil</>
 */
public class Instituicao {
	
	private String nome;
	
	private String cnpj;
	
	private Date dataCriacao;
	
	private String codigo;
	
	public Instituicao() {
		this.nome = "NuJava";
		this.cnpj = "79773685000169";
		this.dataCriacao = new Date();
		this.codigo = "0001";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
