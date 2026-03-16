package Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.*;
public class IteratorPractice {
  public static void main(String[] args){
    // Iterator - Interface
    // Introduction for iterating the all collection objects
    // All collection classes implement the Iterable interface
    // Lagacy classes - v1.0 + new Classes - v1.2
    // Iterator has three methods
    // hasNext() --> check next element is there or not
    // next() --> retrieve the element

    // ArrayList

    ArrayList<Integer> al =new ArrayList<>();
    al.add(10);
    al.add(5);
    al.add(100);
    al.add(90);
    Iterator<Integer> i = al.iterator();
    while(i.hasNext()){
        System.out.println(i.next());
    }
    // while(i.hasNext()){
    //     i.next(); // importment to remove the element ,the next() method asscesed current element to remove
    //     i.remove();
    // }
    Map<String,Integer> map=new HashMap<>();
    map.keySet().iterator();
    map.values().iterator();
    map.entrySet().iterator();
  }
}
