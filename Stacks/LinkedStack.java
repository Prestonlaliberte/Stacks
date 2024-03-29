/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Stacks;

/**
 *
 * @author assiterk
 */
public class LinkedStack<T> implements StackInterface<T> {
  private Node topNode; 
  private int nElements=0;
  
  public LinkedStack() { topNode=null; }
 
  public void push(T newEntry) { 
     Node newNode=new Node(newEntry,topNode); 
     topNode=newNode; 
     nElements++;
  }
  public T pop() { 
     T top = peek(); 
     if (topNode!=null) 
        topNode=topNode.next;
     nElements--;
     return top; 
  }
  public T peek() { 
     T top=null; 
     if (topNode != null) 
        top=topNode.data; 
     return top; 
  }
  public boolean isEmpty() { 
     return topNode == null; 
  }
  public void clear() { 
     topNode = null;
     nElements=0;
  }
  public int size() {
      return nElements;
  }
 
  // Print from top to bottom
    @Override
 public String toString() {
    String s;
    s = "[";
    Node current = topNode;
    while (current != null) {
      s += " " + current.data;
      current = current.next;
    }
    return s + "]";
 }
 
  /**********************/
  /* Private Node class */
  /**********************/
  
  private class Node {
   private T    data; // entry in list
   private Node next; // link to next node

  private Node(T dataPortion)
  {
   data = dataPortion;
   next = null; 
  } // end constructor
  
  private Node(T dataPortion, Node nextNode)
  {
   data = dataPortion;
   next = nextNode; 
  } // end constructor
  
 } // end Node
  
 


 public static void main(String[] args) {
     LinkedStack<String> ls = new LinkedStack<String>();
     ls.push("Doe");
     System.out.println(ls);
     ls.push("Tea");
     System.out.println(ls);
     ls.push("La");
     System.out.println(ls);
     ls.push("So");
     System.out.println(ls);
     ls.push("Far");
     System.out.println(ls);
     ls.push("Me");
     System.out.println(ls);    
     ls.push("Ray");
     System.out.println(ls);   
     ls.push("Doe");
     
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
     ls.pop();
     System.out.println(ls);
     ls.clear();
     System.out.println(ls);
 }
}

