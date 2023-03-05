import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ElectronicWatch extends Watch{

    public ElectronicWatch(String model){
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println(model + " switched on with a right side button");
        System.out.println("----------------------");
    }

    @Override
    public void powerOff() {
        System.out.println(model + " switched off with a right side button");
        System.out.println("----------------------");
    }

    @Override
    public void setTime(String time) {
        System.out.println(time + " estableshed on the " + model);
        System.out.println("----------------------");

    }

    @Override
    public void getTime() {
        System.out.println(model + " shows " + new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()) );
        System.out.println("----------------------");
    }

    @Override
    public String toString() {
        return "Electronic watch" + model;
    }
}
