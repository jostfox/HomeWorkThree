public class HomePhone extends Phone{

    public HomePhone(String name){
        super(name);

    }

    @Override
    public void powerOn() {
        System.out.println(name + " switched on with plug");
        System.out.println("----------------------");
    }

    @Override
    public void powerOff() {
        System.out.println(name + " switched off from the plug");
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
        return "HomePhone" + name;
    }
}
