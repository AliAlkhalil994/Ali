import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Optimize {

    private Network network;
    private double requiredUptime;
    private Network optimizeConfig;
    private ArrayList<Component> setupComponents;
    private Random random;
    private int randomInt;

    public Optimize(Network network, double requiredUptime) {
        this.network = network;
        this.requiredUptime = requiredUptime;
        this.setupComponents = new SetupComponents().getSetupComponent();
        random = new Random();

        for (int i = 0; i < 2000000; i++) {
            randomInt = ThreadLocalRandom.current().nextInt(8, 40 + 1);
            optimizeConfig = new Network("Network");

            for (int x = 0; x <= randomInt; x++) {
                Component comp = setupComponents.get(random.nextInt(setupComponents.size()));
                optimizeConfig.addComponent(comp);
            }

            double configUptime = optimizeConfig.CalculateUptime();

            if (configUptime >= 99.985) {
                if (configUptime > requiredUptime) {
                    if (network.CalculatePrice() > optimizeConfig.CalculatePrice()) {
                        this.network = optimizeConfig;
                    }
                } else if (network.CalculateUptime() < requiredUptime) {
                    this.network = optimizeConfig;
                }
            }

        }

    }

    public Network getNetwork() {
        return this.network;
    }
}
