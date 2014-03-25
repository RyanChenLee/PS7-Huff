// file: HuffTreeC.java
// author: Matthew Brown & Ryan Lee
// date: 3/28/14
//
// Implementation of an ADT for a weighted binary tree used in Huffman encoding
//

public class HuffTreeC implements HuffTree
{
    private int size;
    private Node root;
    
    private class Node
    {
        private Node left;
        private Node right;
        private int weight;
        private Integer symbol;
        
        private Node(int weight, Integer symbol, Node left, Node right)
        {
            this.weight = weight;
            this.symbol = symbol;
            this.left = left;
            this.right = right;
        }
        
        public Node getLeft(){ return this.left; }
        public Node getRight(){ return this.right; }
        public int getWeight(){ return this.weight; }
        public Integer getSymbol(){ return this.symbol; }
        
    }
    
    public HuffTreeC()
    {
        this.root = null;
        this.size = 0;
    }
    
    public int getTreeWeight() { return this.root.getWeight(); } // For some reason this extra method is required to make the compareTo function work
    public int size(){ return this.size; }
    public String toString(){ return "Hi"; }
    public int compareTo(HuffTree other)
    {
        return (this.getTreeWeight()) - (other.getTreeWeight());
    }
}