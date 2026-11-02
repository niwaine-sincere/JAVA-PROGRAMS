
    class NewPhone {

    int storageGB;
    int batteryMah;
    int drainMah;
    }
 
    public class NewPhoneDemo{
        public static void main(String[] args) {
            NewPhone iPhone = new NewPhone();
    iPhone.storageGB=128;
    iPhone.batteryMah=4000;
    iPhone.drainMah=200;

            batteryLife(iPhone);
        }
        static void batteryLife(NewPhone phone) {
        System.out.println(
            "Battery life is " + (phone.batteryMah / phone.drainMah) +" hours"
        );

        }
    }
