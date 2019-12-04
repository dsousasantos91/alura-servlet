package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	public static List<Empresa> lista = new ArrayList<Empresa>();
	private static int identificador = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(identificador++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(identificador);
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
	}
	
	public void adicionar(Empresa empresa) {
		empresa.setId(identificador++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {

		return Banco.lista;
	}

	public void removerEmpresa(Integer id) {
		
		Iterator<Empresa> iterator = Banco.lista.iterator();
		
		while (iterator.hasNext()) {
			Empresa empresa = iterator.next();
			
			if (empresa.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Empresa buscarEmpresaPorId(Integer id) {

		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
	}

}
