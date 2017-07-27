import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


class Employee implements Comparable<Employee>{
  public int age;
  Employee(int age){
  this.age = age;
  }
  
  @Override
  public int compareTo(Employee o){
  	  return this.age - o.age;
  }
  
  @Override
  public String	toString(){
  	  return "{Employee:{age:"+this.age+"}}";
  }
}

public class TestComparator{
 public static void main(String... args){
 	 List sample = new ArrayList<Employee>();
 	 sample.add(new Employee(20));
 	 sample.add(new Employee(30));
 	 sample.add(new Employee(10));
 	 
 	 Collections.sort(sample);
 	 System.out.println("Ascending with comparable");
 	 System.out.println(sample);
 	 System.out.println("Descending with comparator");
 	 Collections.sort(sample,(Employee a,Employee b)->b.age-a.age);
 	 System.out.println(sample);
 
 }
}