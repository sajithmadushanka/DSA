import java.util.Scanner;

class MyArray{
  private int[] array;
    MyArray(int size){
        this.array = new int[size];
    }
    int getArraySize(){
        return array.length;
    }
}

public class Main{
    public static void main(String[] args) {
       MyArray array1 = new MyArray(5);
    System.out.println(array1.getArraySize());

    //    Scanner input = new Scanner(System.in);
    //    System.out.println("Enter");
    //    int[] arr = new int[input.nextInt()];
    //    System.out.println(arr.length);
    //    input.close();
    }
}