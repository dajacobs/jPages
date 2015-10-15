package pageAlgo;

import java.util.Random;

public class PageGen {
    private static final int SIZE = 100;
    private static final int RANGE = 9;
    int[] refString;
    // Size of the page generator
    public PageGen() {
        this(SIZE);
    }
    // Generates page references with our ranges
    public PageGen(int count) {
        if(count < 0) {
            throw new IllegalArgumentException();
        }
        Random num = new Random();
        refString = new int[count];
        for(int i = 0; i < count; i++) {
            refString[i] = num.nextInt(RANGE + 1);
        }
    }
    // Getter for reference string
    public int[] getRefString() {
        return refString;
    }
}