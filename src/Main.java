import Exercice1.Cercle;
import Exercice2.Calcul;
import Exercice3.Aleatoire;
import Exercice4.Person;

import java.util.Random;
import java.util.Scanner;


/*
*@author SORO
*/

public class Main {
    public static void main(String[] args) {
        //Exercice1
        Cercle cercle1 = new Cercle(5);
        System.out.println("L'aire du cercle est: " + cercle1.airCercle());
        System.out.println("\nLe perimetre du cercle est: " + cercle1.perimetreCercle());

        //Exercice2
        Calcul.calcul();


        //Exercice3
        Aleatoire.genererNombreAleatoire();



        //Exercice4
        Person person1 = new Person("Mia", "Dagnogo", 02);
        System.out.println(person1.introduce());
    }
}
