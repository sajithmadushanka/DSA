public class Main{
    public static void main(String[] args) {
        CircularQ circularQ = new CircularQ(5);
        circularQ.insert(10);
        circularQ.insert(20);
        circularQ.insert(30);
        circularQ.insert(40);
        circularQ.insert(50);
        circularQ.insert(60);


        // System.out.println(circularQ.frontPeek());
        System.out.println(circularQ.remove());
        System.out.println(circularQ.remove());
        circularQ.insert(60);
        System.out.println(circularQ.frontPeek());
  ;

    }
}
class CircularQ{
    private int front;
    private int rear;
    private int nitems;
    private double[] circularQarray;
    private int maxSize;

    CircularQ(int s){
        this.maxSize = s;
        this.circularQarray = new double[this.maxSize];
        this.front = 0;
        this.rear = -1;
        this.nitems = 0;
    }
    public void insert(double value){
        if(maxSize - 1 != rear){
            circularQarray[++rear] = value;
            nitems++;
        }else{
            if(nitems == maxSize){
                System.out.println("the queue is fulled");
            }else{
                rear= 0;
                front = 0;
                circularQarray[rear++] = value;
                nitems++;
            }
            
        }
    }

    public double remove(){
        if(nitems != 0){
            {
                nitems--;
                return circularQarray[front++];
            }
        }return -99;
    }
    public double frontPeek(){
        if(nitems != 0){
            return circularQarray[front];
        }return - 99;
    }
}