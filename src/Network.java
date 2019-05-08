import java.util.ArrayList;

public class Network {

    private String name;
    private ArrayList<Component> network;

    public Network(String name) {
        this.name = name;
        this.network = new ArrayList<Component>();
    }

    public Network(String name, ArrayList<Component> network) {
        this.name = name;
        this.network = network;
    }

    public void addComponent(Component component) {
        this.network.add(component);
    }

    public double CalculatePrice() {

        double maxPrice = 4000;

        for (Component c : network) {

            if (c.getType().equals("wbs") || c.getType().equals("dbs")) {

                maxPrice += c.getPrice();

            }

        }

        return maxPrice;
    }

    public double CalculateUptime() {

        double uptime = 1;

        for (Component c : network) {

            if (c.getType().equals("wbs")) {

            } else if (c.getType().equals("dbs")) {

            }

        }

        return uptime;
    }

    public double CalculateUptime(String type) {

        double uptime = 1;

        for (Component c : network) {

            if (c.getType().equals("wbs")) {



            } else if (c.getType().equals("dbs")) {

            }

        }

        return uptime;
    }

    public ArrayList<Component> getNetwork() {
        return this.network;
    }

    public String getName() {
        return name;
    }
}
