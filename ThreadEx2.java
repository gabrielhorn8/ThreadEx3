package controller;

public class ThreadEx2 extends Thread{
	private int[] matriz;
	private int linha;
	public ThreadEx2(int[]matriz,int linha) {
		this.matriz=matriz;
		this.linha=linha;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int soma=0;
		for(int i=0; i<5;i++){
			soma=soma+ matriz[i];
		}
		System.out.println("Linha: "+linha+" ==> "+soma);
	}
}
