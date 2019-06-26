package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> empresas = new ArrayList<Empresa>();

	static {
		Empresa empresa = new Empresa();
		empresa.setName("GooDog");
		Empresa empresa2 = new Empresa();
		empresa2.setName("CalvinCorp");
		empresas.add(empresa);
		empresas.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		empresas.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return empresas;
	}

}
