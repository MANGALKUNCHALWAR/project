
//1]Snake and Ladder game played with single player at start
//position 0

import java.util.Random;

public class Snake_and_Ladder_Problem {
    public static void main(String[] args) {
        int START_POSITION= 0;
            System.out.println("Start Position : " + START_POSITION);
        }
    }


//2]The Player rolls the die to get a number between 1 to 6.
// - Use ((RANDOM)) to get the number between 1 to 6


 class Rolls_The_Die  {
    public static void main(String[] args) {
        int die_roll = (int) (((Math.random()*10)%6)+1);
        System.out.println("roll die number : " + die_roll);
    }
}




























