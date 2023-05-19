import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Menu {
	// Variáveis globais
	static int opcao;
	static ArrayList<Aluno> alunos = new ArrayList();
	static ArrayList<Professor> professores = new ArrayList();
	static ArrayList<Atendimento> atendimentos = new ArrayList();
	static Scanner s = new Scanner(System.in);
	static ArrayList<Pessoa> pessoas = new ArrayList();

	// Método "buscar professor" que será usado na principal
	static void buscarProfessor() {
		System.out.println();
		if(professores.size() == 0) {
			System.out.println("Não há professores cadastrados no sistema!");
		} else {
		String opcoes[] = { "*** Opções ***", "1 - Buscar um professor pelo nome",
				"2 - Buscar professores de uma disciplina" };
		for (int c = 0; c < opcoes.length; c++) {
			System.out.println(opcoes[c]);
		}
		try {
			System.out.print("Digite a opção desejada: ");
			opcao = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Erro na variavel!");
			s.nextLine();
			System.out.println("Digite a opção novamente: ");
			opcao = s.nextInt();
		}
		if (opcao == 1) {
			System.out.println();
			System.out.print("Digite o nome do professor que você deseja buscar: ");
			s.nextLine();
			String nome = s.nextLine();
			System.out.println();

			for (Professor p : professores) {
				if (p.getNome().equals(nome)) {
					p.imprimir();
					break;
				}
			}
		}
		if (opcao == 2) {
			System.out.println();
			System.out.print("Digite a disciplina dos professores que você deseja buscar: ");
			s.nextLine();
			String disciplina = s.nextLine();
			for (Professor p : professores) {
				if (p.getDisciplina().equals(disciplina)) {
					System.out.println();
					p.imprimir();
					
				} 
				}
			}
		}
	}
	
	// Método "Remover pessoas" que será usado na principal
	static void removerPessoas() {
		System.out.println();
		System.out.println("**** Opções ****");
		System.out.println("1 - Remover Professor");
		System.out.println("2 - Remover Aluno");
		try {
			System.out.println("Digite a opção: ");
			opcao = s.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Erro na variavel!");
			s.nextLine();
			System.out.print("Digite novamente: ");
			opcao = s.nextInt();
		}
		if (opcao == 1) {
			if (professores.size() == 0) {
				System.out.println("Não há professores existentes no sistema!");
			} else {
				System.out.println();
				System.out.print("Digite o nome do Professor que quer remover: ");
				s.nextLine();
				String nome = s.nextLine();

			for(Professor p : professores) {
				if(p.getNome().equals(nome)) {
					professores.remove(p);
					System.out.println("O professor " + nome + " foi removido!");
					break;
				}
			}
				
			}
		} else if (opcao == 2) {
			if(alunos.size() == 0) {
				System.out.println("Não há alunos cadastrados no sistema!");
			} else {
			System.out.print("Digite o nome do Aluno que quer remover: ");
			s.nextLine();
			String remove = s.nextLine();

			for (Aluno a : alunos) {
				if (a.getNome().equals(remove));
				alunos.remove(a);
				System.out.println("O aluno " + remove + " foi removido!");
				break;
			}
		}
		}
		
	}

	// Método principal
	public static void main(String[] args) {
		int matricula = 0;
		String nome;

		String opcoes[] = { "*** Opções ***", "0 - Encerrar programa", "1 - Criar professor", "2 - Criar aluno",
				"3 - Remover Pessoas", "4 - Listar Professores", "5 - Listar Alunos", "6 - Buscar professor",
				"7 - Solicitar atendimento", "8 - Listar Atendimentos" };

		System.out.println("*** Seja bem vindo ao C.A digital ***");
		for (int c = 0; c < opcoes.length; c++) {
			System.out.println(opcoes[c]);
		}
		try {
		System.out.print("Digite a opção desejada: ");
		opcao = s.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Erro na variavel!");
			s.nextLine();
			System.out.print("Digite a opção novamente: ");
			opcao = s.nextInt();
		}
		while (opcao != 0) {
			// Condicional usada para criar um professor e adicionar no ArrayList
			// "professores"
			if (opcao == 1) {
				String disciplina;

				System.out.print("Digite o nome do professor: ");
				s.nextLine();
				nome = s.nextLine();
				try {
					System.out.print("Digite a matricula do professor: ");
					matricula = s.nextInt();
					throw new MinhaExceção(matricula);
				} catch(InputMismatchException | MinhaExceção e) {
					System.out.println("Erro na variavel!");
					s.nextLine();
					System.out.print("Digite a matricula novamente: ");
					matricula = s.nextInt();
					s.nextLine();
				}
				System.out.print("Digite a disciplina do professor: ");
				disciplina = s.nextLine();

				Professor p = new Professor(nome, matricula, disciplina);
				professores.add(p);
				System.out.println("Professor " + nome + " foi adicionado!");
				// Condicional usada para criar um aluno e adicionar no ArrayList "alunos"
			} else if (opcao == 2) {
				System.out.print("Digite o nome do aluno: ");
				s.nextLine();
				nome = s.nextLine();
				try {
					System.out.print("Digite a matrícula do aluno: ");
					matricula = s.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("Erro na variavel!");
					s.nextLine();
					System.out.print("Digite a matrícula novamente: ");
					matricula = s.nextInt();
				}
				System.out.print("Digite o endereço do aluno: ");
				s.nextLine();
				String endereco = s.nextLine();

				System.out.print("Digite a turma desejada: ");
				String turma = s.nextLine();

				Aluno a = new Aluno(nome, matricula, endereco, turma);
				alunos.add(a);
				System.out.println("Aluno " + nome + " foi adicionado!");
				//Condicional usada para remover, tanto alunos, quanto professores
			} else if (opcao == 3) {
				removerPessoas();
				//Condicional usada para listar todos os professores cadastrados no sistema
			} else if (opcao == 4) {
				System.out.println();
				if (professores.size() == 0) {
					System.out.println("Não há professores cadastrados no sistema!");
				} else {
					System.out.println("**** Listagem de Professores****");
					for (Professor p : professores) {
						System.out.println();
						p.imprimir();
						System.out.println();
					}
				}
				//Condicional usada para listar todos os alunos cadastrados no sistema
			} else if (opcao == 5) {
				System.out.println();
				if (alunos.size() == 0) {
					System.out.println("Não há alunos cadastrados no sistema!");
				} else {
					System.out.println("**** Listagem de Alunos ****");
					for (Aluno a : alunos) {
						System.out.println();
						a.imprimir();
						System.out.println();
					}
				}
				// Condicional usada para buscar um professor, tanto pelo nome, quanto pela matrícula
			} else if (opcao == 6) {
				buscarProfessor();
				//Condicional usada para solicitar atendimentos
			} else if (opcao == 7) {
				System.out.print("Digite o nome do aluno: ");
				s.nextLine();
				String aluno = s.nextLine();
				System.out.print("Digite o nome do Professor que quer tirar dúvida: ");
				String prof = s.nextLine();
				System.out.print("Digite sua dúvida: ");
				String duvida = s.nextLine();

				Atendimento at = new Atendimento(aluno, prof, duvida);
				atendimentos.add(at);
				System.out.println("Atendimento Cadastrado!");
				//Condicional usada para mostrar os atendimentos
			} else if (opcao == 8) {
				System.out.println();
				if (atendimentos.size() == 0) {
					System.out.println("Não há atendimentos cadastrados no sistema");
				} else {
					System.out.println("**** Listagem de Atendimentos ****");
					System.out.println();
					for (Atendimento at : atendimentos) {
						at.imprimir();
					}
				}
				
				// Caso digite opções fora das apresentadas
			} else {
				System.out.println("A opção digitada não está presente nas opções disponíveis");
			}
			System.out.println();
			for (int c = 0; c < opcoes.length; c++) {
				System.out.println(opcoes[c]);
			}
			try {
			System.out.print("Digite a opção desejada: ");
			opcao = s.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Erro na variavel!");
				s.nextLine();
				System.out.println("Digite a opção novamente: ");
				opcao = s.nextInt();
			}
		}
		System.out.println("Programa encerrado");

	}
}