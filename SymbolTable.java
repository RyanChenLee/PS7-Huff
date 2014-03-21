// file: SymbolTable.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// ADT for a symbol table used in Huffman encoding
//
public interface SymbolTable
{
    
    public int getFrequency();
    public BitPattern getBitPattern();
    public String toString();
}