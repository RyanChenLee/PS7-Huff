// file: BitPatternC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a variable length bit string used in Huffman encoding
//
public class BitPatternC implements BitPattern
{
    // private ___ bits;
    private int length;
    
    public BitPatternC(bits, length)
    {
        this.bits = bits;
        this.length = length;
    }
    
    public int getLength() {return this.length; }
    public String toString();
}