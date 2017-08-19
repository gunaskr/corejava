import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.stream.Collectors;
import java.lang.String;
import java.util.Arrays;

public class TestCollection {
	
   String message = "Hello World";	

   @Test
   public void testStreamJoin() {
       String joined = Arrays.asList("Buenos Aires", "Córdoba")
       .stream()
       .map(Object::toString)
       .collect(Collectors.joining(","));
      assertEquals(joined,"Buenos Aires,Córdoba");
   }
}