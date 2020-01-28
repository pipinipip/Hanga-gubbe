package me.pipinipip;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

     // String mot = JOptionPane.showInputDialog("skriv dator eller spelare för att välja vad du vill spela mot");

        String ord = JOptionPane.showInputDialog("skriv ett ord");
        System.out.println(ord);
        // Ord input system.

        ord = ord.toUpperCase();
// gör så att alla bokstäver blir uppercase

        String ordspook = ord.replaceAll("[A-Z]", "_ ");
        // Skapar strängen ordspook som har lika många _ som bokstäver i ordet.

        System.out.println(ordspook);

        int ordlangd = 0;
        int maxfel = 11 ;
        int fel = 0;
        String gissningar = "";

        for( int i = 0; i < ord.length( ); i++ )
        {
                ordlangd++;
        }
        System.out.println(ordlangd);
        // Räknar hur många bokstäver som finns i ett ord.



while (fel < maxfel && ordspook.contains("_"))
{
    System.out.println(ordspook);
    System.out.println("Du har " + fel + " fel utav " + maxfel);


    String gissning = JOptionPane.showInputDialog("gissa en bokstav");
    gissning = gissning.toUpperCase();
    // gör om bokstaven man gissade till en stor bokstav.
    gissningar += gissning;
    // håller reda på vika bokstäver som har blivit gissade.
    System.out.println(gissningar);




}












    }

}

