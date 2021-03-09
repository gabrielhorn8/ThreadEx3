package view;

import java.util.Random;

import controller.ThreadEx2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generate =new Random();
		int matriz[][]=new int[3][5];
		int linha,i;
		for(linha=0; linha<3; linha++){
			for(i=0; i<5;i++){
				matriz[linha][i]=generate.nextInt(10);
				System.out.print(matriz[linha][i] +" | " );
			}
			System.out.print("\n" );
		}
		for(linha=0; linha<3; linha++){
			Thread tex2 = new ThreadEx2(matriz[linha],linha);
			tex2.start();
		}
	}

}
