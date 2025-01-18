public class Bus extends Transport{
    private int routeNum;

    public Bus(String name, int routeNum) {
        super(name);
        this.routeNum =   routeNum;
    }

    @Override
    public void Move() {
    System.out.println("Автобус едет по дороге");
    }

    @Override
    public String toString() {
        return "Автобус едет под номером " + GetRouteNum();
    }

    public int GetRouteNum(){
        return routeNum;
    }




}
