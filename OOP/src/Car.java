public class Car extends Transport{
    private final int passengerCapacity;
    public Car(String name, int passengerCapacity){
        super(name);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void Move() {
    System.out.println("Легковой автомобиль едет по дороге");
    }

    @Override
    public String toString() {
        return "Вместимость легкового автомобиля: " + passengerCapacity + " Название автомобиля: " + getName();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
