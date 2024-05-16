public class ConstC extends ConstB{
    public ConstC(String name){
   	 super(name,"Smith");
   	 System.out.println("Class C:"+name);
    }   

    public ConstC(){
        this("Aaron");
    }
}
