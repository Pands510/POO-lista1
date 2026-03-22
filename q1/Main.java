public class Main {
    public static void main(String[] args) {

        Mesa mesa = new Mesa();

        mesa.abrirPedido(1, 2);

        mesa.adicionarComida(1.5);
        mesa.adicionarCerveja(2);
        mesa.adicionarRefrigerante(1);

        mesa.adicionarPessoa(1);

        mesa.adicionarSobremesa(3);

        mesa.emitirNota();
    }
}