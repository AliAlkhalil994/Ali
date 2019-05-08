public class Main {

    public static void main(String[] args) {

        Network network = new Network("optimaal");
        Optimize optimized = new Optimize(network,99.99);

        Component wbs1 = new Component("Webserver 1","wbs",90,7000);
        Component wbs2 = new Component("Webserver 2","wbs",95,12000);
        Component wbs3 = new Component("Webserver 3","wbs",90,7000);
        network.addComponent(wbs1);
        network.addComponent(wbs2);
        network.addComponent(wbs3);

        System.out.println(network.CalculatePrice());

    }
}