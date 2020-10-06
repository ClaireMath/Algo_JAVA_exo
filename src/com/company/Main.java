package com.company;

public class Main {
            // ici on crée les fonctions et on déclare les variables globales

    /*  Ecrire une fonction qui prend en paramètre le tableau des scores et
        affiche son contenu */
        static void displayScores (int[] tab){
        for (int i=0; i<tab.length; i++) {
            System.out.println(tab[i]);
        }
    }
    /* Ecrire une fonction qui prend en paramètre le tableau des scores et
        qui renvoie le plus grand score du tableau */

    static int max (int[] tab) {
        int maxi = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxi) {
               maxi = tab[i];
                System.out.println("Le meilleur score est : " +maxi);
            }
        }
        return maxi;
    }

    /* Ecrire une fonction qui prend en paramètre le tableau des scores et
        qui renvoie vrai si le tableau contient au moins une valeur
        inférieure à 10
    static boolean fctnHasAtLeastOneValueInfTo10(int[] tab) {
        boolean hasAtLeastOneValueInfTo10 = false;
        for (int i =0; i < tab.length; i++) {
            if (tab[i] < 10) {
                hasAtLeastOneValueInfTo10 = true;
            }
        }
        return hasAtLeastOneValueInfTo10;
    }*/

    /* Ecrire une fonction qui prend en paramètre le tableau des scores et
      qui renvoie vrai si le tableau contient au moins une valeur
      inférieure à 10 */
    static boolean fctnHasAtLeastOneValueInfTo10(int[] tab) {
        for (int i =0; i < tab.length; i++) {
            if (tab[i] < 10) {
                return true;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        // Ici on a le code général = les appels de fonctions et les variables locales;
	// write your code here
        //int[] scores = new int[6] ;
        int[] scores = {150, 130, 40, 70, 80, 20, 110};
        System.out.println(scores);
        // int claireS = scores[0];
      //  int audeS = scores[1];
     //   int annieS = scores[2];
    //    int jpS = scores[3];
    //    int seralS = scores[4];
      //  int natS = scores[5];
     //   int dianaS = scores[6];

        for (int i=0; i < scores.length; i++) {
            System.out.println("début de la boucle");
            int score = scores[i];
            System.out.println(score);
            System.out.println("fin de la boucle");
        }
        // CALCULER LA MOYENNE DES SCORES

        int sum = 0;
        for (int i=0; i < scores.length; i++) {
            int score = scores[i];
            sum = sum + score;
        }

        System.out.println(sum);
        float average = sum / scores.length;
        System.out.println(average);

        displayScores (scores);
        max (scores);
        boolean b = fctnHasAtLeastOneValueInfTo10(scores);
        System.out.println("Il y a au moins une valeur < à 10 = " + b);



    }
}