public class MultiTest1 {
    public static void main(String[] args) {
    	
        int [][] lottogroups = {{1111,2222,3333,4444},{6666,7777,8888,9999},{11111,121212,131313}};

       int counterRow=0;
        for(int [] outer: lottogroups){
            System.out.println("Group :"+ counterRow);
            int counterCol=0;
            for(int inner: lottogroups[counterRow]){
                if(lottogroups[counterRow][counterCol]%2==0){
                    System.out.println("  Value "+counterCol+" = "+lottogroups[counterRow][counterCol]);
                }
                counterCol++;
            }
            counterRow++;
        }
        System.out.println(lottogroups.length);
    }
}
