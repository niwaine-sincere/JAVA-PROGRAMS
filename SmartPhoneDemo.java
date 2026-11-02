class SmartPhone {
    int storageGB;
    int batteryMah;
    int drainMah;
}

  public class SmartPhoneDemo {

    public static void main(String[] args) {

        SmartPhone iphone = new SmartPhone();

        iphone.storageGB = 128;
        iphone.batteryMah = 3200;
        iphone.drainMah = 200;

        int life;

        life = iphone.batteryMah / iphone.drainMah;

        System.out.println(
            "life of the phone is "+ life +"hours"
    
        );
    }
}
