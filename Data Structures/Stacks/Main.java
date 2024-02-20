// last in first out LIFO principle

class MyStack{
    int maxSize;
    int top;
    int[] array;

    MyStack(int size){
        this.array = new int[size];
        this.top = -1;
        this.maxSize = size;
    }
    public void push(int no){
        if(top == maxSize -1){
            System.out.println("stack is fully");
        }
        else array[++top] = no; 
    }
    public int pop(){
        if(!isEmpty()){
            return array[top--];
        }
        else return -99;
    }
    public int peak(){
        if(!isEmpty()){
            return array[top];
        }else return -99;
    }
    public  void display(){
        for (int i = top; i > -1;  i-- ) {
            System.out.println("stack : " +  i + " " + array[i]);
        }
    }
    public boolean isEmpty(){
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {
        MyStack stack1=  new MyStack(5);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        stack1.push(50);
        stack1.push(60);
        System.out.println("pop "+ stack1.pop());
        stack1.push(70);
       
        System.out.println("pop "+ stack1.pop());
        System.out.println("pop "+ stack1.pop());
        System.out.println("peak "+ stack1.peak());
        System.out.println("peak "+ stack1.peak());
    
        stack1.display();
    }
}
