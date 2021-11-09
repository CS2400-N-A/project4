import java.util.Scanner;
import java.io.*;
public class DriverMH {
    
    public static void main(String[] args) {//throws IOException {
    
    
        System.out.println("Insert file here: ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.nextLine();
        
        File input = new File(filename);
        
        while (!input.exists()) {
            System.out.println("Invalid file.\n Insert file here: ");
            input = new File(filename);
        } //checks for file
        
        Scanner heapBuilder = new Scanner(input); //reads file
        
        MaxHeap<Integer> heap1 = new MaxHeap<>();
        
        System.out.println("Inserting data using add method"); //add method
        
        while(heapBuilder.hasNext()) {
            heap1.add(heapBuilder.nextInt());
        }
        
        //All outputs for heap1
        
        PrintWriter export1 = new PrintWriter("data_sorted2.txt");
        export1.println("Heap built using sequential instructions: ");
        
        for (int i = 0; i < 10 && i < heap1.getSize(); i++) {
            export1.print(heap1.getEntry(i) + ",");
        } //first 10 or length of heap
        
        export1.println("Number of swaps is: "+ Integer.toString(heap1.getSwaps())); // for swaps
        
        export1.println("Heap after 10 removals: "); // Initial line
        
        for (int i = 0; i < 10 && i < heap1.getSize(); i++) {
            heap1.removeMax();
        }
        
        for (int i = 0; i < 9 && i < heap1.getSize(); i++) {
            export1.println(heap1.getEntry(i+1) + ","); //printing first 10 in heap
        }
        export1.println(heap1.getEntry(10)); //printing last one without comma
        
        export1.close();
        kb.close();
        
        //-------
        
        MaxHeap<Integer> heap2 = new MaxHeap<>();
        
        System.out.println("Inserting data using reheap method"); //reheap method
        
        for (int i = 0; heapBuilder.hasNext(); i++) {
            heap2.reheap(heapBuilder.nextInt());
        }
        
        //All outputs for heap2
        
        PrintWriter export2 = new PrintWriter("data_sorted3.txt");
        export2.println("Heap built using optimal instructions: ");
        
        for (int i = 0; i < 10 && i < heap2.getSize(); i++) {
            export2.print(heap2.getEntry(i) + ",");
        } //first 10 or length of heap
        
        export2.println("Number of swaps is: "+ Integer.toString(heap2.getSwaps())); // for swaps
        
        export2.println("Heap after 10 removals: "); // Initial line
        
        for (int i = 0; i < 10 && i < heap2.getSize(); i++) {
            heap2.removeMax();
        }
        
        for (int i = 0; i < 9 && i < heap2.getSize(); i++) {
            export2.println(heap2.getEntry(i+1) + ","); //printing first 10 in heap
        }
        export2.println(heap2.getEntry(10)); //printing last one without comma
        export2.close();

        heapBuilder.close();
    }
    
    
}