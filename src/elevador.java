public class elevador {

    private int andarAtual;
    private int totalAndares;
    private boolean portaAberta;

    // Construtor
    public elevador(int totalAndares) {
        this.totalAndares = totalAndares;
        this.andarAtual = 0; // térreo
        this.portaAberta = false;
    }

    // Abrir porta
    public void abrirPorta() {
        if (!portaAberta) {
            portaAberta = true;
            System.out.println("Porta aberta.");
        } else {
            System.out.println("A porta já está aberta.");
        }
    }

    // Fechar porta
    public void fecharPorta() {
        if (portaAberta) {
            portaAberta = false;
            System.out.println("Porta fechada.");
        } else {
            System.out.println("A porta já está fechada.");
        }
    }

    // Subir
    public void subir() {
        if (portaAberta) {
            System.out.println("Não é possível subir com a porta aberta.");
        } else if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subiu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    // Descer
    public void descer() {
        if (portaAberta) {
            System.out.println("Não é possível descer com a porta aberta.");
        } else if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Desceu para o andar: " + andarAtual);
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    // Mostrar andar atual
    public int getAndarAtual() {
        return andarAtual;
    }

    // Verificar estado da porta
    public boolean isPortaAberta() {
        return portaAberta;
    }
}