import java.util.Random;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int op = 1;

		int[] vetor = new int[10];

		while (op != 0) {

			System.out.println(" =========== MENU DE OPÇÕES ===========");

			System.out.println(" 1º opção: Coleta dados do vetor");

			System.out.println(" 2º opção: Gera valores randômicos para o vetor");

			System.out.println(" 3º opção: Imprime dados do vetor");

			System.out.println(" 4º opção: Imprime vetor invertido");

			System.out.println(" 5º opção: Soma valores do vetor");

			System.out.println(" 6º opção: Soma personalizada de valores do vetor");

			System.out.println(" 7º opção: Média dos valores do vetor");

			System.out.println(" 8º opção: Maior valor dentro do vetor");

			System.out.println(" 9º opção: Menor valor dentro do vetor");

			System.out.println(" Digite 0 para sair");

			System.out.println(" ");

			System.out.print(" Digite a opção desejada: ");

			op = teclado.nextInt();

			System.out.println(" ");

			if (op == 1) {

				coletaVetor(vetor);

			} else if (op == 2) {

				System.out.print(" Qual o valor máximo do vetor? ");

				int max = teclado.nextInt();

				geraValorRandomico(vetor, max);

				System.out.print(" Valores randômicos gerados: ");

				imprimeVetor(vetor);

			} else if (op == 3) {

				System.out.print(" Dados do vetor: ");

				imprimeVetor(vetor);

			} else if (op == 4) {

				System.out.print(" Vetor invertido: ");

				imprimeVetorInvertido(vetor);

			} else if (op == 5) {

				int somaTodos = somaTodos(vetor);

				System.out.println(" Soma de todos os valores do vetor: " + somaTodos);

			} else if (op == 6) {

				System.out.print(" Índice de início (inclusive): ");

				int inicio = teclado.nextInt();

				System.out.print(" Índice de término (inclusive): ");

				int termino = teclado.nextInt();

				if (inicio > termino) {

					System.out.println(" Verifique restrinções do algoritimo!");

				} else if (inicio > vetor.length || termino > vetor.length) {

					System.out.println(" Verifique restrinções do algoritimo!");

				} else {

					System.out.println(" Soma personalizada: " + somaPersonalizada(vetor, inicio, termino));

				}

			} else if (op == 7) {

				System.out.println(media(vetor));

			} else if (op == 8) {

				System.out.println(" O maior valor do vetor é: " + maiorValor(vetor));

			} else if (op == 9) {

				System.out.println(" O menor valor do vetor é: " + menorValor(vetor));

			} else if (op > 9) {

				System.out.println(" Opção inválida");

			}

			System.out.println("----------------------------------------------");

			System.out.println(" ");

		}

		System.out.println(" Fim do algoritmo");

	}

	public static int[] coletaVetor(int[] vetor) {

		Scanner teclado = new Scanner(System.in);

		for (int cont = 0; cont < vetor.length; cont++) {

			System.out.print(" Informe o " + (cont + 1) + "º valor do vetor: ");

			vetor[cont] = teclado.nextInt();

		}

		return vetor;

	}

	public static int[] geraValorRandomico(int[] vetor, int max) {

		Random r = new Random();

		for (int cont = 0; cont < vetor.length; cont++) {

			vetor[cont] = r.nextInt(max);

		}

		return vetor;

	}

	public static void imprimeVetor(int[] vetor) {

		for (int cont = 0; cont < vetor.length; cont++) {

			if (cont == (vetor.length - 1)) {

				System.out.println(vetor[cont] + " ");

			} else {

				System.out.print(vetor[cont] + ", ");

			}

		}

	}

	public static void imprimeVetorInvertido(int[] vetor) {

		for (int cont = 1; cont <= vetor.length; cont++) {

			if (cont == vetor.length) {

				System.out.println(vetor[vetor.length - cont] + " ");

			} else {

				System.out.print(vetor[vetor.length - cont] + ", ");

			}

		}

	}

	public static int somaTodos(int[] vetor) {

		int somaVetor = 0;

		for (int cont = 0; cont < vetor.length; cont++) {

			somaVetor += vetor[cont];

		}

		return somaVetor;

	}

	public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

		int somaTotal = 0;

		for (int cont = inicio; cont <= termino; cont++) {

			somaTotal += vetor[cont];

		}

		return somaTotal;

	}

	public static double media(int[] vetor) {

		double mediaVetor = somaTodos(vetor) / vetor.length;

		return mediaVetor;

	}

	public static int maiorValor(int[] vetor) {

		int cont2 = vetor[1];

		for (int cont = 0; cont < vetor.length; cont++) {

			if (cont2 < vetor[cont]) {

				cont2 = vetor[cont];

				cont = 0;

			}

		}

		return cont2;

	}

	public static int menorValor(int[] vetor) {

		int cont2 = vetor[1];

		for (int cont = 0; cont < vetor.length; cont++) {

			if (cont2 > vetor[cont]) {

				cont2 = vetor[cont];

				cont = 0;

			}

		}

		return cont2;

	}

}
