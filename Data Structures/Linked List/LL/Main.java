public class Main{
    public static void main(String[] args) {
        // Node  node1 = new Node(10);
        // Node  node2 = new Node(20);
        // Node node3 = new Node(30);

        // node1.next = node2;
        // node2.next = node3;

        LinkList linkList = new LinkList();
        linkList.insertFront(10);
        linkList.insertFront(20);
        linkList.insertFront(30);
        linkList.insertFront(40);
        linkList.displayList();
        System.out.println(linkList.deleteFront().iData);
        System.out.println(linkList.deleteFront().iData);

    }
}

class Node{
    public int iData;
    public Node next;

    Node(int data){
            this.iData = data;
            this.next = null;
    }
    public void displayList(){
        System.out.println(iData);
    }
}
class LinkList{
    private Node first;

    LinkList(){
        first = null;
    }
    public boolean isEmpty(){
        return first == null;
    }
    public void displayList(){
        Node currentNode = first;
        while (currentNode != null) {
            System.out.println(currentNode.iData);
            currentNode = currentNode.next;
        }
    }
    public void insertFront(int id){
        Node noden = new Node(id);
       noden.next = first;
       first = noden;

    }
    public Node deleteFront(){
        if(first != null){
            Node nodex = first;
            first = first.next;
            return nodex;
        }return null;
    }
  

}