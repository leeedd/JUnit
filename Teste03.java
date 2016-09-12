package testeAlgoritimo;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class Teste03 {

	@Test
	public void test01() {

		Scanner entrada = new Scanner(System.in);
		String nome;

		System.out.println("Digite o seu nome:");
		nome = entrada.next();

	}

	@Test
	public void test02() {

		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.println("Digite sua idade");
		idade = entrada.nextInt();

		if ((idade < 0) && (idade > 200)) {

			System.out.println("Idade digitada incorreta, por favor verifique!");
			System.exit(0);

		}

	}

	@Test
	public void test03() {

		Scanner entrada = new Scanner(System.in);

		int mesDeNascimento;

		System.out.println("Em qual m�s voc� nasceu?");
		mesDeNascimento = entrada.nextInt();

		if ((mesDeNascimento < 1) || (mesDeNascimento > 12)) {

			System.out.println("M�s digitado inv�lido, por favor verifique!");
			System.exit(0);

		}
	}

	@Test
	public void test04() {

		Scanner entrada = new Scanner(System.in);

		int kgs;

		System.out.println("Quantos KGs voc� pesa?");
		kgs = entrada.nextInt();

	}

	@Test
	public void test05() {

		Scanner entrada = new Scanner(System.in);

		int advinhaIdade;
		int anoReferente;

		System.out.println("Qual o ano de nascimento?");
		advinhaIdade = entrada.nextInt();

		System.out.println("Em que ano estamos?");
		anoReferente = entrada.nextInt();

		int result = anoReferente - advinhaIdade;

		System.out.println("Voc� tem " + result + " anos ou vai fazer");

	}

}
