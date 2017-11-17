import java.util.*;

class Generator{
    private List<String> characters = 
    Arrays.asList(
        "Ned Stark",
        "Catelyn Stark",
        "Rob Stark",
        "Sansa Stark",
        "Arya Stark",
        "Bran Stark",
        "Rickon Stark");
    private ListIterator<String> charIter = characters.listIterator();

    public String next(){
        return charIter.hasNext()?charIter.next():(charIter = characters.listIterator()).next();
    }
}
public class GenerateCharacter {
    public static void main(String... args){
        Generator gen = new Generator();
        String[] arr = new String[10];
        List<String> list = new ArrayList<String>(10);
        for(int i =0; i<10;i++){
            arr[i]=gen.next();
        }
        for(int i =0; i<10;i++){
            list.add(gen.next());
        }
        System.out.println(list);
    }

}