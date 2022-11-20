import java.lang.constant.Constable;
import java.util.Arrays;

public class Phone {
    String number;
    String model;
    double weight;


    void receiveCall(String name) {
        System.out.println("Calling " + name);
        System.out.println();
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + " with number " + number);
        System.out.println();
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... numbers) {
        System.out.println("Numbers to which the message will be sent " + Arrays.toString(numbers));
    }

}
