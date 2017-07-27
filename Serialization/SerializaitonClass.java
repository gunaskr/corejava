import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
   public String firstName;
   public String lastName;
   private static final long serialVersionUID = 5462223600l;
}

public class SerializaitonClass {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Vivekanand";
		emp.lastName = "Gautam";
		
		Employee emp2 = new Employee();
		emp.firstName = "Gunasekar";
		emp.lastName = "A";

		try {
			FileOutputStream fileOut = new FileOutputStream("./employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.writeObject(emp2);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in ./employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}