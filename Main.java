import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente("João Silva", "joao@example.com", 1);
        
        // Criando um atendente
        Atendente atendente = new Atendente("Maria Souza", "maria@example.com", 101);

        // Criando mesas
        Mesa mesa1 = new Mesa(1, 4);
        Mesa mesa2 = new Mesa(2, 2);

        // Verificando a disponibilidade da mesa
        if (mesa1.disponibilidade()) {
            System.out.println("Mesa " + mesa1.getNumeroMesa() + " está disponível.");
        }

        // Criando uma reserva
        Date dataReserva = new Date(); // Usando a data atual para simplificação
        Reserva reserva = new Reserva(1001, mesa1, dataReserva, dataReserva, cliente);

        // Adicionando a reserva ao cliente
        cliente.getReservas().add(reserva);

        // Confirmando a reserva
        reserva.confirmarReserva();
        System.out.println("Reserva confirmada para o cliente: " + reserva.getCliente().getNome());

        // Cancelando a reserva
        reserva.cancelarReserva();
        System.out.println("Reserva cancelada para o cliente: " + reserva.getCliente().getNome());

        // Atendente gerenciando reservas
        atendente.gerenciarReservas();
    }
}
