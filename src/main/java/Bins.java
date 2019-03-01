import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Bins {

    protected TreeMap< Integer, Integer> results;
    Dice dice;
    private int numOfToss;

    public TreeMap<Integer, Integer> getResults() {
        return results;
    }
    public Bins(int numOfToss){
        this();

    this.numOfToss = numOfToss;
    }

    public Bins() {

        this.dice = new Dice();
        results = new TreeMap<Integer, Integer>();

        results.put(2,0);
        results.put(3,0);
        results.put(4,0);
        results.put(5,0);
        results.put(6,0);
        results.put(7,0);
        results.put(8,0);
        results.put(9,0);
        results.put(10,0);
        results.put(11,0);
        results.put(12,0);

        Set mapset = results.entrySet();

    }

    public void setResults(TreeMap<Integer, Integer> results) {
        this.results = results;
    }


   public void updateBin(int resultOfRoll){
        //dice.roll(numOfToss);

       // get the value of key sum from the results


      int value = results.get(resultOfRoll);

       // increment that value by 1
       value++;

       // update that key with the incremented value

       results.put(resultOfRoll, value);
       Set mapValue = results.entrySet();

      // System.out.println(results);



   }

}
