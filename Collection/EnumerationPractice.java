package Collection;
import java.util.Hashtable;
import java.util.Stack;
import java.util.*;
public class EnumerationPractice {
    public static void main(String[] args){
        // Enumeration is Interface
        // Introduced for Iterating the Legacy collection objects
        // Legacy classes - v1.0
        // HashTable, Stack, Vector, Dictoinary and Properties
        // New classes - v1.2

        Vector<String> v =new Vector<>();
        v.add("banana");
        v.add("Cherry");
        v.add("Mango");
        v.add("Apple");
        Enumeration<String> e= v.elements();
        // Enumeration as two method for iteration
        //e.hasMoreElements();-->check next element is there or not
        //e.nextElement();--> retrive the elements
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        // Hashtable

        Hashtable<String,Integer> ages =new Hashtable<>();
        ages.put("Alice", 30);
        ages.put("India",500);
        ages.put("Bob", 25);
        
        Enumeration<Integer> e1 =ages.elements();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
        //Properties
        

    }
}
