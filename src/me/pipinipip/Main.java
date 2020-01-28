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
        boolean gissningiord;

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
    System.out.println("du har gissat på " + gissningar);
    char cGuess = gissning.charAt(0);

    gissningiord = ord.contains(gissning);
    if (gissningiord == true){
        System.out.println(gissning + " finns i ordet");
    for (int position = 0; position < ord.length(); position++)
    {
        if (cGuess == (ord.charAt(position))){
            ordspook = ordspook.replaceAll("_ ", "_");
            String spookord2;
            spookord2 = ordspook.substring(0, position) + gissning + ordspook.substring(position + 1);
            spookord2 = spookord2.replaceAll("_", "_ ");
            ordspook = spookord2;
        }
    }
} else {
System.out.println(gissning + "finns inte i ordet");
fel++;
}
}
if (fel == maxfel) {
System.out.println("du förlorde");

} else {
    System.out.println("du vann :)");
}

}

}

