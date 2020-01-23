package me.pipinipip;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        final String ord = JOptionPane.showInputDialog("skriv ett ord");
        System.out.println(ord);

        int Count = 0;


        for( int i = 0; i < ord.length( ); i++ )
        {
                Count++;
        }
        System.out.println(Count);
    }
}
