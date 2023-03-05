public class App {


    public static void main(String[] args) {

        MobilePhone mobilePhoneOne = new MobilePhone("Xiaomi");
        MobilePhone mobilePhoneTwo = new MobilePhone("Samsung");
        SatellitePhone satellitePhoneOne = new SatellitePhone("Velltone");
        SatellitePhone satellitePhoneTwo = new SatellitePhone("Icom");
        HomePhone homePhoneOne = new HomePhone("Telecom");
        HomePhone homePhoneTwo = new HomePhone("EVE");

        Phone[] phones = {mobilePhoneOne, mobilePhoneTwo, homePhoneOne, homePhoneTwo, satellitePhoneOne, satellitePhoneTwo};
        phoneJob(phones);

        ElectronicWatch electronicWatchOne = new ElectronicWatch("Casio");
        ElectronicWatch electronicWatchTwo = new ElectronicWatch("Citizen");
        SmartWatch smartWatchOne = new SmartWatch("Xiaomi");
        SmartWatch smartWatchTwo = new SmartWatch("Samsung");

        Watch[] watches = {electronicWatchOne, electronicWatchTwo, smartWatchOne, smartWatchTwo};
        watchJob(watches);

        ElectronicDevices[] myDevices = {mobilePhoneOne, mobilePhoneTwo, electronicWatchOne, electronicWatchTwo, smartWatchOne, smartWatchTwo};
        devicesJob(myDevices);

    }
    //Метод выбора произвольного номера из массива номеров
    public static String anyNumbers(){
        String[] numbers = {"+491516598423", "+492565984125", "+4912354875611", "+5948416831315", "+380666166461"};
        int randomNumber = (int) (Math.random()*numbers.length);
        return numbers[randomNumber];
    }

    public static void phoneJob(Phone[] phoneArray){
        for(Phone phoneType:phoneArray){
            phoneType.call(anyNumbers());
            phoneType.receiveCall(anyNumbers());
        }
    }

    public static void watchJob(Watch[] watchArray){
        for (Watch watchType:watchArray){
            watchType.setTime("21:15:18");
            watchType.getTime();
        }
    }

    public static void devicesJob(ElectronicDevices[] devicesArray){
        for (ElectronicDevices deviceType:devicesArray){
            deviceType.powerOn();
            deviceType.powerOff();
        }
    }

}
