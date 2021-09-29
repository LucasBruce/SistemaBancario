package br.com.bruce.sistemaBancario;

import java.util.Scanner;


import br.com.bruce.sistemaBancario.service.serviceImpl.ContaServiceImpl;
import br.com.bruce.sistemaBancario.service.serviceImpl.UsuarioServiceImpl;

public class Main {
	public static final void main(String args[]) {

		int cont = 0;
		Scanner scan = new Scanner(System.in);
		UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();
		ContaServiceImpl contaService = new ContaServiceImpl();

		do {
			System.out.println("SISTEMA BANCARIO");
			System.out.println("----------------------------------------");
			System.out.println("Digite 1 para Cadastrar Conta/saldo");
			System.out.println("Digite 2 para entrar no menu da conta");
			System.out.println("Digite 3 para listar usuario");
			System.out.println("Digite 4 para sair");
			cont = scan.nextInt();
			
			if (cont != 4) {
				if (cont == 1) {
					contaService.adicionarConta();
					
				} else if (cont == 2) {
					contaService.listarConta();
				
				}else if(cont == 3) {					
					usuarioService.adicionarUsuario();
					
				}
			}
		} while (cont != 4);
		System.out.println("FINALIZADO!....");
	}
}
