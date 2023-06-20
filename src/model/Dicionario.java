package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Dicionario {
	
	public Dicionario(String modo) {
		super();
		this.modo = modo;
		carregarDicionario();
	}
	
	private String modo;
	
	private List<DicionarioPalavra> dicionarioPalavras;
	
	static final String path = "/dicionarios/";
	
	public void carregarDicionario() {
		BufferedReader bufferedReader = null;
		dicionarioPalavras = new ArrayList<> ();
		try {
			bufferedReader = new BufferedReader (new FileReader (path + modo.toString() + ".txt"));	
		    
			for (String linha = bufferedReader.readLine(); linha != null; linha = bufferedReader.readLine()) {
				DicionarioPalavra palavras = new DicionarioPalavra(linha.split("=")[0], linha.split("=")[1], modo); 
		        dicionarioPalavras.add(palavras);
		    }
		} catch (IOException ex) {
		    ex.printStackTrace();
		} finally {
		    try { if (bufferedReader != null) bufferedReader.close(); } catch (IOException ex) {}
		}
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}

	public List<DicionarioPalavra> getDicionarioPalavras() {
		return dicionarioPalavras;
	}

	public void setDicionarioPalavras(List<DicionarioPalavra> dicionarioPalavras) {
		this.dicionarioPalavras = dicionarioPalavras;
	}
}
