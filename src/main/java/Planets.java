public class Planets {
    private String name;
    private int size;

    public Planets(String name, int size){
        this.name = name;
        this.size = size;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getSize(){
        System.out.println(this.size);
    }
    public void explode(){
        System.out.println("Boooom");
    }
}
