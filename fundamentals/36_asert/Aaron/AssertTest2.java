public class AssertTest2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        assert a>0 : "a is not greater than 0";
        assert b >10 : "b is less than or equal to 10";
        System.out.println("Finished");
    }
}
