// file: FrequencyEntry.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// ADT for a an entry into a frequency table used in Huffman encoding
//
public interface FrequencyEntry
{
    public int getFrequency();
    public BitPattern getBitPattern();
    public String toString();
}