package pageAlgo;

public class FIFO extends ReplaceAlgo {
    // List of page frames for FIFO
    private FIFOList fList;
    // Page frame count added to FIFOList
    public FIFO(int pFrameCount) {
        super(pFrameCount);
        fList = new FIFOList(pFrameCount);
    }
    // Page frame to be inserted
    public void insert(int pNumb) {
        fList.insert(pNumb);
        if(System.getProperty("debu") != null) {
            System.out.print("Being Inserted " +pNumb);
            fList.dump();
            System.out.println();
        }
    }
    class FIFOList {
        int[] pFrameList;
        int eCount;
        FIFOList(int pFrameCount) {
            pFrameList = new int[pFrameCount];
            eCount = 0;
        }
    }
}
