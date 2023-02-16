
public class TargetComparator {
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
