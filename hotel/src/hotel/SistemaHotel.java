package hotel;

import java.util.Scanner;

public class SistemaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = obterOpcao(scanner);

            switch (opcao) {
                case 1:
                    cadastrarQuarto(scanner, hotel);
                    break;
                case 2:
                    cadastrarReserva(scanner, hotel);
                    break;
                case 3:
                    realizarCheckIn(scanner, hotel);
                    break;
                case 4:
                    realizarCheckOut(scanner, hotel);
                    break;
                case 5:
                    hotel.relatorioOcupacao();
                    break;
                case 6:
                    hotel.historicoReservas();
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n=== Sistema de Gerenciamento de Hotel ===");
        System.out.println("1. Cadastrar Quarto");
        System.out.println("2. Cadastrar Reserva");
        System.out.println("3. Realizar Check-in");
        System.out.println("4. Realizar Check-out");
        System.out.println("5. Gerar Relatório de Ocupação");
        System.out.println("6. Gerar Histórico de Reservas");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static int obterOpcao(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void cadastrarQuarto(Scanner scanner, Hotel hotel) {
        System.out.print("Número do Quarto: ");
        int numero = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Tipo de Quarto (Solteiro, Casal, Suíte): ");
        String tipo = scanner.nextLine();
        System.out.print("Preço Diário: ");
        double precoDiario = scanner.nextDouble();
        
        hotel.cadastrarQuarto(numero, tipo, precoDiario);
        System.out.println("Quarto cadastrado com sucesso!");
    }

    private static void cadastrarReserva(Scanner scanner, Hotel hotel) {
        System.out.print("Nome do Hóspede: ");
        String hospede = scanner.nextLine();
        System.out.print("Data de Check-in (DD/MM/AAAA): ");
        String checkIn = scanner.nextLine();
        System.out.print("Data de Check-out (DD/MM/AAAA): ");
        String checkOut = scanner.nextLine();

        System.out.println("Quartos disponíveis para reserva:");
        hotel.listarQuartosDisponiveis();

        System.out.print("Número do Quarto para Reservar: ");
        int numQuarto = scanner.nextInt();
        
        hotel.criarReserva(hospede, checkIn, checkOut, numQuarto);
        System.out.println("Reserva realizada com sucesso!");
    }

    private static void realizarCheckIn(Scanner scanner, Hotel hotel) {
        System.out.print("Número do Quarto para Check-in: ");
        int numeroQuarto = scanner.nextInt();
        hotel.fazerCheckIn(numeroQuarto);
        System.out.println("Check-in realizado com sucesso!");
    }

    private static void realizarCheckOut(Scanner scanner, Hotel hotel) {
        System.out.print("Número do Quarto para Check-out: ");
        int numeroQuarto = scanner.nextInt();
        hotel.fazerCheckOut(numeroQuarto);
        System.out.println("Check-out realizado com sucesso!");
    }
}

