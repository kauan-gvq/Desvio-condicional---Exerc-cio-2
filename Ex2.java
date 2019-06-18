package Exs.java;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número :");
		double x = sc.nextDouble();
		if(x > 1.99 && x < 5.99) {
		System.out.print("Esse número está entre 1.99 e 5.99.");
		}
		else{
			System.out.print("Este número não está entre os selecionados.");
		}
			
	}

}
