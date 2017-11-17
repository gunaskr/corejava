import java.util.*;
import java.util.stream.Collectors;
public class StackExmp{
    public static void main(String... args){
        String input = "+U+n+c—+e+r+t—+a-+i-+n+t+y—+ -+r+u—+l+e+s—";
        Stack<Character> chars = new Stack<Character>();
        ListIterator<Character> cIterator = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList()).listIterator();
        while(cIterator.hasNext()){
            Character c = cIterator.next();
            if(c == '+'){
                if(cIterator.hasNext()){
                    chars.push(cIterator.next());
                }
            } else if(c =='-'){
                chars.pop();
            }
        }
        System.out.println(chars);
    }
}