package pageAlgo;

public class Test {
    public static void main(String[] args) {
        try {
            PageGen pag = new PageGen(Integer.parseInt(args[0]));
            int[] refString = pag.getRefString();
        
            ReplaceAlgo fifo = new FIFO(Integer.parseInt(args[1]));
            ReplaceAlgo lru  = new LRU(Integer.parseInt(args[1]));
        
            for(int i = 0; i < refString.length; i++) {
                lru.insert(refString[i]);
            }
            System.out.println("LRU faults = " +lru.getpFaultCount());

            for(int i = 0; i < refString.length; i++) {
                fifo.insert(refString[i]);
            }
            System.out.println("FIFO faults = " +fifo.getpFaultCount());
        } catch (Exception e) {
            System.out.println("Use command prompt: java Test <reference string> <page frames>");
        }
    }
}