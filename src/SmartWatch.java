import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SmartWatch extends Watch{

    public SmartWatch(String model){
        super(model);
    }

    @Override
    public void powerOn() {
        System.out.println(model + " switched on with a left side button");
        System.out.println("----------------------");
    }

    @Override
    public void powerOff() {
        System.out.println(model + " switched off with a left side button");
        System.out.println("----------------------");
    }

    @Override
    public void setTime(String time) {
        System.out.println(time + " estableshed on the " + model);
        System.out.println("----------------------");

    }

    @Override
    public void getTime() {
        System.out.println(model + " shows " +  new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime()) );
        System.out.println("----------------------");

    }

    @Override
    public String toString() {
        return "Smartwatch" + model;
    }
}
