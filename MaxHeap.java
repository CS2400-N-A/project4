import java.util.Arrays;
/**
   A class that implements the ADT maxheap by using an array.
 
   @author Frank M. Carrano
   @author Timothy M. Henry
   @version 5.0
*/
public final class MaxHeap<T extends Comparable<? super T>>
             implements MaxHeapInterface<T>
{
   private T[] heap;      // Array of heap entries; ignore heap[0]
   private int lastIndex; // Index of last entry and number of entries
   private boolean integrityOK = false;
   private int reheap;
	private static final int DEFAULT_CAPACITY = 25;
	private static final int MAX_CAPACITY = 10000;
	
   
   public MaxHeap()
   {
      this(DEFAULT_CAPACITY); // Call next constructor
   } // end default constructor
   
   public MaxHeap(int initialCapacity)
   {
      // Is initialCapacity too small?
      if (initialCapacity < DEFAULT_CAPACITY)
         initialCapacity = DEFAULT_CAPACITY;
      else // Is initialCapacity too big?
         initialCapacity = checkCapacity(initialCapacity);
      
      // The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] tempHeap = (T[])new Comparable[initialCapacity + 1];
      heap = tempHeap;
      lastIndex = 0;
      reheap = 0;
      integrityOK = true;
   } // end constructor

   public void add(T newEntry)
   {
   //checkInitialization();
   int newIndex = lastIndex + 1;
   int parentIndex = lastIndex /2;
   while ((parentIndex > 0) && (newEntry.compareTo(heap[parentIndex])>0)) {
      heap[newIndex] = heap[parentIndex];
      newIndex = parentIndex;
      parentIndex = newIndex /2;
      reheap++;
      } // end while
      heap[newIndex] = newEntry;
      lastIndex++;
      //ensureCapacity();
      
   } // end add

   public T removeMax()
   {
      checkIntegrity();             // Ensure initialization of data fields
      T root = null;

      if (!isEmpty())
      {
         root = heap[1];            // Return value
         heap[1] = heap[lastIndex]; // Form a semiheap
         lastIndex--;               // Decrease size
         reheap(1);                 // Transform to a heap
      } // end if
      
      return root;
   } // end removeMax
   
   public T getMax()
   {
		checkIntegrity();
      T root = null;
      if (!isEmpty())
         root = heap[1];
      return root;
   } // end getMax

   public boolean isEmpty()
   {
      return lastIndex < 1;
   } // end isEmpty

   public int getSize()
   {
      return lastIndex;
   } // end getSize

   public void clear()
   {
		checkIntegrity();
      while (lastIndex > -1)
      {
         heap[lastIndex] = null;
         lastIndex--;
      } // end while
      lastIndex = 0;
   } // end clear

   private boolean checkIntegrity(){
      return integrityOK;
   }
   
<<<<<<< HEAD
   public T getEntry() {
      getEntry(lastIndex);
   }
   
   public T getEntry(int index) {
      checkIntegrity();
      return heap[index];
   }
   
   public int getSwaps() {
      return reheap;
   }
   
   public T remove(int pos) {
      T ejected = heap[pos]; 
      heap[pos]= null;
      reaheap(pos);
      return ejected;
   }
   
   public T reheap(int pos) {
      
   }
   
   public T reheap(T insert) {
   
=======
   private int checkCapacity(int capacity){
      if(capacity>MAX_CAPACITY)
         return MAX_CAPACITY;
      return capacity;
>>>>>>> dc04bdee3c52adb877579312c4fce0b48935fc65
   }
// . . .
} // end MaxHeap
