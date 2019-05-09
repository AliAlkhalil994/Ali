import java.util.*;

public class SetupComponents {

    private ArrayList<Component> setupComponent = new ArrayList<>();

    public SetupComponents(){

        //webservers
        Component webserver1 = new Component("HAL9001DB","wbs",90,5100);
        Component webserver2 = new Component("HAL9002DB", "wbs", 95, 7700);
        Component webserver3 = new Component("HAL9003DB", "wbs", 98, 12200);

        //databases
        Component databaseServer1 = new Component("HAL9001W", "dbs", 80, 2200);
        Component databaseServer2 = new Component("HAL9002W", "dbs", 90, 3200);
        Component databaseServer3 = new Component("HAL9003W", "dbs", 95, 5100);

        //firewall / loadbalancer
        /*Component firewall = new Component("firewall", "pfSense", 99.999, 2000);
        Component loadbalancer = new Component("DBloadbalancer", "pfSense", 99.999, 2000);*/

        setupComponent.add(webserver1);
        setupComponent.add(webserver2);
        setupComponent.add(webserver3);
        setupComponent.add(databaseServer1);
        setupComponent.add(databaseServer2);
        setupComponent.add(databaseServer3);
        /*setupComponent.add(firewall);
        setupComponent.add(loadbalancer);*/
    }

    public ArrayList<Component> getSetupComponent() {
        return setupComponent;
    }
}
