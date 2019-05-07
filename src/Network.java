import java.util.ArrayList;

public class Network {

    private String name;
    private ArrayList<Component> network;

    public Network(String name){
        this.name = name;
    }

    public Network(String name, ArrayList<Component> network) {
        this.name = name;
        this.network = network;
    }

    public void addComponent(Component component){
        network.add(component);
    }

    public double CalculatePrice(){
        return 0.00;
    }

    public double CalculateUptime(){
        return 0.00;
    }

    public ArrayList<Component> getNetwork(){
        return this.network;
    }

    public String getName() {
        return name;
    }
}
