import java.util.*;
public class Assignment3Q3 {
    
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        a.add("Rishav");
        a.add("Maamin");
        a.add("Alok");
        a.add("Ashutosh");
        ListIterator<String> li = a.listIterator();
      while (li.hasNext()) {
         li.next();
      }
       while (li.hasPrevious()) {
         System.out.println(li.previous());
      }
            
        
    }
}