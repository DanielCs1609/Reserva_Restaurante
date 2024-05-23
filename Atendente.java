public class Atendente extends Pessoa {
    private int idAtendente;

    public Atendente(String nome, String email, int idAtendente) {
        super(nome, email);
        this.idAtendente = idAtendente;
    }

    public int getIdAtendente() {
        return idAtendente;
    }

    public void setIdAtendente(int idAtendente) {
        this.idAtendente = idAtendente;
    }

    public void gerenciarReservas() {
        System.out.println("Atendente " + getNome() + " está gerenciando as reservas.");
    }
}
