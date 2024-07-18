
public class Practice {
public static int z;

  static interface ii{
//      void hello();
//      void hello2();
  }

    class Inner{
      int a =10;
      static int b =100;

    }



    public static void main(String[] args) {
      Practice mainObj =new Practice();
      Practice.Inner innerObj= mainObj.new Inner();
        System.out.println(innerObj.a);


    }

    public void anonymousMethod(){
        ii interfaceObj = new ii(){

//            @Override
//            public void hello() {
//                System.out.println(z);
//            }
//
//            @Override
//            public void hello2() {
//
//            }

            int x =55;
            static int yy =10;

            public static void dd(){
                System.out.println("static method in anon class");
            }

            private  void in(){
                System.out.println("instance method in anon class");
            }

            {
                x=99;
            }

            static{
                yy=11;
            }



        };


    }


}