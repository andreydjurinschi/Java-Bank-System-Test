public abstract class Transport {
    private final String Name;
    private int Year;
    public abstract void Move();
    public abstract String toString();
    public String getName(){return this.Name;};
    public Transport(String name){
        this.Name = name;
    }
}
