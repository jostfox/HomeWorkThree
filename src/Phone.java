public abstract class Phone extends ElectronicDevices{

    protected String name;
    public abstract void call(String number);
    public abstract void receiveCall(String number);

    public Phone(String name) {
        this.name = name;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }
}
