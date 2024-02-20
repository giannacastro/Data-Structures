import javax.swing.*;

public class Party {
    private int guests;

    public void setGuests(int numGuests) {
        guests = numGuests;
    }

    public int getGuests() {
        return guests;
    }

    public void displayInvitation() {
        JOptionPane.showMessageDialog(null, "You're invited to a party!");
    }

    public static void main(String[] args) {
        Party party = new Party();

        // creates a form using JOptionPane so user can input the number of guests
        String input = JOptionPane.showInputDialog("Enter the number of guests:");
        int numGuests = Integer.parseInt(input);

        party.setGuests(numGuests);
        party.displayInvitation();
    }
}
