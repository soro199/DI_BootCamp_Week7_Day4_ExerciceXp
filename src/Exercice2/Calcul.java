package Exercice2;


/*
*@author SORO
*/

import java.util.Scanner;

public class Calcul {
    public static void calcul(){
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer un premier nombre");
        int x = sc.nextInt();

        System.out.println("entrer un deuxieme nombre");
        int y = sc.nextInt();

        System.out.println("entrer un troiseme nombre");
        int z = sc.nextInt();

        System.out.println("Le Produit est: " +calculProduit(x, y, z));
        System.out.println("Le Somme est: " +calculSum(x, y, z));
        System.out.println("Le Moyenne est: " +calculMoyenne(x, y, z));
        int[] tab = plusPetitNombre(x, y, z);
        System.out.println("Le plus petit nombre est: " +tab[0] + "\nLe plus grand nombre est: " + tab[1]);
    }

    private static int calculProduit(int x, int y, int z){
        int produit = x * y * z;
        return produit;
    }

    private static int calculSum(int x, int y, int z){
        int somme = Integer.sum(Integer.sum(x, y), z);
        return somme;
    }

    private static int calculMoyenne(int x, int y, int z){
        int moyenne = calculSum(x, y, z)/3;
        return moyenne;
    }

    private static int[] plusPetitNombre(int x, int y, int z){
        int petit = Math.min(Math.min(x, y), z);
        int grand = Math.max(Math.max(x, y), z);
        return new int[]{petit, grand} ;
    }
}
