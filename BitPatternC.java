// file: BitPatternC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a variable length bit string used in Huffman encoding
//
public class BitPatternC implements BitPattern
{
    // private ___ bits;
<<<<<<< HEAD
    private int length;
    
    public BitPatternC(bits, int length)
=======
    private int bits;
	private int length = 0;
    
    public int getBits() 
    {
    	
    }
    
    public BitPatternC(int bits, int length)
>>>>>>> d96a0c601cbb67906ad89e2540c4f4c3450f06fa
    {
        this.bits = bits;
        this.length = length;
    }
    
    public int getLength() {return this.length; }
    public String toString();
}