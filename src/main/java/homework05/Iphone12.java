package homework05;
public class Iphone12 extends Apple {
    public Iphone12() {
        super(8, "white", "plastic", "2757-25725-9");
    }

    @Override
    public void addContact(int nr, String phoneNumber, String firstName, String lastName) {
        super.addContact(nr, phoneNumber, firstName, lastName);
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        super.sendMessage(phoneNumber, messageContent);
    }

    @Override
    public void listMessages(String phoneNumber) {
        super.listMessages(phoneNumber);
    }

    @Override
    public void call(String phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public void viewHistory() {
        super.viewHistory();
    }

    @Override
    public double getAvailableBatteryLife() {
        System.out.println("Available battery life(hours) for Iphone12: ");
        return Math.round(super.getBatteryLife() - getBatteryConsumption());
    }
}