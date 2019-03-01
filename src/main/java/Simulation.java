import java.util.Map;
import java.util.Scanner;

public class Simulation {
private int numberofDice;
private int numOfToss;
    Dice dice = new Dice();
    Bins bin = new Bins();
    public Simulation()
    {

    }
    public Simulation(int numOfToss){
        this.numberofDice=numberofDice;
        this.numOfToss =numOfToss;
    }

    public void runSimulation(int numOfToss){

    for (int i=0;i<numOfToss;i++){


        bin.updateBin(dice.roll(0));

    }
        System.out.println(bin.results);


    }

    public void print(){
        runSimulation(1000000);

        for (Map.Entry<Integer, Integer> entry : bin.results.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            //System.out.println(value);
            float percentage = value*100/1000000;
            System.out.println(+key + (String.format("%2s"," : ") + value+":   " +percentage));

            
        }

    }

    public static void main(String[] args) {

        Dice dice = new Dice();
        Bins bin = new Bins();
        Simulation sim = new Simulation();
        sim.runSimulation(1000000);
        sim.print();
    }

    }
