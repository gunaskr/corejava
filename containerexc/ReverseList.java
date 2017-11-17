import java.util.*;



public class ReverseList{
    public static void main(String... args){
        List<String> list = Arrays.asList(args);
        List<String> reversed = new ArrayList<String>(list.size());
        System.out.println(list);
        ListIterator<String> iter = list.listIterator(list.size());
        while(iter.hasPrevious()){
            reversed.add(iter.previous());
        }
        System.out.println(reversed);
    }
}