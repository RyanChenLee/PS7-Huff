// file: HuffTreeC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a weighted binary tree used in Huffman encoding
//
import java.util.PriorityQueue;

public class HuffTreeC
{
    private int size;
    private Node root;
    
    private class Node
    {
        private Node left;
        private Node right;
        private int weight;
    //  private [something] symbol;
        
        private Node(int weight, symbol, Node left, Node right)
        {
            this.weight = weight;
            this.symbol = symbol;
            this.left = left;
            this.right = right;
        }
    }
    
    public HuffTreeC()
    {
        
    }
    public int size();
    public String toString();
}