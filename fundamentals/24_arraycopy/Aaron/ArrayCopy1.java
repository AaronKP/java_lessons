public class ArrayCopy1 {
   public static void main(String[] args) {
      int[ ] src  = new int[]{1,2,3,4,5,6,7,8,9};
      int[ ] dest = new int[9];

      System.arraycopy( src, 0, dest, 0, 3);

      for(int i = 0; i< dest.length; i++){
         System.out.println(dest[i]);
      }
   }

}
