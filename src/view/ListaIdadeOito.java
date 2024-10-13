package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ListaIdadeOito {
	/*
	 * 11) Crie um programa que leia a idade de 8 pessoas e guarde-as em uma lista.
	 * No final, mostre: 
	 * 		a) Qual é a média de idade das pessoas cadastradas 
	 * 		b) Em quais posições temos pessoas com mais de 25 anos 
	 * 		c) Qual foi a maior idade digitada (podem haver repetições) 
	 * 		d) Em que posições digitamos a maior idade
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		List<Integer> idades = new ArrayList<Integer>(8);
		double media = 0.0;
		int soma = 0;
		int maiorVinteCinco = 0;
		int maiorIdade = Integer.MAX_VALUE;
		// a) Qual é a média de idade das pessoas cadastradas
		System.out.println("Digite sua idade: ");
		for (int i = 0; i < 8; i++) {
			int id = s.nextInt();
			idades.add(id);
		}
		for (double anos : idades) {
			soma += anos;
		}
		media = (double) soma / idades.size();
		// a - mostra a média de idade;
		System.out.println("Média é " + media);
		// b) Em quais posições temos pessoas com mais de 25 anos
		for (int i = 0; i < idades.size(); i++) {
			if (idades.get(i) > 25) {
				System.out.println("Mais de 25, esta na posição" + i);
			}
		}
		
		// c) Qual foi a maior idade digitada (podem haver repetições)
		maiorIdade = idades.get(0);
		for (Integer integer : idades) {
			if (integer > maiorIdade) {
				maiorIdade = integer;
			}
		}
		//d) Em que posições digitamos a maior idade
		List<Integer> posicaoMaiorIdade = new ArrayList<Integer>();
		for (int i = 0; i < idades.size(); i++) {
			if (idades.get(i) == maiorIdade) {
				posicaoMaiorIdade.add(i);
			}
		}
	}
}
