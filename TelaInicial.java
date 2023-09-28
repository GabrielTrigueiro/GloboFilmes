import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TelaInicial {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        List<Filme> filmes = new ArrayList<>();
	        List<Funcionario> funcionarios = new ArrayList<>();

	        do {
	            try {
	                System.out.println("\nMenu:");
	                System.out.println("1. Adicionar Funcionário");
	                System.out.println("2. Adicionar Filme");
	                System.out.println("3. Remover Filme");
	                System.out.println("4. Editar Filme");
	                System.out.println("5. Listar Filmes");
	                System.out.println("6. Sair");
	                System.out.print("Escolha uma opção: ");

	                opcao = scanner.nextInt();
	                scanner.nextLine(); 

	                switch (opcao) {
	                    // ...
	                    default:
	                        System.out.println("Opção inválida. Tente novamente.");
	                        break;
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inválida. Digite um número válido.");
	                scanner.nextLine(); // Limpar o buffer do scanner em caso de erro
	                opcao = 0; // Definir opção como 0 para evitar loop infinito
	            }
	        } while (opcao != 6);
	    }

	 private static void adicionarFilme(List<Filme> filmes, List<Funcionario> funcionarios) {
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Nome do filme: ");
		    String nome = scanner.nextLine();
		    System.out.print("Diretor: ");
		    String diretor = scanner.nextLine();
		    System.out.print("Roteirista: ");
		    String roteirista = scanner.nextLine();
		    System.out.print("Ano: ");
		    int ano = scanner.nextInt();
		    scanner.nextLine(); // Limpar o buffer do scanner
		    System.out.print("Trilha Sonora: ");
		    String trilhaSonora = scanner.nextLine();

		    Filme filme = new Filme(nome, diretor, roteirista, ano, trilhaSonora);

		    // Adicionar o elenco
		    System.out.println("Adicionar membros do elenco (Digite 'FIM' para encerrar):");
		    while (true) {
		        System.out.print("Nome do funcionário: ");
		        String nomeFuncionario = scanner.nextLine();

		        if (nomeFuncionario.equalsIgnoreCase("FIM")) {
		            break;
		        }

		        System.out.print("Papel do funcionário (Ator, Roteirista ou Diretor): ");
		        String papel = scanner.nextLine();

		        Funcionario funcionarioEncontrado = null;
		        for (Funcionario func : funcionarios) {
		            if (func.getNome().equalsIgnoreCase(nomeFuncionario)) {
		                funcionarioEncontrado = func;
		                break;
		            }
		        }

		        if (funcionarioEncontrado != null) {
		            // Adicionar o funcionário ao elenco sem restrições de papel
		            filme.adicionarElenco(funcionarioEncontrado);
		            System.out.println(funcionarioEncontrado.getNome() + " adicionado ao elenco como " + papel);
		        } else {
		            System.out.println("Funcionário não encontrado. Certifique-se de adicioná-lo primeiro.");
		        }
		    }

		    filmes.add(filme);

		    System.out.println("Filme adicionado com sucesso.");
		}
	 
	    private static void adicionarFuncionario(List<Funcionario> funcionarios) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nome do funcionário: ");
	        String nome = scanner.nextLine();
	        System.out.print("Função (Ator, Diretor ou Roteirista): ");
	        String funcao = scanner.nextLine();

	        if (funcao.equalsIgnoreCase("Ator")) {
	            Ator ator = new Ator(nome);
	            funcionarios.add(ator);
	        } else if (funcao.equalsIgnoreCase("Diretor")) {
	            Diretor diretor = new Diretor(nome);
	            funcionarios.add(diretor);
	        } else if (funcao.equalsIgnoreCase("Roteirista")) {
	            Roteirista roteirista = new Roteirista(nome);
	            funcionarios.add(roteirista);
	        } else {
	            System.out.println("Função inválida. Funcionário não adicionado.");
	        }

	        System.out.println("Funcionário adicionado com sucesso.");
	    }

	    private static void removerFilme(List<Filme> filmes) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nome do filme a ser removido: ");
	        String nome = scanner.nextLine();

	        Filme filmeParaRemover = null;
	        for (Filme filme : filmes) {
	            if (filme.getNome().equalsIgnoreCase(nome)) {
	                filmeParaRemover = filme;
	                break;
	            }
	        }

	        if (filmeParaRemover != null) {
	            filmes.remove(filmeParaRemover);
	            System.out.println("Filme removido com sucesso.");
	        } else {
	            System.out.println("Filme não encontrado.");
	        }
	    }

	    private static void editarFilme(List<Filme> filmes, List<Funcionario> funcionarios) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nome do filme a ser editado: ");
	        String nome = scanner.nextLine();

	        Filme filmeParaEditar = null;
	        for (Filme filme : filmes) {
	            if (filme.getNome().equalsIgnoreCase(nome)) {
	                filmeParaEditar = filme;
	                break;
	            }
	        }

	        if (filmeParaEditar != null) {
	            System.out.println("Editando filme: " + filmeParaEditar.getNome());
	            
	            // Passa a lista de funcionários como argumento
	            adicionarMembrosElenco(filmeParaEditar, funcionarios);
	            
	            System.out.println("Filme editado com sucesso.");
	        } else {
	            System.out.println("Filme não encontrado.");
	        }
	    }

	    private static void adicionarMembrosElenco(Filme filme, List<Funcionario> funcionarios) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Adicionar membros do elenco (Digite 'FIM' para encerrar):");
	        while (true) {
	            System.out.print("Nome do funcionário: ");
	            String nome = scanner.nextLine();

	            if (nome.equalsIgnoreCase("FIM")) {
	                break;
	            }

	            System.out.print("Papel do funcionário (Ator, Roteirista ou Diretor): ");
	            String papel = scanner.nextLine();

	            try {
	                Funcionario funcionarioEncontrado = null;
	                for (Funcionario funcionario : funcionarios) {
	                    if (funcionario.getNome().equalsIgnoreCase(nome)) {
	                        funcionarioEncontrado = funcionario;
	                        break;
	                    }
	                }

	                if (funcionarioEncontrado != null) {
	                    filme.adicionarElenco(funcionarioEncontrado);
	                    System.out.println(funcionarioEncontrado.getNome() + " adicionado ao elenco.");
	                } else {
	                    throw new IllegalArgumentException("Funcionário não encontrado. Certifique-se de adicioná-lo primeiro.");
	                }
	            } catch (IllegalArgumentException e) {
	                System.out.println(e.getMessage());
	            }
	        }
	    
	    }

	    private static void listarFilmes(List<Filme> filmes) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("\nLista de Filmes:");
	        for (int i = 0; i < filmes.size(); i++) {
	            Filme filme = filmes.get(i);
	            System.out.println((i + 1) + ". " + filme.getNome());
	        }

	        System.out.print("Escolha um filme para exibir ('0' para voltar): ");
	        int escolha = scanner.nextInt();
	        scanner.nextLine(); // Limpar o buffer do scanner

	        if (escolha >= 1 && escolha <= filmes.size()) {
	            Filme filmeEscolhido = filmes.get(escolha - 1);
	            System.out.println("\nFilme: " + filmeEscolhido.getNome());
	            System.out.println("Diretor: " + filmeEscolhido.getDiretor());
	            System.out.println("Roteirista: " + filmeEscolhido.getRoteirista());
	            System.out.println("Ano: " + filmeEscolhido.getAno());
	            System.out.println("Trilha Sonora: " + filmeEscolhido.getTrilhaSonora());

	            System.out.print("\nEscolha o que deseja ver (1 - Atributos, 2 - Elenco, 0 - Voltar): ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine(); // Limpar o buffer do scanner

	            if (opcao == 1) {
	                // Exibir todos os atributos
	                // Você já exibiu todos os atributos acima, não é necessário fazer nada aqui
	            } else if (opcao == 2) {
	                // Exibir o elenco
	                List<Funcionario> elenco = filmeEscolhido.getElenco();
	                System.out.println("\nElenco de " + filmeEscolhido.getNome() + ":");
	                for (Funcionario membro : elenco) {
	                    System.out.println("- " + membro.getNome());
	                }
	            } else {
	                System.out.println("Opção inválida.");
	            }
	        } else if (escolha != 0) {
	            System.out.println("Opção inválida.");
	        }
	    }
}