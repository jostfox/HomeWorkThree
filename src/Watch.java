public abstract class Watch extends ElectronicDevices{

    protected String model;

    public abstract void setTime(String time);

    public abstract void getTime();

    public Watch(String model){
        this.model = model;
    }

    @Override
    public void powerOn() {

    }

    @Override
    public void powerOff() {

    }
}
