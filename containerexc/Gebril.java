import java.util.*;

public class Gebril{

    final int gebrilNo;

    Gebril(int no){
        this.gebrilNo = no;
    }

    public String hop(){
        return "Gebril No."+gebrilNo+" hopping";
    }

    public static void main(String... args){
        List<Gebril> list = new ArrayList<Gebril>(5);
        for(int i=0; i<5; i++){
            list.add(new Gebril(i));
        }

        for(int k=0; k < list.size(); k++){
            System.out.println(list.get(k).hop());
        }

        list.forEach(i -> System.out.println(i.hop()));
    }
}