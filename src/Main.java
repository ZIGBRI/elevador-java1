public class Main {
    public static void main(String[] args) {

        elevador elevador = new elevador(5);

        elevador.abrirPorta();
        elevador.subir(); // não pode subir com porta aberta
        elevador.fecharPorta();

        elevador.subir();
        elevador.subir();

        elevador.abrirPorta();
        elevador.descer(); // não pode descer com porta aberta

        elevador.fecharPorta();
        elevador.descer();

        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Porta aberta? " + elevador.isPortaAberta());
    }
}