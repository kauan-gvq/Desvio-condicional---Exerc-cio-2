package Exs.java;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero :");
		double x = sc.nextDouble();
		if(x > 1.99 && x < 5.99) {
		System.out.print("Esse n�mero est� entre 1.99 e 5.99.");
		}
		else{
			System.out.print("Este n�mero n�o est� entre os selecionados.");
		}
			
	}

}
