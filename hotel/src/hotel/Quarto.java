package hotel;

public class Quarto {
    private int numeroQuarto;
    private String tipoQuarto;
    private double precoPorDia;
    private boolean estaDisponivel;

    public Quarto(int numeroQuarto, String tipoQuarto, double precoPorDia) {
        this.numeroQuarto = numeroQuarto;
        this.tipoQuarto = tipoQuarto;
        this.precoPorDia = precoPorDia;
        this.estaDisponivel = true;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public boolean isDisponivel() {
        return estaDisponivel;
    }

    public void setDisponivel(boolean disponibilidade) {
        this.estaDisponivel = disponibilidade;
    }

    public String toString() {
        return "Quarto " + numeroQuarto + " (" + tipoQuarto + ") - " + (estaDisponivel ? "Disponível" : "Ocupado");
    }
}
