package _05_Enum_Stuff;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
        for( Zodiac z : Zodiac.values() ) {
            getHoroscope( z );
        }
    }
	
	public static void getHoroscope( Zodiac z ) {
	    switch(z) {
	    case LIBRA:
	        System.out.println( "You're a libra!" );
	        break;
	    default:
	        System.out.println( "Some random horoscope" );
	        break;
	    }
	}
}
