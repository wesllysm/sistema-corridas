public class MotoristaPremium extends Motorista {

    private static final double PERCENTUAL_REPASSE = 0.85;
    private static final double BONUS_POR_CORRIDA = 2.00;

    public MotoristaPremium(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public void registrarCorrida(double valorCorrida) {
        super.registrarCorrida(valorCorrida + BONUS_POR_CORRIDA);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBrutoArrecadado() * PERCENTUAL_REPASSE;
    }

    @Override
    public String getCategoria() {
        return "Premium";
    }
}
