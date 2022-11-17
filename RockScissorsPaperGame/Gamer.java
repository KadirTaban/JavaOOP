package RockScissorsPaperGame;

import java.util.Random;
import java.util.Scanner;

public class Gamer {
    static public int numofTrials;
    static int draws;
    int wins;
    String name;
    HandSign sign;

    Gamer(String name){
        this.name = name;
    }
    public void move(){
        Scanner input = new Scanner(System.in);
        boolean isInputInvalid = false;
        numofTrials ++;

        do{
            char userChoice = input.next().charAt(0);
            isInputInvalid = false;
            switch(userChoice)
        {
            case 'q':
                GameArena.isGameOver = true;
                break;

            case 'p':
                this.sign = HandSign.Paper;
                break;

            case 'r':
                this.sign = HandSign.Rock;
                break;

            case 's':
                this.sign = HandSign.Scissors;
                break;

            default:
                System.out.println("please enter invalid input such as p,r,s,q");
                isInputInvalid = true;
                break;
            
        }

        }while(isInputInvalid);
    }


    public void autoMove(){
        this.sign = getRandomSign();
        System.out.println(this.sign);
    
        

    }

    public static HandSign getRandomSign(){

        int pick = new Random().nextInt(HandSign.values().length);
        return HandSign.values()[pick];
    }
    
}
