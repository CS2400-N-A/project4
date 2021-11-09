import java.util.Scanner;
import java.io.*;
public class DriverMH {
    
    public static void main(String[] args) throws IOException {
    
    
        System.out.println("Insert file here: ");
        Scanner kb = new Scanner(System.in);
        String filename = kb.nextLine();
        
        File input = new File(filename);
        
        while (!input.exists()) {
            System.out.println("Invalid file.\n Insert file here: ");
            input = new File(filename);
        } //checks for file
        
        Scanner heapBuilder = new Scanner(input); //reads file
        
        MaxHeap<Integer> heap1 = new MaxHeap<>(100);
        
        System.out.println("Inserting data using add method"); //add method
        
        while(heapBuilder.hasNext()) {
            heap1.add(heapBuilder.nextInt());
        }
        
        //All outputs for heap1
        
        PrintWriter export1 = new PrintWriter("data_sorted2.txt");
        export1.print("Heap built using sequential instructions: ");
        
        for (int i = 1; i < 10 && i < heap1.getSize(); i++) {
            export1.print(heap1.getEntry(i) + ",");
        } //first 9 or length of heap
        export1.print(heap1.getEntry(11)+"\n"); //printing last one without
        
        export1.println("Number of swaps is: "+ Integer.toString(heap1.getSwaps())); // for swaps
        
        export1.println("Heap after 10 removals: "); // Initial line
        
        for (int i = 0; i < 10 && i < heap1.getSize(); i++) {
            heap1.removeMax();
        }
        
        for (int i = 1; i < 10 && i < heap1.getSize(); i++) {
            export1.print(heap1.getEntry(i+1) + ","); //printing first 10 in heap
        }
        export1.print(heap1.getEntry(11)); //printing last one without comma
        
        export1.close();
        kb.close();
        heapBuilder.close();
        
        //-------
        
        MaxHeap<Integer> heap2 = new MaxHeap<>(100);

        Scanner heapBuilder2 = new Scanner(input);
        
        System.out.println("Inserting data using reheap method"); //reheap method
        
        while(heapBuilder2.hasNext()){
            heap2.addOptimal(heapBuilder2.nextInt());
        }
        
        //All outputs for heap2
        
        PrintWriter export2 = new PrintWriter("data_sorted3.txt");
        export2.print("Heap built using optimal instructions: ");
        
        for (int i = 1; i < 10 && i < heap2.getSize(); i++) {
            export2.print(heap2.getEntry(i) + ",");
        } //first 9 or length of heap
        export2.print(heap2.getEntry(11)); //printing last one without comma
        
        export2.println("Number of swaps is: "+ Integer.toString(heap2.getSwaps())); // for swaps
        
        export2.println("Heap after 10 removals: "); // Initial line
        
        for (int i = 0; i < 10 && i < heap2.getSize(); i++) {
            heap2.removeMax();
        }
        
        for (int i = 1; i < 10 && i < heap2.getSize(); i++) {
            export2.print(heap2.getEntry(i+1) + ","); //printing first 10 in heap
        }
        export2.print(heap2.getEntry(11)); //printing last one without comma
        export2.close();

        heapBuilder2.close();
    }
    
    
}