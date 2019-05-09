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

        double uptimeWebservers = 1;
        double uptimeDBservers = 1;

        for (Component c : network) {

            if (c.getType().equals("wbs")) {
                uptimeWebservers = uptimeWebservers*(1- c.getUptime()/100);
            } else if (c.getType().equals("dbs")) {
                uptimeDBservers = uptimeDBservers*(1- c.getUptime()/100);
            }

        }

        uptimeWebservers = 1-uptimeWebservers;
        uptimeDBservers = 1-uptimeDBservers;

        uptimeWebservers = uptimeWebservers*(new Component("pfSense", "firewall", 99.999, 2000)).getUptime()/100;
        uptimeDBservers = uptimeDBservers*(new Component("DBloadbalancer", "DBloadbalancer", 99.999, 2000)).getUptime()/100;

        return uptimeWebservers*uptimeDBservers*100;
    }

    public ArrayList<Component> getNetwork() {
        return this.network;
    }

    public String getName() {
        return name;
    }
}
