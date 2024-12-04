import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (Object value : myList) {
            try {
                Integer castedValue = (Integer) value;
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                System.out.println("error!");
            }

        }
    }
}