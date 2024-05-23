import java.util.Date;

public class Reserva implements IGerenciamentoReservas {
    private int idReserva;
    private Mesa mesa;
    private Date data;
    private Date hora;
    private Cliente cliente;

    public Reserva(int idReserva, Mesa mesa, Date data, Date hora, Cliente cliente) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.data = data;
        this.hora = hora;
        this.cliente = cliente;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void fazerReserva() {
        System.out.println("Reserva " + idReserva + " feita para a mesa " + mesa.getNumeroMesa() + " na data " + data);
    }

    @Override
    public void cancelarReserva() {
        System.out.println("Reserva " + idReserva + " cancelada para a mesa " + mesa.getNumeroMesa());
    }

    @Override
    public void confirmarReserva() {
        System.out.println("Reserva " + idReserva + " confirmada para a mesa " + mesa.getNumeroMesa());
    }
}
