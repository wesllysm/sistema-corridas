public abstract class Motorista {

    private final String nome;
    private final String placaVeiculo;
    private int quantidadeCorridas;
    private double valorBrutoArrecadado;

    protected Motorista(String nome, String placaVeiculo) {
        this.nome = nome;
        this.placaVeiculo = placaVeiculo;
        this.quantidadeCorridas = 0;
        this.valorBrutoArrecadado = 0.0;
    }

    public void registrarCorrida(double valorCorrida) {
        if (valorCorrida <= 0) {
            throw new IllegalArgumentException("O valor da corrida deve ser positivo.");
        }
        quantidadeCorridas++;
        valorBrutoArrecadado += valorCorrida;
    }

    public abstract double calcularPagamentoLiquido();

    public abstract String getCategoria();

    public String getNome() {
        return nome;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBrutoArrecadado() {
        return valorBrutoArrecadado;
    }
}
