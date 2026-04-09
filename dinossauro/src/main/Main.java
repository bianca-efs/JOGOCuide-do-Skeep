package main;

import java.util.Scanner;

import dinossauro.Dinossauro;

public class Main {
	public static void main(String[] args) {
		
		Dinossauro Skeep = new Dinossauro ();
		Scanner sc = new Scanner (System.in);
		
		Skeep.setEnergia(30);
		Skeep.setVelocidade(30);
		Skeep.setTemperatura(30);
		Skeep.setHumor("Feliz :)");
		
		boolean lv = true;
		
		System.out.println("=================================================================");
		System.out.println("       📋 REGRAS DO JOGO");
		System.out.println("=================================================================");
		System.out.println("  * Se a ENERGIA chegar abaixo de 0, Skeep morre!");
		System.out.println("  * Se a VELOCIDADE chegar abaixo de 0, Skeep morre!");
		System.out.println("  * Se a TEMPERATURA chegar abaixo de 0, Skeep morre!");
		System.out.println("  * Se a TEMPERATURA passar de 100, Skeep superaquece e morre!");
		System.out.println("=================================================================");
		System.out.println("  Cuide bem do seu dinossauro!\n");
		
		
		while (lv == true) {
			  
	            System.out.println("\n\t        🦕 SKEEP 🦕");
	            System.out.println("\t================================");
	            System.out.println("\t  Energia     : " + Skeep.getEnergia());
	            System.out.println("\t  Velocidade  : " + Skeep.getVelocidade());
	            System.out.println("\t  Temperatura : " + Skeep.getTemperatura());
	            System.out.println("\t  Humor       : " + Skeep.getHumor());
	            System.out.println("\t================================");
	          
	            System.out.println("\nO que Skeep vai fazer?");
	            System.out.println("  (P)ular          (C)orrer         Co(M)er");
	            System.out.println("  C(A)ntar         Tomar (S)ol      Ficar na S(O)mbra");
	            System.out.print("\nDigite a opção: ");

	            String textoMaiusculo = sc.nextLine().toUpperCase();
	            char letra = textoMaiusculo.charAt(0);

	            switch (letra) {
	                case 'P': Skeep.pular(); if (Skeep.getEnergia() < 0 || Skeep.getVelocidade() <= 0) {lv = false;};break;
	                case 'C': Skeep.correr(); if (Skeep.getEnergia() < 0 || Skeep.getVelocidade() <= 0) {lv = false;};break;
	                case 'M': Skeep.comer(); if (Skeep.getVelocidade() < 0) {lv = false;};break;
	                case 'A': Skeep.cantar(); if (Skeep.getEnergia() < 0) {lv = false;};break;
	                case 'S': Skeep.tomarSol(); if (Skeep.getTemperatura() > 100) {lv = false;}    break;
	                case 'O': Skeep.ficarNaSombra(); if (Skeep.getTemperatura() < 0) {lv = false;};break;
	                default:  System.out.println("\nOpção inválida! Tente novamente.");	   
	            }
		}
		
		System.out.println("Game Over :(");
	}
}
