package jackson.rocha.fiscal;

public abstract class NotaFiscal {

    public String descricao;
    public double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public abstract double calcularImposto();

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para %s%n", getDescricao());
        System.out.printf("Valor total: R$ %.2f%n", getValorTotal());
        System.out.printf("Impostos: %.2f%n", calcularImposto());
    }
}
