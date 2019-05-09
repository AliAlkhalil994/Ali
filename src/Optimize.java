import java.util.Random;

public class Optimize {

    private Network network;
    private double requiredUptime;
    private Network optimizeConfig;

    public Optimize(Network network, double requiredUptime) {
        this.network = network;
        this.requiredUptime = requiredUptime;

        if(network.CalculateUptime() > 99.985){

            //Run the scope for all the given tries
            for(int i = 0; i < 100000; i++){
                optimizeConfig = new Network("Network");

                for(int x = 0; x <= 40; x++){
                    Component comp = setuoComponents.get(random.nextInt(setuoComponents.size()));
                    config.addComponent(comp);
                }

                //Calculate uptime beforehand so you don't make the same calculation twice
                double configUpt = optimizeConfig.CalculateUptime();

                //Check if the new configuration is better than the previous best config
                if(network == null){
                    this.network = optimizeConfig;
                }else if(configUpt > requiredUptime){
                    if(network.CalculatePrice() > optimizeConfig.CalculatePrice()){
                        this.network = optimizeConfig;
                    }
                }else if(network.CalculateUptime() < configUpt){
                    this.network = optimizeConfig;
                }

            }

        }else{



        }

    }

    public Network getNetwork() {
        return this.network;
    }
}
