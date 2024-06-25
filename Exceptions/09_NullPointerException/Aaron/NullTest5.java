  public class NullTest5{
    public static void main(String[]args){
        String f = null ;
        if(f!=null){
             System.out.println("this will cause null pointer exception  "+ f.length());
        }
       
  }
}
