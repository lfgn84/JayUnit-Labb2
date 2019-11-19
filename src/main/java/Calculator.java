

public class Calculator {
    double[] d = new double[]{1,2,3,4};



    public double sum(double x, double y){
        return x+y;
    }
    public double rest(double x, double y){
        return x-y;
    }
    public double multiply(double x, double y){
        return x*y;
    }
    public double divide(int x, int y){

        return x / y;
    }
    public double pct(double x){
        return x/100;
    }
    private int division(int x, int y) {
        if (x == 0 || y == 0) {
            throw new IllegalArgumentException(
                    "Divident must be bigger than zero");
        }
        return x / y;
    }

}



