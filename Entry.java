// file: Entry.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// ADT for a value in a symbol table used in Huffman encoding
//
public interface Entry
{
    public int getFrequency();
    public BitPattern getBitPattern();
    public String toString();
}