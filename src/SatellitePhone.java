public class SatellitePhone extends Phone{

    public SatellitePhone(String name) {
        super(name);
    }

    @Override
    public void powerOn() {
        System.out.println(name + " switched on with a front button");
        System.out.println("----------------------");
    }

    @Override
    public void powerOff() {
        System.out.println(name + " switched off with a front button");
        System.out.println("----------------------");
    }

    @Override
    public void call(String number) {
        System.out.println(name + " calling to " + number);
        System.out.println("----------------------");

    }

    @Override
    public void receiveCall(String number) {
        System.out.println(name + " has incoming call from " + number);
        System.out.println("----------------------");

    }

    @Override
    public String toString() {
        return "SatellitePhone" + name;
    }
}
