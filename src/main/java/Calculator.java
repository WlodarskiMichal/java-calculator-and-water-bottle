public class Calculator {
    private int x;
    private int y;
    private double a;
    private double b;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public int add(){
        int i = x + y;
        return i;
    };

    public int substract() {
        int i = x - y;
        return i;
    }

    public int multiply() {
        int i = x*y;
        return i;
    }

    public double divide() {
        double i = a/b;
        return i;
    }
}
