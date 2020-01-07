package br.com.alura.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	public static List<Empresa> lista = new ArrayList<Empresa>();
	public static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	private static int identificador = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(identificador++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(identificador++);
		Banco.lista.add(empresa);
		Banco.lista.add(empresa2);
		
		Usuario u1 = new Usuario();
		u1.setLogin("douglas");
		u1.setSenha("12345");
		
		Usuario u2 = new Usuario();
		u2.setLogin("deborah");
		u2.setSenha("1234");
		
		listaUsuarios.add(u1);
		listaUsuarios.add(u2);
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
	
	public Usuario existeUsuario(String login, String senha) {
		
		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		
		return null;
	}

}
