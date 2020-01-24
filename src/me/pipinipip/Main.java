package me.pipinipip;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

     // String mot = JOptionPane.showInputDialog("skriv dator eller spelare för att välja vad du vill spela mot");

        final String ord = JOptionPane.showInputDialog("skriv ett ord");
        System.out.println(ord);
        // Ord input system.

        int ordlängd = 0;


        for( int i = 0; i < ord.length( ); i++ )
        {
                ordlängd++;
        }
        System.out.println(ordlängd);
        // Räknar hur många bokstäver som finns i ett ord.

        char[] bokstäver = new char[ord.length()];
        for( int i = 0; i < ord.length( ); i++ )
        {
            bokstäver[i] = ord.charAt(i);
        }

        System.out.println(bokstäver);


    }

}

