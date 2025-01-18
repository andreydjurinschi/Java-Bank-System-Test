import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Garage<Transport> garage = new Garage<>();

        Car car = new Car("Автомобиль BMW", 4);
        garage.addTransport(car);

        Trunk trunk = new Trunk("Грузовик Trunk", 100);
        garage.addTransport(trunk);

        Bus bus = new Bus("Автобус 11", 102);
        garage.addTransport(bus);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nГараж состоит из:");
            for (Transport transport : garage.getAllTransports()) {
                System.out.print(transport.getName() + "; ");
            }

            System.out.println("\nВыберите действие:");
            System.out.println("1. Поехать на автомобиле");
            System.out.println("2. Поехать на грузовике");
            System.out.println("3. Поехать на автобусе");
            System.out.println("4. Загрузить грузовик");
            System.out.println("5. Разгрузить грузовик");
            System.out.println("6. Показать информацию о транспортных средствах");
            System.out.println("7. Выйти\n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    car.Move();
                    break;
                case 2:
                    trunk.Move();
                    break;
                case 3:
                    bus.Move();
                    break;
                case 4:
                    System.out.print("Введите вес для загрузки грузовика: ");
                    int loadWeight = scanner.nextInt();
                    trunk.loadCargo(loadWeight);
                    break;
                case 5:
                    System.out.print("Введите вес для разгрузки грузовика: ");
                    int unloadWeight = scanner.nextInt();
                    trunk.unloadCargo(unloadWeight);
                    break;
                case 6:
                    System.out.println("Информация о транспортных средствах:");
                    System.out.println(car);
                    System.out.println(trunk);
                    System.out.println(bus);
                    break;
                case 7:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
}
