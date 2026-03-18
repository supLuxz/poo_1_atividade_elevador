public class elevador {
    private int andarAtual;
    private final int totalAndares;
    private boolean portaAberta;

    public elevador(int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.portaAberta = false;
    }

    public void abrirPorta() {
        this.portaAberta = true;
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        this.portaAberta = false;
        System.out.println("Porta fechada.");
    }

    public void subir() {
        if (portaAberta) {
            System.out.println("Não pode subir com a porta aberta!");
            return;
        }
        if (andarAtual < totalAndares) {
            andarAtual++;
            System.out.println("Subindo, Andar atual: " + andarAtual);
        } else {
            System.out.println("Já está no último andar!");
        }
    }

    public void descer() {
        if (portaAberta) {
            System.out.println("Não pode descer com a porta aberta!");
            return;
        }
        if (andarAtual > 0) {
            andarAtual--;
            System.out.println("Descendo, Andar atual: " + andarAtual);
        } else {
            System.out.println("Já está no térreo!");
        }
    }

    public void mostrarStatus() {
        String estadoPorta = portaAberta ? "Aberta" : "Fechada";
        System.out.println("--- STATUS: Andar: " + andarAtual + " | Porta: " + estadoPorta + " ---");
    }
}

