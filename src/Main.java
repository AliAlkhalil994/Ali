public class Main {

    public static void main(String[] args) {

        Network network = new Network("optimaal");

        Component wbs1 = new Component("Webserver 1","wbs",95,7000);
        Component wbs2 = new Component("Webserver 2","wbs",95,7000);
        Component wbs3 = new Component("Webserver 3","wbs",95,7000);
        Component wbs4 = new Component("Webserver 3","wbs",95,7000);
        Component wbs5 = new Component("Webserver 3","wbs",95,7000);
        network.addComponent(wbs1);
        network.addComponent(wbs2);
        network.addComponent(wbs3);
        network.addComponent(wbs4);
        network.addComponent(wbs5);

        Component dbs1 = new Component("Database server 1","dbs",95,7000);
        Component dbs2 = new Component("Database server 2","dbs",95,7000);
        Component dbs3 = new Component("Database server 3","dbs",95,7000);
        network.addComponent(dbs1);
        network.addComponent(dbs2);
        network.addComponent(dbs3);

        System.out.println(network.CalculateUptime());
        System.out.println(network.CalculatePrice());

        Optimize optimized = new Optimize(network,99.99);
        network = optimized.getNetwork();

        System.out.println("-------------------------");

        System.out.println(network.CalculateUptime());
        System.out.println(network.CalculatePrice());

    }
}