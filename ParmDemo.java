 class StorageCheck {
    int storageGB;
    boolean hasSpace(int appSize){
        if (storageGB-appSize>=0) return true;
        else return false;
    }
    
}

public class ParmDemo {

    public static void main(String[] args) {
        StorageCheck phone = new StorageCheck();
        phone.storageGB = 8;
        boolean result = phone.hasSpace(5);
        if (result == true) System.out.println("A 5GB app cn be installed");
    }
}
