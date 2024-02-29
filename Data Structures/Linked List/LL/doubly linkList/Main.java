

public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFront(50);
        linkList.insertFront(20);
        linkList.insertFront(30);
        linkList.insertFront(40);
        
    //    System.out.println(linkList.lastNode.iData);
       linkList.displayListBack();
    }
}

class Node{
    int iData;
    Node next;
    Node previous;

    public Node(int data){
        this.iData = data;
        this.next = null;
        this.previous = null;
    }
    public void display(){
        System.out.println(iData);
    }
}
class LinkList{
    Node firstNode;
    public Node lastNode;
  

    LinkList(){
        firstNode = null;
        lastNode =  null;
       
    }
    public void displayList(){
        Node current = firstNode;
        while (current != null) {
            current.display();
            current = current.next;
        }
    }
    public void displayListBack(){
        Node current = lastNode;
        while (current != null) {
            current.display();
            current = current.previous;
        }
    }


    public void insertFront(int n){
        Node newNode = new Node(n);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode; // When list was empty, new node is both first and last.
        } else {
            firstNode.previous = newNode; 
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }
    
}