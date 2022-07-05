package homework05;

public class Main {
    public static void main(String[] args) {
        Phone mob1 = new SamsungGalaxy9();
        mob1.addContact(1, "0742409405", "Adela", "Iclodean");
        mob1.addContact(2, "0741596085", "Natalia", "Iclodean");
        mob1.sendMessage("0742409405", "First message");
        mob1.call("0741596085");
        System.out.println(mob1.getAvailableBatteryLife());
        mob1.listContacts();
        mob1.listMessages("0742409405");
        mob1.viewHistory();
        System.out.println(mob1.getAvailableBatteryLife());

        Phone mob2 = new SamsungGalaxyS10();
        mob2.addContact(1, "0742409405", "Adela", "Iclodean");
        mob2.addContact(2, "0741596085", "Natalia", "Iclodean");
        mob2.sendMessage("0742409405", "First message");
        mob2.call("0741596085");
        mob2.listContacts();
        mob2.listMessages("0742409405");
        mob2.viewHistory();
        System.out.println(mob2.getAvailableBatteryLife());

        Phone mob3 = new Iphone13();
        mob3.addContact(1, "0742409405", "Adela", "Iclodean");
        mob3.addContact(2, "0741596085", "Natalia", "Iclodean");
        mob3.sendMessage("0742409405", "First message");
        mob3.call("0741596085");
        mob3.listContacts();
        mob3.listMessages("0742409405");
        mob3.viewHistory();
        System.out.println(mob3.getAvailableBatteryLife());

        Phone mob4 = new Iphone12();
        mob4.addContact(1, "0742409405", "Adela", "Iclodean");
        mob4.addContact(2, "0741596085", "Natalia", "Iclodean");
        mob4.sendMessage("0742409405", "First message");
        mob4.call("0741596085");
        mob4.listContacts();
        mob4.listMessages("0742409405");
        mob4.viewHistory();
        System.out.println(mob4.getAvailableBatteryLife());

    }
}
