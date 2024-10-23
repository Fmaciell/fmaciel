package hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Quarto> listaQuartos;
    private List<Reserva> listaReservas;

    public Hotel() {
        this.listaQuartos = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
    }

    public void adicionarQuarto(int numero, String tipo, double precoDiario) {
        Quarto novoQuarto = new Quarto(numero, tipo, precoDiario);
        listaQuartos.add(novoQuarto);
    }

    public void criarReserva(String hospede, String checkIn, String checkOut, int numeroQuarto) {
        Quarto quartoDisponivel = buscarQuarto(numeroQuarto);
        if (quartoDisponivel != null && quartoDisponivel.isDisponivel()) {
            Reserva novaReserva = new Reserva(hospede, checkIn, checkOut, quartoDisponivel);
            listaReservas.add(novaReserva);
            quartoDisponivel.setDisponivel(false);
            System.out.println("Reserva feita com sucesso.");
        } else {
            System.out.println("Quarto indisponível.");
        }
    }

    public void fazerCheckIn(int numeroQuarto) {
        Quarto quarto = buscarQuarto(numeroQuarto);
        if (quarto != null && quarto.isDisponivel()) {
            quarto.setDisponivel(false);
            System.out.println("Check-in efetuado com sucesso.");
        } else {
            System.out.println("Quarto já está ocupado ou não existe.");
        }
    }

    public void fazerCheckOut(int numeroQuarto) {
        Quarto quarto = buscarQuarto(numeroQuarto);
        if (quarto != null && !quarto.isDisponivel()) {
            quarto.setDisponivel(true);
            System.out.println("Check-out efetuado com sucesso.");
        } else {
            System.out.println("Quarto já está disponível ou não existe.");
        }
    }

    public void relatorioOcupacao() {
        System.out.println("Relatório de Ocupação:");
        for (Quarto quarto : listaQuartos) {
            System.out.println(quarto);
        }
    }

    public void historicoReservas() {
        System.out.println("Histórico de Reservas:");
        for (Reserva reserva : listaReservas) {
            System.out.println(reserva);
        }
    }

    public void listarQuartosDisponiveis() {
        for (Quarto quarto : listaQuartos) {
            if (quarto.isDisponivel()) {
                System.out.println("Quarto " + quarto.getNumeroQuarto() + " - Tipo: " + quarto.getTipoQuarto() + " - Preço por Dia: " + quarto.getPrecoPorDia());
            }
        }
    }

    private Quarto buscarQuarto(int numero) {
        for (Quarto quarto : listaQuartos) {
            if (quarto.getNumeroQuarto() == numero) {
                return quarto;
            }
        }
        return null;
    }

	public void cadastrarQuarto(int numero, String tipo, double precoDiario) {
		
	}
}
