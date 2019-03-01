import org.junit.Test;

import java.util.TreeMap;

import static org.junit.Assert.*;

public class BinsTest {
Bins bin = new Bins(1);
Dice dice = new Dice();
TreeMap map = new TreeMap();
    @Test
    public void updateBinTest() {
    //Given
//     dice.roll(3);
//        System.out.println();

    //When
        bin.updateBin(1234);

    }

    @Test
    public void getResults() {
        bin.getResults();


    }



}