package recursao;

public class InverterString {
    // EXERC 6
    public static String inverterString(String palavra) {

        if (palavra.isEmpty() || palavra.length() == 1) {
            return palavra;
        }

        return palavra.charAt(palavra.length() - 1) + inverterString(palavra.substring(0, palavra.length() - 1));
    }
}
