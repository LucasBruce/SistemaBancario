package br.com.bruce.sistemaBancario.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.bruce.sistemaBancario.modelo.Conta;
import br.com.bruce.sistemaBancario.modelo.DadoCliente;
import br.com.bruce.sistemaBancario.modelo.Endereco;
import br.com.bruce.sistemaBancario.service.ContaService;

public class ContaServiceImpl implements ContaService {

	List<Conta> contaListar = new ArrayList<>();

	@Override
	public void adicionarConta() {
		Conta conta;
		conta = new Conta();
		conta.dadoCliente = new DadoCliente();
		conta.endereco = new Endereco();
		
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("MENU CONTA");
			System.out.println("-------------------------------");
			System.out.println("Digite 1 para cadastra conta");
			System.out.println("Digite 2 para depositar");
			System.out.println("Digite 3 para transferir");
			System.out.println("Digite 4 para ver saldo");
			System.out.println("Digite 5 para sair");
			cont = scan.nextInt();

			if (cont != 5) {
				if (cont == 1) {
					
					
					System.out.println("AGÊNCIA: ");
					String agencia = scan.next();
					conta.setAgencia(agencia);

					System.out.println("NÚMERO DA CONTA: ");
					int numero = scan.nextInt();
					conta.setNumeroConta(numero);

					System.out.println("SALDO: ");
					double saldo = scan.nextDouble();
					conta.setSaldo(saldo);

					System.out.println("NOME: ");
					String nome = scan.next();
					conta.dadoCliente.setNome(nome);
					

					System.out.println("CPF: ");
					String cpf = scan.next();
					conta.dadoCliente.setCpf(cpf);
					

					System.out.println("EMAIL: ");
					String email = scan.next();
					conta.dadoCliente.setEmail(email);
					

					System.out.println("IDENTIDADE: ");
					int identidade = scan.nextInt();
					conta.dadoCliente.setIdentidade(identidade);
					

					System.out.println("ESCOLARIDADE:");
					String escolaridade = scan.next();
					conta.dadoCliente.setEscolaridade(escolaridade);
					

					System.out.println("ESTADO: ");
					String estado = scan.next();
					conta.endereco.setEstado(estado);
					

					System.out.println("CIDADE: ");
					String cidade = scan.next();
					conta.endereco.setCidade(cidade);

					System.out.println("LOGRADOURO: ");
					String logradouro = scan.next();
					conta.endereco.setLogradouro(logradouro);
					

					System.out.println("RUA: ");
					String rua = scan.next();
					conta.endereco.setRua(rua);
					

					contaListar.add(conta);
					System.out.println("Conta adicionada com sucesso!");

				} else if (cont == 2) {
					System.out.println();
					System.out.println("Saldo atual:" + conta.getSaldo());
					System.out.println("Digite o valor do deposito:");
					double valor = scan.nextDouble();
					conta.setSaldo(valor);

				} else if (cont == 3) {
					System.out.println();
					System.out.println("Saldo atual:" + conta.getSaldo());
					System.out.println("Digite o valor da transferencia:");
					double valor = scan.nextDouble();
					conta.transferir(valor);

				} else if (cont == 4) {
					System.out.println();
					System.out.println("Saldo atual: " + conta.getSaldo());
					System.out.println();
				}

			}
		} while (cont != 5);
		System.out.println("...");

	}

	@Override
	public void listarConta() {
		int cont = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("DADOS DA CONTA");
			System.out.println("-------------------------------");
			System.out.println("Digite 1 para detalhe da conta");
			System.out.println("Digite 2 para dados pessoais");
			System.out.println("Digite 3 para ver endereço");
			System.out.println("Digite 4 para sair");
			cont = scan.nextInt();

			if (cont != 4) {
				if (cont == 1) {
					for (Conta conta : contaListar) {
						System.out.println("-------------------------------------------");
						System.out.println("AGÊNCIA: " + conta.getAgencia());
						System.out.println("NÚMERO DA CONTA: " + conta.getNumeroConta());
						System.out.println("SALDO: " + conta.getSaldo());
						System.out.println("-------------------------------------------");

					}
				} else if (cont == 2) {
					for (Conta conta : contaListar) {
						System.out.println("-------------------------------------------");
						System.out.println("NOME: " + conta.dadoCliente.getNome());
						System.out.println("CPF: " + conta.dadoCliente.getCpf());
						System.out.println("EMAIL: " + conta.dadoCliente.getEmail());
						System.out.println("IDENTIDADE: " + conta.dadoCliente.getIdentidade());
						System.out.println("ESCOLARIDADE:" + conta.dadoCliente.getEscolaridade());
						System.out.println("-------------------------------------------");
					}
				} else if (cont == 3) {
					for (Conta conta : contaListar) {
						System.out.println("-------------------------------------------");
						System.out.println("ESTADO: " + conta.endereco.getEstado());
						System.out.println("CIDADE: " + conta.endereco.getCidade());
						System.out.println("LOGRADOURO: " + conta.endereco.getLogradouro());
						System.out.println("RUA: " + conta.endereco.getRua());
						System.out.println("-------------------------------------------");
					}
				}
			}
		} while (cont != 4);
		System.out.println("...");
	}

}
