package model;

import java.util.List;

public class Tradutor {
	
	private Dicionario dicionario; 	
	
	private List<DicionarioPalavra> dicionarioPalavras;
	
	private String palavraOriginal;
	
	public Tradutor(String palavraOriginal, String modo) {
		super();
		dicionario = new Dicionario(modo);
		dicionarioPalavras = dicionario.getDicionarioPalavras();
		setPalavraOriginal(palavraOriginal);
	}
	
	public String getTraducao() {
		return traduzir(dic -> dic.getPalavraOriginal().contains(getPalavraOriginal()));
	}
	
	public String traduzir(ITradutor<DicionarioPalavra> palavra) {
		for(DicionarioPalavra dic : dicionarioPalavras) {
			if(palavra.traduzir(dic)) {
				//if(dic.getPalavraOriginal().equals(getPalavraOriginal())) {
					return dic.getTraducao();
				//}
			}
		}
		return getPalavraOriginal();
	}

	public String getPalavraOriginal() {
		return palavraOriginal;
	}

	public void setPalavraOriginal(String palavraOriginal) {
		this.palavraOriginal = palavraOriginal;
	}

}
