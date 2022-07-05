package homework05;
public class SamsungGalaxyS10 extends Samsung {

    public SamsungGalaxyS10() {
        super(8, "blue", "aluminium", "257-9575-846");
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
    public double getAvailableBatteryLife() {
        System.out.print("Available battery life(hours) for SamsungGalaxy9: ");
        return Math.round(super.getBatteryLife() - getBatteryConsumption());
    }

}
