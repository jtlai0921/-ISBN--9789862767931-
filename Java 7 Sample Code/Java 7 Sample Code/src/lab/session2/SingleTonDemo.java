package lab.session2;

public class SingleTonDemo {
    public static void main(String[] args) {
        Service service = Service.getServiceInstance();
        // ...
    }
}

class Service {
    private static final Service _instance = new Service();
    private Service() { }
    public static Service getServiceInstance() {
        return _instance;
    }
}
