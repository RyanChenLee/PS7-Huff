public interface Queue<T> {
    public void enqueue(T info); //info to put into the queue; "VOID" b/c it doesn't return anything! 
    public dequeue();
    public Boolean isEmpty(); //to tell if empty
    public String toString();
}