public class Calculator {
    private int x;
    private int y;
    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int add(){
        int i = x + y;
        return i;
    };

    public int substract() {
        int i = x - y;
        return i;
    }
}
