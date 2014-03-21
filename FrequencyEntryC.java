// file: FrequencyEntryC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for an entry into a frequency table used in Huffman encoding
//
public class FrequencyEntryC implements FrequencyEntry
{
    private int frequency;
    private BitPattern pattern;
    
    publicFrequencyEntryC(frequency, pattern)
    {
        this.frequency = frequency;
        this.pattern = pattern;
    }
    
    public int getFrequency() { return this.frequency; }
    public BitPattern getBitPattern() { return this.pattern; }
    public String toString() { return "Frequency: " + this.getFrequency + "; Bit Pattern: " + this.getBitPattern(); }
}