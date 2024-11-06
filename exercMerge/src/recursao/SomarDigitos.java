package recursao;

public class SomarDigitos {
    // EXERC 5
    public static int somarDigitos(int numero) {

        String numeroStr = Integer.toString(numero);

        return somarDigitosAux(numeroStr);
    }

    public static int somarDigitosAux(String numero) {
        if (numero.isEmpty()) {
            return 0;
        }
        int digito = Integer.parseInt(numero.substring(0, 1));

        return digito + somarDigitosAux(numero.substring(1));
    }

}
