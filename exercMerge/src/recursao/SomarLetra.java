package recursao;

public class SomarLetra {
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
}
