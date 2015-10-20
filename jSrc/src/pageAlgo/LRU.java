package pageAlgo;

public class LRU extends ReplaceAlgo{
    // List of page frame for LRU
    private LRUList fList;
    // Page frame count added to LRUList
    public LRU(int pFrameCount) {
        super(pFrameCount);
        fList = new LRUList(pFrameCount);
    }
    // Page frame to be inserted
    @Override
    public void insert(int pNumb) {
        fList.insert(pNumb);
        if(System.getProperty("debug") != null) {
            System.out.print("Being inserted " +pNumb);
            fList.dump();
            System.out.println();
        }
    }
    class LRUList {
        // Page frame list
        int[] pFrameList;
        // Elements counter for page frames in list
        int eCount;
        // Page frame count added to LRUList
        LRUList(int pFrameCount) {
            pFrameList = new int[pFrameCount];
            eCount = 0;
        }
        // Page number to be inserted
        void insert(int pNumb) {
            int sValue;
            if((sValue = search(pNumb)) == -1) {
                if(System.getProperty("debug") != null) {
                    System.out.print("*");
                }
            } else if(pNumb != pFrameList.length) {
                upTable(sValue);
            }
        }
        // Update the table with the searched value
        void upTable(int sValue) {
            
        }
        // Page frames to be dumped
        void dump() {
            for(int i = 0; i < pFrameList.length; i++) {
                System.out.print("[" +i+ "]" +pFrameList[i] +", ");
            }
            System.out.print(" element count = " +eCount);
        }
        // Search the page number int he frame list
        int search(int pNumb) {
            return 0;
        }
    }
}