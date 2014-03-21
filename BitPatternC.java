// file: BitPatternC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a variable length bit string used in Huffman encoding
//
public class BitPatternC implements BitPattern
{
    // private ___ bits;
    private int bits;
	private int length = 0;
    
    public BitStringC() 
    { 
    	this.bits = 0;
    	this.count = 0;
    }
	
    public BitPatternC(int bits, int length)
    {
        this.bits = bits;
        this.length = length;
    }
    
    public int getBits() {return this.bits;}
    public int getLength() {return this.length;}
    
    public String toString() 
    {
    	StringBuilder sb = new StringBuilder();
    	int temp = this.bits;
    	for(int i = 0; i < count; i++) {
    	    sb.append(temp % 2 == 0 ? "0" : "1");
    	    temp = temp / 2;
    	}
    	return sb.reverse().toString();
    }
}