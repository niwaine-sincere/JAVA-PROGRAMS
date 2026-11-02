import java.util.ArrayList;
class ArrayExample {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("Hello");
        aList.add("World");
        aList.add("!");
        System.out.println(aList);
        aList.add(1,"Java");
        System.out.println(aList);
    }
}
