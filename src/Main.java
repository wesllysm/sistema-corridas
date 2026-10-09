import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Main {

    private static final NumberFormat FORMATO_REAL =
            NumberFormat.getCurrencyInstance(Locale.forLanguageTag("pt-BR"));

    public static void main(String[] args) {
        Motorista iniciante = new MotoristaIniciante("Ana Souza", "ABC1D23");
        Motorista premium = new MotoristaPremium("Bruno Lima", "XYZ9K87");
        Motorista frotistaComLucro = new MotoristaParceiroFrotista("Carla Mendes", "QWE4R56");
        Motorista frotistaSemLucro = new MotoristaParceiroFrotista("Diego Rocha", "JKL7M89");

        registrarCorridas(iniciante, 30.00, 45.50, 22.00);
        registrarCorridas(premium, 50.00, 80.00, 35.00, 60.00, 42.50);
        registrarCorridas(frotistaComLucro, 120.00, 250.00, 300.00, 180.00, 210.00);
        registrarCorridas(frotistaSemLucro, 40.00, 55.00);

        List<Motorista> motoristas = List.of(iniciante, premium, frotistaComLucro, frotistaSemLucro);
        for (Motorista motorista : motoristas) {
            imprimirExtrato(motorista);
        }
    }

    private static void registrarCorridas(Motorista motorista, double... valoresCorridas) {
        for (double valorCorrida : valoresCorridas) {
            motorista.registrarCorrida(valorCorrida);
        }
    }

    private static void imprimirExtrato(Motorista motorista) {
        System.out.println("==========================================");
        System.out.println("        EXTRATO MENSAL DO MOTORISTA       ");
        System.out.println("==========================================");
        System.out.println("Nome:              " + motorista.getNome());
        System.out.println("Categoria:         " + motorista.getCategoria());
        System.out.println("Placa:             " + motorista.getPlacaVeiculo());
        System.out.println("Corridas no mês:   " + motorista.getQuantidadeCorridas());
        System.out.println("Valor bruto:       " + formatarMoeda(motorista.getValorBrutoArrecadado()));
        System.out.println("Líquido a receber: " + formatarMoeda(motorista.calcularPagamentoLiquido()));
        System.out.println();
    }

    private static String formatarMoeda(double valor) {
        return FORMATO_REAL.format(valor);
    }
}
