public class WhileTest1 {
    public static void main(String[] args) {
        int [] lottonumbers = {233,444,678,675,897,678,453,567,455,456,453};
       
       int i=0;
       while(i < lottonumbers.length){
        System.out.println("index = "+ i +" value = "+lottonumbers[i]);
        i++;
       }
       
    }
}
