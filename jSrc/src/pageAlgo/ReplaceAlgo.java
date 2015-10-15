package pageAlgo;

public abstract class ReplaceAlgo {
    // Page fault and frame counters
    protected int pFaultCount;
    protected int pFrameCount;
    // Number of page frames
    public ReplaceAlgo(int pFrameCount) {
        if(pFrameCount < 0) {
            throw new IllegalArgumentException();
        }
        this.pFrameCount = pFrameCount;
        pFaultCount = 0;
    }
    // Getter for page fault counter
    public int getpFaultCount() {
        return pFaultCount;
    }
    // Page number to be inserted
    public abstract void insert(int pNumb);
}