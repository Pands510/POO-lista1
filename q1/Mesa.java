public class Mesa {

    int numeroMesa;
    int quantidadePessoas;

    double totalComidaKg;
    int qtdSobremesas;
    int qtdRefrigertante;
    int qtdCervejas;

    final double PRECO_KG = 30.0;
    final double PRECO_SOBREMESA = 6.0;
    final double PRECO_REFRIGERANTE = 5.0;
    final double PRECO_CERVEJA = 10.0;

    void abrirPedido(int numeroMesa, int pessoas) {
        this.numeroMesa = numeroMesa;
        this.quantidadePessoas = pessoas;
    }
    void adicionarPessoa(int qtd) {
        this.quantidadePessoas += qtd;
    }

    void adicionarComida(double kg) {
        this.totalComidaKg += kg;
    }

    void adicionarSobremesa(int qtd) {
        this.qtdSobremesas += qtd;
    }

    void adicionarRefrigerante(int qtd) {
        this.qtdRefrigertante += qtd;
    }

    void adicionarCerveja(int qtd) {
        this.qtdCervejas += qtd;
    }

    double calcularTotal() {
        double total = 0;

        total += totalComidaKg * PRECO_KG;
        total += qtdSobremesas * PRECO_SOBREMESA;
        total += qtdRefrigertante * PRECO_REFRIGERANTE;
        total += qtdCervejas * PRECO_CERVEJA;

        return total;
    }

    double calcularPorPessoa() {
        return calcularTotal() / quantidadePessoas;
    }

    void emitirNota() {
        System.out.println("Mesa: " + numeroMesa);
        System.out.println("Total: " + calcularTotal());
        System.out.println("Por pessoa: " + calcularPorPessoa());
    }
}