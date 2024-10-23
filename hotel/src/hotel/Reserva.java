package hotel;

public class Reserva {
    private String nomeHospede;
    private String checkIn;
    private String checkOut;
    private Quarto quartoReservado;

    public Reserva(String nomeHospede, String checkIn, String checkOut, Quarto quartoReservado) {
        this.nomeHospede = nomeHospede;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.quartoReservado = quartoReservado;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public Quarto getQuartoReservado() {
        return quartoReservado;
    }
    public String toString() {
        return "Reserva de " + nomeHospede + " - Check-in: " + checkIn + ", Check-out: " + checkOut + ", Quarto: " + quartoReservado.getNumeroQuarto();
    }
}

