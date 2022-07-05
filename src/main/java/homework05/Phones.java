package homework05;

public interface Phones {
    void addContact(int nr, String phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendMessage(String phoneNumber, String messageContent);
    void listMessages(String phoneNumber);
    void call(String phoneNumber);
    void viewHistory();
}
