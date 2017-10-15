import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.stream.Collectors;
import java.lang.String;
import java.util.Arrays;
import java.util.Iterator;

import java.util.HashSet;

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

   @Test
   public void testIterator() {
       for(Iterator it = Arrays.asList("Buenos Aires", "Córdoba").iterator();it.hasNext();){
           System.out.println(it.next());
       }
   }
}