package ArraySorting;

public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
     //   as.sort();
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);


        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting quicksort =()-> System.out.println("quickSort");
        as.sort(quicksort);
        Sorting bubbleSort=()-> System.out.println("bubble sorting");// can also pass direct action through the method
        as.sort(bubbleSort);

    }
    private void sort(Sorting sorting){ //passing sorting interface
       sorting.sort();
    }



}

interface MyLambda{
    void print();
}

//type inference
interface StringLengthLambda{
    int getLength(String S);
}
//you dont need to put type in the lambda bracket, compiler will figure out