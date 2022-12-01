package exercicios_pagina36while;

import java.util.Scanner;

public class exercicio3_pagina36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// c = (f-32)/1,8
				Scanner leitura = new Scanner (System.in);
				double f,c;
				
				System.out.println (" escreva o valor de uma temperatura em Fahrenheit: ");
				f = leitura.nextDouble();
				c = (f-32)/1.8;
				if (c<15) {
					System.out.println (c+ " FRIO! ");
				}else if (c>=15 && c<22) {
					System.out.println (c+ " AMENO! ");
				}else {
					System.out.println (c+ " CALOR! ");
				}
				
				leitura.close();

	}

}
