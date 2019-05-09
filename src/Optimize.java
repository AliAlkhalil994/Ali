import java.util.ArrayList;
import java.util.Random;

public class Optimize {

    private Network network;
    private double requiredUptime;
    private Network optimizeConfig;
    private ArrayList<Component> setupComponents;
    private Random random;

    public Optimize(Network network, double requiredUptime) {
        this.network = network;
        this.requiredUptime = requiredUptime;
        this.setupComponents = new SetupComponents().getSetupComponent();

        random = new Random();


        for (int i = 0; i < 1000; i++) {
            optimizeConfig = new Network("Network");

            for (int x = 0; x <= random.nextInt(30); x++) {
                Component comp = setupComponents.get(random.nextInt(setupComponents.size()));
                network.addComponent(comp);
            }

            double configUptime = optimizeConfig.CalculateUptime();

            if(network == null){
                this.network = optimizeConfig;
            }else if (configUptime > requiredUptime) {
                if (network.CalculatePrice() > optimizeConfig.CalculatePrice()) {
                    this.network = optimizeConfig;
                }
            } else if (network.CalculateUptime() < configUptime) {
                this.network = optimizeConfig;
            }

        }

    }

    public Network getNetwork() {
        return this.network;
    }
}
