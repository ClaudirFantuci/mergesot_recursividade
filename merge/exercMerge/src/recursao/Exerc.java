package recursao;

public class Exerc {
    // EXERC 1
    private static boolean palindromo(String s, int inicio, int fim) {

        if (inicio >= fim) {
            return true;
        }

        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }

        return palindromo(s, inicio + 1, fim - 1);
    }

    // EXERC 2
    public static int somaArray(int[] array, int indice) {
        if (indice == array.length) {
            return 0;
        }
        return array[indice] + somaArray(array, indice + 1);
    }

    // EXERC 3
    public static int contarLetra(char letra, String palavra, int i) {

        if (i >= palavra.length()) {
            return 0;
        }

        if (palavra.charAt(i) != letra) {
            return 0 + contarLetra(letra, palavra, i + 1);
        }

        return 1 + contarLetra(letra, palavra, i + 1);
    }

    // EXERC 4
    public static int fibonacci(int n) {

        if (n < 2) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

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

    // EXERC 6
    public static String inverterString(String palavra) {

        if (palavra.isEmpty() || palavra.length() == 1) {
            return palavra;
        }

        return palavra.charAt(palavra.length() - 1) + inverterString(palavra.substring(0, palavra.length() - 1));
    }
}
