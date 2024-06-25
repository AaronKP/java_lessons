public class CatchingEgMain2 {
	 public static void main(String[] args) {
        CatchingEg2 myObject = new CatchingEg2();
        try{
            myObject.doSomething();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Finished");
    }
}
