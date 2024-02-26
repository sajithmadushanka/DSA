public class Main{
    public static void main(String[] args) {
        StackX stackX = new StackX(5);
        
        stackX.push(10);
        stackX.push(20);
        stackX.push(30);
        stackX.push(40);
        stackX.push(50);
        stackX.push(60);
        System.out.println(stackX.isEmpty());
        System.out.println(stackX.isFull());
    }
}


class StackX{
    private int maxSize;
    private double[] stackArray;
    private int top;

    public StackX(int s){
        this.maxSize = s;   
        this.stackArray = new double[maxSize];
        this.top = -1;
    }
    public void push(double j){
            if(isFull()){
                System.out.println(j + " is cannot add becx the stackx is already fulled");
            }else{
                stackArray[++top] = j;
            }
    }
    public double pop(){
        if(!isEmpty()) return stackArray[top--];
        return -99;
    }
    public double peek(){
        if(!isEmpty()) return stackArray[top];
        return -99;
    }
    public boolean isFull(){
        return maxSize - 1 == top;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}