// file: EntryC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a value in a symbol table used in Huffman encoding
//

private class EntryC implements Entry
{
    private int frequency;
    private BitPattern pattern;
    
    Entry(int frequency, BitPattern pattern)
    {
        this.frequency = frequency;
        this.pattern = pattern;
    }
    
    public int getFrequency() { return this.frequency; }
    public BitPattern getBitPattern() { return this.pattern; }
    
    public String toString() { return "Frequency: " + this.getFrequency + "; Bit Pattern: " + this.getBitPattern(); }
}
