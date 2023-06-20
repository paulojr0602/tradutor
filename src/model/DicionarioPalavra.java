package model;

public class DicionarioPalavra {
	
	private String palavraOriginal;
	
	private String traducao;
	
	private String modo;

	public DicionarioPalavra(String palavraOriginal, String traducao, String modo) {
		super();
		this.palavraOriginal = palavraOriginal;
		this.traducao = traducao;
		this.modo = modo;
	}
	
//	public boolean validarTraducao() {
//		return getPalavraOriginal().equals(palavra);
//	}

	public String getPalavraOriginal() {
		return palavraOriginal;
	}

	public void setPalavraOriginal(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal;
	}

	public String getTraducao() {
		return traducao;
	}

	public void setTraducao(String traducao) {
		this.traducao = traducao;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
	
	

}
