package com.company;

public class Main {

            // ici on crée les fonctions et on déclare les variables globales

    /**
     * fonction qui prend en paramètre le tableau des scores et affiche son contenu
     *
     * @param tab il s'agit d'un tableau de nombres entiers
     *            Le type de retour est un void car on ne fait que de l'affichage
     */
       public static void displayScores (int[] tab){
        for (int i=0; i<tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    /**
     * fonction qui prend en paramètre le tableau des scores
     * @param tab il s'agit d'un tableau de nombres entiers
     * @return le type de retour est un nombre entier, qui renvoie le plus grand score du tableau
     */
    public static int max (int[] tab) {
        int maxi = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxi) {
                // maxi <- tab[i]
                // la valeur de tab[i] est envoyée dans la variable maxi (dans ce sens et pas dans l'autre)
               maxi = tab[i];
                System.out.println("Le meilleur score est : " +maxi);
            }
        }
        return maxi;
    }

    /**
     * fonction qui prend en paramètre le tableau des scores
     * @param tab il s'agit d'un tableau de nombres entiers
     * @return le type de retour est une valeur booléenne, qui sera vraie si
     *                 le tableau contient au moins une valeur inférieure à 10
     */
     public static boolean fctnHasAtLeastOneValueInfTo10(int[] tab) {
        boolean hasAtLeastOneValueInfTo10 = false;
        for (int i =0; i < tab.length; i++) {
            if (tab[i] < 10) {
                hasAtLeastOneValueInfTo10 = true;
            }
        }
        return hasAtLeastOneValueInfTo10;
    }

    /* Ecrire une fonction qui prend en paramètre le tableau des scores et
      qui renvoie vrai si le tableau contient au moins une valeur
      inférieure à 10
        static boolean fctnHasAtLeastOneValueInfTo10(int[] tab) {
        for (int i =0; i < tab.length; i++) {
            if (tab[i] < 10) {
                return true;
                // sans le break, l'ordi continue à évaluer sil y a ou non
                // une valeur inférieure à 10 alors quon sait deja dès le premier
                // si on a une valeur ou non, donc ça ne casse pas le code mais ça peut ralentir.

            }
        }
        return false;
    }*/

    // Implémenter une fonction de recherche binaire
    // Cette fonction prend en paramètre : - Un tableau d'entiers trié par ordre croissant
   // et un nombre entier à rechercher
   // Cette fonction renvoie l'index de la case contenant le nombre
 //   Si la valeur n'est pas trouvé, elle renvoie -1
 //   Cette fonction est commentée !

    public static int rechBin (int[] tab, int num) {

    }






    /**
     * fonction de recherche binaire
     * @param tab un tableau trié par ordre croissant
     * @param nb le nombre entier que l'on recherche
     * @return renvoie l'index de la case contenant le nombre, ou renvoie -1 si la valeur n'est pas trouvée dans le tableau
     *
     */
    public static  int searchBinary (int[] tab, int nb) {
        int minIndex = 0;
        int maxIndex = tab.length-1;

        while (minIndex < maxIndex) {
            int meanIndex = (minIndex + maxIndex) / 2;
            if (nb == tab[meanIndex]) {
                return meanIndex;
            } else if (tab[meanIndex] < nb) {
                minIndex = meanIndex + 1;
            } else {
                maxIndex = meanIndex - 1;
            }
        }
        return -1;


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

        //  APPEL DES FONCTIONS :
        displayScores (scores);
        max (scores);
        boolean b = fctnHasAtLeastOneValueInfTo10(scores);
        System.out.println("Il y a au moins une valeur < à 10 = " + b);



    }
}