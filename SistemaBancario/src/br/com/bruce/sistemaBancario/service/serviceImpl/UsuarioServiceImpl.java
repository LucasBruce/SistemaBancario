package br.com.bruce.sistemaBancario.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.bruce.sistemaBancario.modelo.Usuario;
import br.com.bruce.sistemaBancario.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	List<Usuario> usuarioLista = new ArrayList<>();
	Scanner scan = new Scanner(System.in);
	Usuario usuario = new Usuario();

	@Override
	public void adicionarUsuario() {
		System.out.println("CADASTRO DE USUÁRIO");
		System.out.println("-----------------------");
		System.out.println("Digite nome:");
		String nome = scan.next();
		usuario.setNome(nome);

		System.out.println("Digite função:");
		String funcao = scan.next();
		usuario.setFuncao(funcao);
		usuarioLista.add(usuario);
		System.out.println("Usuario cadastrado com sucesso!");
	}

	@Override
	public void listarUsuario() {
		for (Usuario usuario : usuarioLista) {
			System.out.println("------------------------------");
			System.out.println("NOME: " + usuario.getNome());
			System.out.println("FUNÇÃO: " + usuario.getFuncao());
			System.out.println("------------------------------");
		}

	}

}
