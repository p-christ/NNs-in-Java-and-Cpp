import static junit.framework.TestCase.assertEquals;

import com.company.FNN;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MyTests {

    @Test
    public void matrixMultiplication() {

//        *** TBD ***

        ArrayList<Integer> layers = new ArrayList<>(Arrays.asList(10,10,1));
        double learningRate = 0.1;
        int rows = 5;
        int cols = 8;

        FNN nn = new FNN(layers, learningRate);
    }
}