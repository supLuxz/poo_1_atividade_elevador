public class Main {
    public static void main(String[] args) {
        elevador meuElevador = new elevador(5);

        meuElevador.mostrarStatus();
        meuElevador.abrirPorta();

        meuElevador.subir();

        meuElevador.fecharPorta();
        meuElevador.subir();
        meuElevador.subir();
        meuElevador.mostrarStatus();
    }
}