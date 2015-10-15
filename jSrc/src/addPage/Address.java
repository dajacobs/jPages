package addPage;

public class Address {
    public static final int SIZE = 32;
    
    public static void main(String[] args) {
        if(args.length != 2) {
            System.err.println("Length is less than two.");
            System.exit(0);
        }
        
        int pSize = Integer.parseInt(args[0].trim());
        int aSize = Integer.parseInt(args[1].trim());
        int pBits = 0;
        int pMask = 0;
        int oMask = 0;
        
        // Case for when page size.
        switch(pSize) {
            case 1024:
                pBits = 10;
                oMask = 0x000003ff;
                pMask = 0xfffffc00;
                break;
            case 2048:
                pBits = 11;
                oMask = 0x000007ff;
                pMask = 0xfffff800;
                break;
            case 8192:
                pBits = 13;
                oMask = 0x00001fff;
                pMask = 0xffffe000;
                break;
            case 16384:
                pBits = 14;
                oMask = 0x00003fff;
                pMask = 0xffffcfff;
                break;    
        }
    }
}