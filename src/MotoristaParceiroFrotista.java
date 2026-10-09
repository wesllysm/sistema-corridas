public class MotoristaParceiroFrotista extends Motorista {

    private static final double PERCENTUAL_REPASSE = 0.80;
    private static final double ALUGUEL_VEICULO = 800.00;
    private static final double PAGAMENTO_MINIMO = 0.0;

    public MotoristaParceiroFrotista(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBrutoArrecadado() * PERCENTUAL_REPASSE - ALUGUEL_VEICULO;
        return Math.max(pagamentoLiquido, PAGAMENTO_MINIMO);
    }

    @Override
    public String getCategoria() {
        return "Parceiro Frotista";
    }
}
