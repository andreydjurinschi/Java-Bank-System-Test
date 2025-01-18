import java.util.ArrayList;
import java.util.List;

public class Garage <T extends  Transport>{
    List<T> garage = new ArrayList<>();
    public void addTransport(T transport){
    garage.add(transport);
    }
    public List<T> getAllTransports(){
        return garage;
    }
}
