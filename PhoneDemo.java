public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        phone1.number = "124578945";
        phone1.model = "Samsung";
        phone1.weight = 121.5;

        phone2.number = "8952147853";
        phone2.model = "Nokia";
        phone2.weight = 204.7;

        phone3.number = "559741023569";
        phone3.model = "iPhone";
        phone3.weight = 250.8;

        System.out.println(phone1.getNumber());
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();

        System.out.println(phone2.getNumber());
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();

        System.out.println(phone3.getNumber());
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        System.out.println();

        phone1.receiveCall("Alessandra");
        phone2.receiveCall("Oleg");
        phone3.receiveCall("Frank");

        phone1.receiveCall("Anna", "126987820");
        phone1.receiveCall("Denis", "5547889520");
        phone1.receiveCall("Kol", "66666899");

        phone1.sendMessage("11111111", "222222222", "33333333");
        phone2.sendMessage("444444444", "555555555", "66666666");
        phone3.sendMessage("777777777", "8888888888");
    }
}
