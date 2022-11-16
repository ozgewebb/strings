package ow.strings;

import java.util.Scanner;

public class ReverseStringsOrder {
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int i = 0;
      int j;
      String[] wordsList = new String[100];
      String entry;
      final String QUIT = "Q";
      StringBuffer message = new
          StringBuffer("In reverse order\n");
     
      System.out.println("Please enter a word to reverse\n when you want to quit, type " + QUIT);
      entry = input.next();
      while(!(entry.equals(QUIT)))
      {
         wordsList[i] = entry;
         ++i;
         System.out.println("Please enter another word to reverse\n when you want to quit, type " + QUIT);
         entry = input.next();
      }
      for(j = i - 1; j >= 0; j--)
      {
         message.append(wordsList[j]);
         message.append("\n");
      }
      System.out.println(message);
   }
}
