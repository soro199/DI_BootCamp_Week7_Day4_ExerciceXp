package Exercice3;


/*
*@author SORO
*/

import java.util.Random;
import java.util.Scanner;

public class Aleatoire {

    public static void genererNombreAleatoire(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer un nombre");
        int X = sc.nextInt();

        System.out.println("Entrer un nombre");
        int N = sc.nextInt();
        Random r = new Random();
        int[] tab = new int[N];
        for (int i = 0; i < N; i++) {
            tab[i] = r.nextInt(X - 1) + 1;
            System.out.println(tab[i]);
        }
    }
}
