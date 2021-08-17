package br.esig.com.nujava.dominio;

/** Esta entendidade representa uma gênero.
 * 
 * Uma pessoa somente pode possuir único gênero. <p><br />
 * 
 * @author Alex Rogério
 * @since 17/08/2021
 * @version 1.0
  */
public class Genero {
	public static final char MASCULINO = 'M';
	
	public static final char FEMININO = 'G';
	
	private Character genero;
	
	public static String getNomeGenero(char genero) {
		switch (genero) {
		case MASCULINO:
			return "Masculino";
		case FEMININO:
			return "Feminino";	
		default:
			return "Desconhecido";
		}
	}
	
	public Genero() {}
	
	public Genero(char genero) {
		this.genero = genero;
	}
 	
	public static Genero modificarStringToGenero(String genero) {
		switch (genero) {
		case "Masculino":
			return new Genero(MASCULINO);
		case "Feminino":
			return new Genero(FEMININO);	
		default:
			return new Genero();
		}
	}
	
	public boolean isGeneroMasculino(Character genero) {
		return genero != null && genero == MASCULINO;
	}
	
	public boolean isGeneroFeminino(Character genero) {
		return  genero != null && genero == FEMININO;
	}
	
	public boolean isEmpty() {
		return this.genero == null;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}
}
