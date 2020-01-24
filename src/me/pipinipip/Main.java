package me.pipinipip;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

     // String mot = JOptionPane.showInputDialog("skriv dator eller spelare för att välja vad du vill spela mot");

        final String ord = JOptionPane.showInputDialog("skriv ett ord");
        System.out.println(ord);
        // Ord input system.

        int ordlangd = 0;


        for( int i = 0; i < ord.length( ); i++ )
        {
                ordlangd++;
        }
        System.out.println(ordlangd);
        // Räknar hur många bokstäver som finns i ett ord.

        char[] bokstaver = new char[ord.length()];
        for( int i = 0; i < ord.length( ); i++ )
        {
            bokstaver[i] = ord.charAt(i);
        }

        System.out.println(bokstaver);


    }

}

