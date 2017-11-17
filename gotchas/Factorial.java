public class Factorial{

    public static void main(String... args){
        System.out.println(fact(Integer.parseInt(args[0])));
    }

    static int fact(int f){
        if(f == 1 || f==0)
          return 1;
        return f*fact(f-1);
    }
}