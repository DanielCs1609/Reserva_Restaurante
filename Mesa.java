public class Mesa {
    private int numeroMesa;
    private int capacidade;

    public Mesa(int numeroMesa, int capacidade) {
        this.numeroMesa = numeroMesa;
        this.capacidade = capacidade;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean disponibilidade() {
        // Implementação do método para verificar disponibilidade da mesa
        return true; // Retorno fictício para fins de exemplo
    }
}
