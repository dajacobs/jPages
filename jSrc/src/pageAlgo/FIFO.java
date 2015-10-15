package pageAlgo;

public class FIFO extends ReplaceAlgo {
    // List of page frames for FIFO
    private final FIFOList fList;
    // Page frame count added to FIFOList
    public FIFO(int pFrameCount) {
        super(pFrameCount);
        fList = new FIFOList(pFrameCount);
    }
    // Page frame to be inserted
    @Override
    public void insert(int pNumb) {
        fList.insert(pNumb);
        if(System.getProperty("debu") != null) {
            System.out.print("Being Inserted " +pNumb);
            fList.dump();
            System.out.println();
        }
    }
    // FIFOList class with methods
    class FIFOList {
        int[] pFrameList;
        int eCount;
        FIFOList(int pFrameCount) {
            pFrameList = new int[pFrameCount];
            eCount = 0;
        }
        // Page number to be inserted into frame list
        void insert(int pNumb) {
            if(!search(pNumb)) {
                if(System.getProperty("debug") != null) {
                    System.out.print("*");
                }
            }
        }
        // Page frames are dumped
        void dump() {
            for(int i = 0; i < pFrameList.length; i++) {
                System.out.print("[" +i+ "]" +pFrameList[i] +", ");
            }
        }
        // Search for page number in frame list
        boolean search(int pNumb) {
            return false;
        }
    }
}