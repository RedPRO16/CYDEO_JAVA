package day09_ifElseStatements;

public class ChooseLanguage {
    public static void main(String[] args) {
        int a = 1; // number between 1~5
        //String print = "";

/*  solution 1 - long way
        if (a >= 1 && a <= 5) {
            if (a == 1) {
                print = "Hello, thank for your call";
            } else if (a == 2) {
                print = "Hola, gracias para llamar";
            } else if (a == 3) {
                print = "Merhaba, aradiginiz icin tesekkurler";
            } else if (a == 4) {
                print = "Privet, spasibo za vash zvonok";
            } else {
                print = "Merci ,pour votre appel";
            }
           */
        //solution 2 Ternaries implemented....
        String print = (a >= 1 && a <= 5)?
                (a == 1)? print = "Hello, thank for your call" :(a==2)? print = "Hola, gracias para llamar" :(a==3)? print = "Merhaba, aradiginiz icin tesekkurler"
                :(a==4)? print = "Privet, spasibo za vash zvonok" :"Merci ,pour votre appel"
            :"Invalid Number";


       // } else {
           // print = "Invalid Number";
       // }
        System.out.println("For " + a + ": " + print);
    }
}


/*
Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
 */