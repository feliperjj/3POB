package Av2Pob;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<Quarto> quartos = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();
    private static List<Cama> camas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean executando = true;
        while (executando) {
            mostrarMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner após ler um número

            switch (opcao) {
                
            case 1:
                    adicionarCliente(scanner);
                    break;
                
                case 2:
                    listarClientes();
                    break;
                
                case 3:
                	alterarCliente(scanner);
                    break;
                
                case 4:
                	excluirCliente(scanner);
                
                case 5:
                	adicionarQuarto(scanner);
                
                case 6:
                	listarQuartos();
                
                case 7:
                	alterarQuarto(scanner);
                
                case 8:
                	excluirQuarto(scanner);
                
                case 9:
                	adicionarCama(scanner);
                
                case 10:
                	listarCamas();
                
                case 11:
                	alterarCama(scanner);
                
                case 12:
                	excluirCama(scanner);
                
                case 13:
                	adicionarReserva(scanner);
                
                case 14:
                	alterarReserva(scanner);
                
                case 15:
                	listarReservas();
                	
                case 16:
                	excluirReserva(scanner);
                case 17:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nSistema de Reservas do Albergue");
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Alterar Cliente");
        System.out.println("4. Excluir Clientes");
        System.out.println("5. Adicionar Quarto");
        System.out.println("6. Listar Quartos");
        System.out.println("7. Alterar Quarto");
        System.out.println("8. Excluir Quartos");
        System.out.println("9. Adicionar Cama");
        System.out.println("10. Listar Camas");
        System.out.println("11. Alterar Cama");
        System.out.println("12. Excluir Camas");
        System.out.println("13. Adicionar Reserva");
        System.out.println("14.Alterar Reserva");
        System.out.println("15. Listar Reserva");
        System.out.println("16. Excluir Reserva");
        
        System.out.println("17. Sair");
        // Adicionar mais opções para Quartos, Camas e Reservas
       
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarCliente(Scanner scanner) {
    	System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Código Postal: ");
        String postalCode = scanner.nextLine();

        System.out.print("País: ");
        String pais = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Passaporte: ");
        String passaporte = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Data de Nascimento: ");
        String dataNascimento = scanner.nextLine();

        Cliente novoCliente = new Cliente(id, nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento);
        clientes.add(novoCliente);

        System.out.println("Cliente adicionado com sucesso!");
    }
    

private static void listarClientes() {
    if (clientes.isEmpty()) {
        System.out.println("Não há clientes cadastrados.");
    } else {
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome() +
                               ", Endereço: " + cliente.getEndereco() + ", Código Postal: " + cliente.getPostalCode() +
                               ", País: " + cliente.getPais() + ", CPF: " + cliente.getCpf() +
                               ", Passaporte: " + cliente.getPassaporte() + ", Email: " + cliente.getEmail() +
                               ", Data de Nascimento: " + cliente.getDataNascimento());
        }
    }
}

private static void alterarCliente(Scanner scanner) {
    System.out.print("Digite o ID do cliente que deseja alterar: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer do scanner

    for (Cliente cliente : clientes) {
        if (cliente.getId() == id) {
            System.out.print("Novo nome (deixe em branco para não alterar): ");
            String novoNome = scanner.nextLine();
            if (!novoNome.isEmpty()) {
                cliente.setNome(novoNome);
            }

            System.out.print("Novo endereço (deixe em branco para não alterar): ");
            String novoEndereco = scanner.nextLine();
            if (!novoEndereco.isEmpty()) {
                cliente.setEndereco(novoEndereco);
            }

            System.out.print("Novo código postal (deixe em branco para não alterar): ");
            String novoPostalCode = scanner.nextLine();
            if (!novoPostalCode.isEmpty()) {
                cliente.setPostalCode(novoPostalCode);
            }

            System.out.print("Novo país (deixe em branco para não alterar): ");
            String novoPais = scanner.nextLine();
            if (!novoPais.isEmpty()) {
                cliente.setPais(novoPais);
            }

            System.out.print("Novo CPF (deixe em branco para não alterar): ");
            String novoCpf = scanner.nextLine();
            if (!novoCpf.isEmpty()) {
                cliente.setCpf(novoCpf);
            }

            System.out.print("Novo número de passaporte (deixe em branco para não alterar): ");
            String novoPassaporte = scanner.nextLine();
            if (!novoPassaporte.isEmpty()) {
                cliente.setPassaporte(novoPassaporte);
            }

            System.out.print("Novo email (deixe em branco para não alterar): ");
            String novoEmail = scanner.nextLine();
            if (!novoEmail.isEmpty()) {
                cliente.setEmail(novoEmail);
            }

            System.out.print("Nova data de nascimento (deixe em branco para não alterar): ");
            String novaDataNascimento = scanner.nextLine();
            if (!novaDataNascimento.isEmpty()) {
                cliente.setDataNascimento(novaDataNascimento);
            }

            System.out.println("Cliente atualizado com sucesso!");
            return;
        }
    }
    System.out.println("Cliente não encontrado.");
}




private static void excluirCliente(Scanner scanner) {
    System.out.print("Digite o ID do cliente que deseja excluir: ");
    int id = scanner.nextInt();

    if (clientes.removeIf(cliente -> cliente.getId() == id)) {
        System.out.println("Cliente removido com sucesso.");
    } else {
        System.out.println("Cliente não encontrado.");
    }
}

  private static void adicionarQuarto(Scanner scanner) {
    System.out.print("ID do Quarto: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer do scanner

    System.out.print("Nome do Quarto: ");
    String nomeQuarto = scanner.nextLine();

    System.out.print("Quantidade de Camas: ");
    int qtdeCamas = scanner.nextInt();

    System.out.print("O quarto tem banheiro? (true/false): ");
    boolean temBanheiro = scanner.nextBoolean();

    System.out.print("Descrição do Quarto: ");
    scanner.nextLine(); // Limpa o buffer do scanner
    String descricao = scanner.nextLine();

    Quarto novoQuarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
    quartos.add(novoQuarto);

    System.out.println("Quarto adicionado com sucesso!");
}
 private static void listarQuartos() {
    if (quartos.isEmpty()) {
        System.out.println("Não há quartos cadastrados.");
    } else {
        for (Quarto quarto : quartos) {
            System.out.println("ID: " + quarto.getId() + ", Nome: " + quarto.getNomeQuarto() +
                               ", Qtd. Camas: " + quarto.getQtdeCamas() + ", Banheiro: " + quarto.isTemBanheiro() +
                               ", Descrição: " + quarto.getDescricao());
        }
    }
}
 
 
 private static void alterarQuarto(Scanner scanner) {
	    System.out.print("Digite o ID do quarto que deseja alterar: ");
	    int id = scanner.nextInt();
	    scanner.nextLine();

	    for (Quarto quarto : quartos) {
	        if (quarto.getId() == id) {
	            System.out.print("Novo nome do quarto (deixe em branco para não alterar): ");
	            String novoNome = scanner.nextLine();
	            if (!novoNome.isEmpty()) {
	                quarto.setNomeQuarto(novoNome);
	            }

	            System.out.print("Nova quantidade de camas (deixe 0 para não alterar): ");
	            int qtdeCamas = scanner.nextInt();
	            if (qtdeCamas != 0) {
	                quarto.setQtdeCamas(qtdeCamas);
	            }
	            scanner.nextLine();

	            System.out.print("O quarto tem banheiro? (true/false, deixe em branco para não alterar): ");
	            String temBanheiroStr = scanner.nextLine();
	            if (!temBanheiroStr.isEmpty()) {
	                boolean temBanheiro = Boolean.parseBoolean(temBanheiroStr);
	                quarto.setTemBanheiro(temBanheiro);
	            }

	            System.out.print("Nova descrição do quarto (deixe em branco para não alterar): ");
	            String descricao = scanner.nextLine();
	            if (!descricao.isEmpty()) {
	                quarto.setDescricao(descricao);
	            }

	            System.out.println("Quarto atualizado com sucesso!");
	            return;
	        }
	    }
	    System.out.println("Quarto não encontrado.");
	}
 
 private static void excluirQuarto(Scanner scanner) {
	    System.out.print("Digite o ID do quarto que deseja excluir: ");
	    int id = scanner.nextInt();

	    if (quartos.removeIf(quarto -> quarto.getId() == id)) {
	        System.out.println("Quarto removido com sucesso.");
	    } else {
	        System.out.println("Quarto não encontrado.");
	    }
	}
 private static void adicionarCama(Scanner scanner) {
	    System.out.print("ID da Cama: ");
	    int id = scanner.nextInt();
	    scanner.nextLine(); // Limpa o buffer do scanner

	    System.out.print("Código da Cama: ");
	    String codigoCama = scanner.nextLine();

	    System.out.print("É beliche? (true/false): ");
	    boolean ehBeliche = scanner.nextBoolean();

	    System.out.print("Posição da Cama: ");
	    scanner.nextLine(); // Limpa o buffer do scanner
	    String posicao = scanner.nextLine();

	    System.out.print("Descrição da Cama: ");
	    String descricao = scanner.nextLine();

	    Cama novaCama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);
	    camas.add(novaCama);

	    System.out.println("Cama adicionada com sucesso!");
	}

 private static void listarCamas() {
	    if (camas.isEmpty()) {
	        System.out.println("Não há camas cadastradas.");
	    } else {
	        for (Cama cama : camas) {
	            System.out.println("ID: " + cama.getId() + ", Código: " + cama.getCodigoCama() +
	                               ", Beliche: " + cama.isEhBeliche() + ", Posição: " + cama.getPosicao() +
	                               ", Descrição: " + cama.getDescricao());
	        }
	    }
	}
 private static void alterarCama(Scanner scanner) {
	    System.out.print("Digite o ID da cama que deseja alterar: ");
	    int id = scanner.nextInt();
	    scanner.nextLine(); // Limpa o buffer do scanner

	    for (Cama cama : camas) {
	        if (cama.getId() == id) {
	            System.out.print("Novo código da cama (deixe em branco para não alterar): ");
	            String novoCodigo = scanner.nextLine();
	            if (!novoCodigo.isEmpty()) {
	                cama.setCodigoCama(novoCodigo);
	            }

	            System.out.print("A cama é beliche? (true/false, deixe em branco para não alterar): ");
	            String ehBelicheStr = scanner.nextLine();
	            if (!ehBelicheStr.isEmpty()) {
	                boolean ehBeliche = Boolean.parseBoolean(ehBelicheStr);
	                cama.setEhBeliche(ehBeliche);
	            }

	            System.out.print("Nova posição da cama (deixe em branco para não alterar): ");
	            String novaPosicao = scanner.nextLine();
	            if (!novaPosicao.isEmpty()) {
	                cama.setPosicao(novaPosicao);
	            }

	            System.out.print("Nova descrição da cama (deixe em branco para não alterar): ");
	            String novaDescricao = scanner.nextLine();
	            if (!novaDescricao.isEmpty()) {
	                cama.setDescricao(novaDescricao);
	            }

	            System.out.println("Cama atualizada com sucesso!");
	            return;
	        }
	    }
	    System.out.println("Cama não encontrada.");
	}

 	
 private static void excluirCama(Scanner scanner) {
	    System.out.print("Digite o ID da cama que deseja excluir: ");
	    int id = scanner.nextInt();

	    if (camas.removeIf(cama -> cama.getId() == id)) {
	        System.out.println("Cama removida com sucesso.");
	    } else {
	        System.out.println("Cama não encontrada.");
	    }
	}



private static void adicionarReserva(Scanner scanner) {
    System.out.print("ID da Reserva: ");
    int id = scanner.nextInt();
    scanner.nextLine(); // Limpa o buffer do scanner

    System.out.print("ID do Cliente: ");
    int idCliente = scanner.nextInt();
    scanner.nextLine();

    System.out.print("ID do Quarto: ");
    int idQuarto = scanner.nextInt();
    scanner.nextLine();

    System.out.print("ID da Cama: ");
    int idCama = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Data de Entrada (dd/mm/yyyy): ");
    String dataEntrada = scanner.nextLine();

    System.out.print("Data de Saída (dd/mm/yyyy): ");
    String dataSaida = scanner.nextLine();

    Reserva novaReserva = new Reserva(id, idCliente, idQuarto, idCama, dataEntrada, dataSaida);
    reservas.add(novaReserva);
    System.out.println("Reserva adicionada com sucesso!");
}

private static void alterarReserva(Scanner scanner) {
    System.out.print("Digite o ID da reserva que deseja alterar: ");
    int id = scanner.nextInt();
    scanner.nextLine();

    for (Reserva reserva : reservas) {
        if (reserva.getId() == id) {
            System.out.print("Novo ID do Cliente (deixe em branco para não alterar): ");
            String novoIdCliente = scanner.nextLine();
            if (!novoIdCliente.isEmpty()) {
                reserva.setIdCliente(Integer.parseInt(novoIdCliente));
            }

            System.out.print("Novo ID do Quarto (deixe em branco para não alterar): ");
            String novoIdQuarto = scanner.nextLine();
            if (!novoIdQuarto.isEmpty()) {
                reserva.setIdQuarto(Integer.parseInt(novoIdQuarto));
            }

            System.out.print("Nova Data de Entrada (dd/mm/yyyy, deixe em branco para não alterar): ");
            String novaDataEntrada = scanner.nextLine();
            if (!novaDataEntrada.isEmpty()) {
                reserva.setDataEntrada(novaDataEntrada);
            }

            System.out.print("Nova Data de Saída (dd/mm/yyyy, deixe em branco para não alterar): ");
            String novaDataSaida = scanner.nextLine();
            if (!novaDataSaida.isEmpty()) {
                reserva.setDataSaida(novaDataSaida);
            }

            System.out.println("Reserva atualizada com sucesso!");
            return;
        }
    }
    System.out.println("Reserva não encontrada.");
}
private static void excluirReserva(Scanner scanner) {
    System.out.print("Digite o ID da reserva que deseja excluir: ");
    int id = scanner.nextInt();

    if (reservas.removeIf(reserva -> reserva.getId() == id)) {
        System.out.println("Reserva removida com sucesso.");
    } else {
        System.out.println("Reserva não encontrada.");
    }
}
private static void listarReservas() {
    if (reservas.isEmpty()) {
        System.out.println("Não há reservas cadastradas.");
    } else {
        for (Reserva reserva : reservas) {
            System.out.println("ID da Reserva: " + reserva.getId() + ", ID do Cliente: " + reserva.getIdCliente() +
                               ", ID do Quarto: " + reserva.getIdQuarto() + ", ID da Cama: " + reserva.getIdCama() +
                               ", Data de Entrada: " + reserva.getDataEntrada() + ", Data de Saída: " + reserva.getDataSaida());
        }
    }
}
}