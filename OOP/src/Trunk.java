public class Trunk extends Transport implements ICargo {
    private int cargoCapacity;
    private final int initialCargoCapacity;

    public Trunk(String name, int cargoCapacity) {
        super(name);
        this.cargoCapacity = cargoCapacity;
        this.initialCargoCapacity = cargoCapacity;
    }

    @Override
    public void Move() {
        System.out.println("Грузовик едет по дороге");
    }

    @Override
    public String toString() {
        return "Грузовик " + getName() + " имеет вместимость " + GetCargo();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int GetCargo() {
        return cargoCapacity;
    }

    @Override
    public void loadCargo(int weight) {
        if (weight > cargoCapacity) {
            System.out.println("Мы не можем перегрузить грузовик");
            return;
        }
        this.cargoCapacity += weight;
        System.out.println("Грузовик загружен на " + weight + " единиц");
    }

    @Override
    public void unloadCargo(int weight) {
        if (weight > cargoCapacity) {
            cargoCapacity = 0;
            System.out.println("Разгружаемый вес был больше, чем вес загруженный в грузовик, грузовик опустошен полностью");
        } else if (weight == cargoCapacity) {
            cargoCapacity -= weight;
            System.out.println("Грузовик разгружен полностью");
        } else {
            cargoCapacity -= weight;
            System.out.println("Грузовик разгружен, осталось места на " + cargoCapacity);
        }
        cargoCapacity = initialCargoCapacity;
    }
}
