package application;

import entities.SmartTV;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTV smartTv= new SmartTV();
		
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.diminuirVolume();
		smartTv.aumentarVolume();
		
		System.out.println("Canal atual : "+ smartTv.canal);
		smartTv.mudarCanal(13);
		System.out.println("Canal atual : "+ smartTv.canal);
		System.out.println("volume atual : "+ smartTv.volume);
		
		System.out.println();
		
		System.out.println("TV ligada? "+ smartTv.ligada);
		System.out.println("Canal atual : "+ smartTv.canal);
		System.out.println("volume atual : "+ smartTv.volume);
		
		
		smartTv.ligar();
		System.out.println("Novo Status- TV ligada? "+ smartTv.ligada);
	}

}
