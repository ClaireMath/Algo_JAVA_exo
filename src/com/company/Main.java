package com.company;

public class Main {

    public static void main(String[] args) {
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
            int score = scores[i];
            System.out.println(score);
        }
        // CALCULER LA MOYENNE DES SCORES

        int sum = 0;
        for (int i=0; i < scores.length; i++) {
            int score = scores[i];
            sum = sum + score;
        }

        System.out.println(sum);
        int average = sum / scores.length;
        System.out.println(average);

    }
    /*  Ecrire une fonction qui prend en paramètre le tableau des scores et
        affiche son contenu
        Ecrire une fonction qui prend en paramètre le tableau des scores et
        qui renvoie le plus grand score du tableau
        Ecrire une fonction qui prend en paramètre le tableau des scores et
        qui renvoie vrai si le tableau contient au moins une valeur
        inférieure à 10 */



}
