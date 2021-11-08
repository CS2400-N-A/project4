import java.util.Scanner;
import java.io.*;
public class DriverMH {
    
    public static void main(String[] args) //throws IOException {
    
    
        System.out.println("Insert file here: ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.nextLine();
        
        File input = new File(filename);
        
        while (!input.exists()) {
            System.out.println("Invalid file.\n Insert file here: ");
            input = new File(filename);
        } //checks for file
        
        Scanner heapBuilder = new Scanner(input); //reads file
        
        MaxHeapInterface<int> heap1 = new MaxHeap<int>();
        
        System.out.println("Inserting data using add method"); //add method
        
        for (int i < 0; i < input.hasNext(); i++) {
            heap1.add(input.nextLine());
        }
        
        //All outputs for heap1
        
        PrintWriter export1 = new PrintWriter("data_sorted2.txt");
        export1.println("Heap built using sequential instructions: ");
        
        for (int i = 0, i < 10 && heap1.getsize(); i++) {
            export1.print(heap1.getEntry(i) + ",");
        } //first 10 or length of heap
        
        export1.println("Number of swaps is: "+ Integer.toString(heap1.getSwaps()));
        
    }
    
    
}