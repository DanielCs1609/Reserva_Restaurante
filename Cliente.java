import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa implements IGerenciamentoReservas {
    private int idCliente;
    private List<Reserva> reservas;

    public Cliente(String nome, String email, int idCliente) {
        super(nome, email);
        this.idCliente = idCliente;
        this.reservas = new ArrayList<>();
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public void fazerReserva() {
        System.out.println("Reserva feita pelo cliente: " + getNome());
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva cancelada pelo cliente: " + getNome());
    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva confirmada pelo cliente: " + getNome());
    }
}
