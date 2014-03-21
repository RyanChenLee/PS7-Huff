// file: BitPatternC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a variable length bit string used in Huffman encoding
//
public class BitPatternC implements BitPattern
{
    private int bits;
    private int length;
    
    public BitPatternC(int bits, int length)
    {
    	this.bits = bits;
    	this.length = length;
    }
    
    public int getBits() 
    {
    	
    }
    
    public int getLength() {return this.length; }
    public String toString();
}
