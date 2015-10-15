package pageAlgo;

public class LRU {
    // List of page frame for LRU
    private LRUList fList;
    // Page frame count added to LRUList
    public LRU(int pFrameCount) {
        super(pFrameCount);
        fList = new LRUList(pFrameCount);
    }
    // Page frame to be inserted
    public void insert(int pNumb) {
        fList.insert(pNumb);
        if(System.getProperty("debug") != null) {
            System.out.print("Being inserted " +pNumb);
            fList.dump();
            System.out.println();
        }
    }
}