package com.utente.anagrafica;

public class Main {
	public static void main(String[] args) {
		String name = "Ajeje", surname = "Brazorf", birthPlace = "PaLeRmO";
		int age = 30, height = 192;
		char gender = 'M';
		boolean hasDriveLicense = false;
		
		System.out.println(" _____________________________");
		System.out.println("|  " + "                         " + "  |");
		System.out.println("|  " + "Nome: " + name + "                |");
		System.out.println("|  " + "Cognome: " + surname + "           |");
		System.out.println("|  " + "Eta': " + age + "                   |");
		System.out.println("|  " + "Luogo di nascita: " + birthPlace.toLowerCase() + "  |");
		System.out.println("|  " + "Altezza: " + String.format("%.2f m", (float)height/100) + "            |");
		System.out.println("|  " + "Sesso: " + gender + "                   |");
		System.out.println("|  " + "Patente: " + (hasDriveLicense ? "SI" : "NO") + "                |");
		System.out.println("|  " + "                         " + "  |");
		System.out.println("|_____________________________|");
	}
}
