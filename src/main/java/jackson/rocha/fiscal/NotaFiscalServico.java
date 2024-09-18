package jackson.rocha.fiscal;

public class NotaFiscalServico extends NotaFiscal {

    public static final double VALOR_MAXIMO_INSENCAO_FISCAL = 1000;
    public static final double ALICOTA_IMPOSTOS = 0.18;

    private boolean intermunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean intermunicipal) {
        super(descricao, valorTotal);
        this.intermunicipal = intermunicipal;
    }

    public boolean isIntermunicipal() {
        return intermunicipal;
    }

    @Override
    public double calcularImposto() {
        double valorImpostos = getValorTotal() * ALICOTA_IMPOSTOS;

        if (isIsentoImpostos()) {
            valorImpostos = 0;
        }

        return valorImpostos;
    }

    private boolean isIsentoImpostos() {
        return isIntermunicipal() && getValorTotal() <= VALOR_MAXIMO_INSENCAO_FISCAL;
    }
}
