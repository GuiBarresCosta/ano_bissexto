package bissexto;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um ano");
		float ano = teclado.nextFloat();
		System.out.println(verificar(ano));
		teclado.close();
	}
	
		private static String verificar(float ano) {
		if (ano % 400 == 0) {
			return "é bissexto";
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			return "é bissexto";
		} else {
			return "não é bissexto";
		}
		}
	}
