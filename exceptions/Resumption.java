public class Resumption{
    public static void main(String[] args) {
        boolean notdone = true;
        int i = 0;
        while(notdone){
            try{
                if(i<5)
                throw new Exception();
                else
                notdone = false;
            }catch(Exception e){
                System.out.println("caught error");
                i++;
            }
        }
        System.out.println("program done "+i);
    }
}