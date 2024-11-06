package recursao;

public class Palindromo {
	private static boolean palindromo(String s, int inicio, int fim) {

		if (inicio >= fim) {
			return true;
		}

		if (s.charAt(inicio) != s.charAt(fim)) {
			return false;
		}

		return palindromo(s, inicio + 1, fim - 1);
	}
}
