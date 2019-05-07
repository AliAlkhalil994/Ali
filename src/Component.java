import java.sql.Timestamp;

public class Component {

    private String name;
    private String type;
    private double uptime;
    private double price;
    private boolean liveComponent;
    private String ipaddress;
    private Timestamp lastOnline;
    private double processorLoad;
    private double storage;


    public Component(String name, String type, double uptime, double price){

        this.name = name;
        this.type = type;
        this.uptime = uptime;
        this.price = price;

    }

    public Component(String name, String type, double uptime, double price, boolean liveComponent, String ipaddress, Timestamp lastOnline, double processorLoad, double storage) {
        this.name = name;
        this.type = type;
        this.uptime = uptime;
        this.price = price;
        this.liveComponent = liveComponent;
        this.ipaddress = ipaddress;
        this.lastOnline = lastOnline;
        this.processorLoad = processorLoad;
        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getUptime() {
        return uptime;
    }

    public void setUptime(double uptime) {
        this.uptime = uptime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isLiveComponent() {
        return liveComponent;
    }

    public void setLiveComponent(boolean liveComponent) {
        this.liveComponent = liveComponent;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Timestamp getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(Timestamp lastOnline) {
        this.lastOnline = lastOnline;
    }

    public double getProcessorLoad() {
        return processorLoad;
    }

    public void setProcessorLoad(double processorLoad) {
        this.processorLoad = processorLoad;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

}
