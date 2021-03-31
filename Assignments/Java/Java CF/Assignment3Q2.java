import java.util.*;
public class Assignment3Q2 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<String>();
        h.add("Rishav");
        h.add("Maamin");
        h.add("Alok");
        h.add("Ashutosh");
        for(String x:h){
            System.out.println(x);
        }
        System.out.println(" ");
        
        LinkedHashSet<String> a=new LinkedHashSet<String>();
        a.add("Rishav");
        a.add("Maamin");
        a.add("Alok");
        a.add("Ashutosh");
        for(String y:a){
            System.out.println(y);
        }
        }
    
}