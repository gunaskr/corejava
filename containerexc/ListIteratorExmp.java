import java.util.*;


public class ListIteratorExmp {
    public static void main(String... args){
        List<Integer> first = Arrays.asList(1,2,3,4,5);
        List<Integer> second = new ArrayList<Integer>(first.size());
        ListIterator<Integer> firstItr = first.listIterator(5);
        while(firstItr.hasPrevious()){
            second.add(firstItr.previous());
        }
        System.out.println(second);
    }
}