public class Main {

    public static void main(String[] args) {

        Network network = new Network("optimaal");

        Component wbs1 = new Component("Webserver 1","wbs",95,7000);
        network.addComponent(wbs1);

        Component dbs1 = new Component("Database server 1","dbs",95,7000);
        network.addComponent(dbs1);

        System.out.println(network.CalculateUptime());
        System.out.println(network.CalculatePrice());

        Optimize optimized = new Optimize(network,99.99);
        network = optimized.getNetwork();

        System.out.println("-------------------------");

        System.out.println(network.CalculateUptime());
        System.out.println(network.CalculatePrice());

        System.out.println(network.getNetwork().size());

    }
}