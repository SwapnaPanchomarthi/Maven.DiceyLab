import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Dice {

    private int numberOfDice;
    private int die1;
    private int die2;
    private List<Integer> tossResults = new ArrayList<Integer>();
    protected Random random;
    private int numOfToss;

    public Dice(){

    }
    public Dice(int numOfToss){
        this.numOfToss = numOfToss;

    }

    public Dice(int numberOfDice, Random random){
        this.numberOfDice=numberOfDice;
        this.random = random;

    }

    public int roll(int numOfToss){
        int sum =0;
            die1 = ((int) (Math.random() * 6) + 1);
            //System.out.println(die1);
            die2 = ((int) (Math.random() * 6) + 1);
            //System.out.println(die2);
        return getTotal();


    }

    public int getDie1(){
        return die1;
    }

    public int getDie2(){
        return die2;
    }


    public int getTotal()
    {
    return die1+die2;
    }







   /* public static void main(String[] args){

        Dice dice = new Dice();
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter number of Dice "));
        int numOfDice = input.nextInt();
       dice.roll();
       dice.numberOfToss(numOfDice);
       dice.getResult();
        System.out.println(dice.sumOfToss());




    }*/

}

