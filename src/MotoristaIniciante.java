public class MotoristaIniciante extends Motorista {

    private static final double PERCENTUAL_REPASSE = 0.75;
    private static final int MINIMO_CORRIDAS_MENSAIS = 5;
    private static final double TAXA_INATIVIDADE = 50.00;

    public MotoristaIniciante(String nome, String placaVeiculo) {
        super(nome, placaVeiculo);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamentoLiquido = getValorBrutoArrecadado() * PERCENTUAL_REPASSE;

        if (estaAbaixoDoMinimoDeCorridas()) {
            pagamentoLiquido -= TAXA_INATIVIDADE;
        }
        return pagamentoLiquido;
    }

    private boolean estaAbaixoDoMinimoDeCorridas() {
        return getQuantidadeCorridas() < MINIMO_CORRIDAS_MENSAIS;
    }

    @Override
    public String getCategoria() {
        return "Iniciante";
    }
}
