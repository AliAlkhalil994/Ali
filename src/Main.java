public class Main {

    public static void main(String[] args) {

        Network network = new Network("optimaal");

        Component wbs1 = new Component("Webserver 1","wbs",95,7000);
        network.addComponent(wbs1);

        Component dbs1 = new Component("Database server 1","dbs",95,7000);
        network.addComponent(dbs1);

        System.out.println(network.CalculateUptime());
        System.out.println(network.CalculatePrice());

        MainScreen screen = new MainScreen(network);

    }
}