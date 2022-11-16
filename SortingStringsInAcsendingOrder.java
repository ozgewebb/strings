/*
 * @author owebb
 */
package ow.strings;

public class SortingStringsInAcsendingOrder {
    public static void main (String[] args) {
             String[] animalsList =  {"mouse", "dog", "cat", "horse", "cow",
         "moose", "tiger", "lion", "elephant", "bird", "hamster",
         "guinea pig", "leopard", "aardvark", "hummingbird"};

    int comparisons = animalsList.length - 1;
    String temp;
    int a, b;

    for(a = 0; a < comparisons; a++) {
        for(b = 0; b < comparisons; b++) {
            if((animalsList[b].compareTo(animalsList[b + 1])) > 0) {
                temp = animalsList[b];
                animalsList[b] = animalsList[b + 1];
                animalsList[b + 1] = temp;
            }
        }
    }
    for(a = 0; a < animalsList.length; a++) {
        System.out.println(animalsList[a]);
    }
    }
}
