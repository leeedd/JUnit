package testeAlgoritimo;

import static org.junit.Assert.*;
import javax.swing.JOptionPane;

import java.util.Scanner;

import javax.swing.JOptionPane;

import org.junit.Test;

public class Teste02 {

	@Test
	public void test02() {

		for (int i = 1; i <= 10; i++) {

			System.out.println(i);

		}

	}

	@Test
	public void test03() {

		int a;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero qualquer");
		a = entrada.nextInt();

		for (int i = 1; i <= a; i++) {

			System.out.println(i);

		}

	}

	@Test
	public void test04() {

		int a;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Pense em um n�mero de 1 a 100 e digite este n�mero");
		a = entrada.nextInt();

		if ((a < 0) || (a > 100)) {

			JOptionPane.showMessageDialog(null, "Valor digitado incorreto, por favor tente novamente!");

			System.exit(0);

		} else if ((a >= 0) && (a <= 100)) {

			JOptionPane.showMessageDialog(null, "O n�mero que voc� esta pensando � " + a);

		}

	}

	@Test
	public void test() {

		int a;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		a = entrada.nextInt();

		if (a <= 10) {

			System.out.println("Valor menor ou igual a 10");

		} else {
			System.out.println("Valor maior do que 10");
		}

	}

	@Test
	public void test05() {

		int a;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero qualquer e verifique se ele � par ou impar");
		a = entrada.nextInt();

		if (a % 2 == 0) {

			System.out.println("O n�mero " + a + " digitado � par!");

		} else {

			System.out.println("O n�mero " + a + " digitado � impar!");
		}

	}

}
