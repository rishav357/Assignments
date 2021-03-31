import java.util.*;

class Person{
    public String name;
    public int height;
    public double weight;
    public Person(String name,int height,double weight){
        this.name=name;
        this.height=height;
        this.weight=weight;
    }
}
class sortbyweight implements Comparator<Person>
{
    @Override
    public int compare(Person p1,Person p2){
        if(p1.weight>p2.weight)
        {
            return -1;
        }
        else if(p1.weight==p2.weight)
        {
            if(p1.height>p2.height)
            {
                return -1;
            }
            else{
                return 1;
            }
        }
        else
        {
            return 1;
        }
    }
}
public class Assignment3Q1 {
    public static void main(String[] args) {
        TreeSet<Person> a=new TreeSet<Person>(new sortbyweight());
        a.add(new Person("Rishav",170,70));
    	a.add(new Person("Maamin",170,50));
    	a.add(new Person("Alok",170,50));
    	a.add(new Person("Bamra",160,80));
    	
    	
    	for(Person p:a)
    	{
    	    System.out.println(p.name+ " " +p.weight+ " "+p.height);
    	}
    }
}