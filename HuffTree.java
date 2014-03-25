// file: HuffTree.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// ADT for a weighted binary tree used in Huffman encoding
//
public interface HuffTree extends Comparable<HuffTree>
{
    public int getTreeWeight();
    public int size();
    public String toString();
    public int compareTo(HuffTree other);

}