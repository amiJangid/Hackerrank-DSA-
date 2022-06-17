import java.io.*;
import java.util.*;
class Node
{
    int data;
    Node next;
}
class LinkedList
{
    Node head;
    Node tail;
    int size;
    LinkedList()
    {
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    
    public void addElement(int data)
    {   Node node=new Node();
           node.data=data;
           node.next=null;
        //add at first
        if(size==0)
        {
           
           head=tail=node; 
           
        }else
        {
        //add at any other index 
         this.tail.next=node;
         tail=node;
        }
        
        this.size++;
    }
    public void addElementAtEnd(int data)
    {
        Node node=new Node();
        tail.next=node;
        node.data=data;
        this.size++;
    }
    public void printLinkedList()
    {   Node node=this.head;
        while(node!=null)
        {   System.out.println(node.data);
            node=node.next;
        }
    }
}
public class Solution {

    public static void main(String[] args) 
    {
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt(); 
    LinkedList list=new LinkedList();
    for(int i=0;i<n;i++)
    {
        list.addElement(scn.nextInt());
    }
    list.printLinkedList();
    }
    
}
