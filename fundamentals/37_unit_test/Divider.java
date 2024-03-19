public class Divider{
    public double divideByZero(double a){ 
        return a/0;
    }

    public double divideByNegative(double a,double b){ 
        return a/(-1*b);
    }

    public double divideByPositive(double a,double b){ 
        return a/b;
    }
}
