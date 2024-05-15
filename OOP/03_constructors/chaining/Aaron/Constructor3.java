public class Constructor3 {
    public Constructor3(){
        this("Aaron","Padiachy");
   	     System.out.println("Running no-args constructor");
     

    }
    
    public Constructor3(String name, String surname){
        this("Aaron","Padiachy","Programmer");
   	 System.out.println("Running name and surname arg constructor: Name ="+name+" surname= "+surname);
     
    }

    public Constructor3(String name, String surname, String job){
    
     System.out.println(name+" "+surname+" is a "+job);
    }
}
