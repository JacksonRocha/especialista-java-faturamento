package jackson.rocha;

import jackson.rocha.fiscal.GestorFiscal;
import jackson.rocha.fiscal.NotaFiscalProduto;
import jackson.rocha.fiscal.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {
        var gestorFiscal = new GestorFiscal();
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 1100, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);

//        System.out.println(nfBolaFutebol.calcularImposto());
//        System.out.println(nfReparoMotor.calcularImposto());
    }
}
