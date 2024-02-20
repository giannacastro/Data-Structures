import javax.swing.*;
import java.awt.*;

public class UseDinnerParty {
    public static void main(String[] args) {
        Party aParty = new Party();
        aParty.setGuests(5);
        aParty.displayInvitation();

        // represents a DinnerParty object
        DinnerParty aDinnerParty = new DinnerParty();

        // prompt for the number of guests for the DinnerParty
        String guestsInput = JOptionPane.showInputDialog("Enter the number of guests for the dinner party:");
        int numGuests = Integer.parseInt(guestsInput);
        aDinnerParty.setGuests(numGuests);

        // prompt for the dinner choice
        String dinnerChoice = JOptionPane.showInputDialog("Choose the dinner type (1 for Mexican, 2 for Indian):");
        int choices = Integer.parseInt(dinnerChoice);
        if (choices == 1) {
            aDinnerParty.setDinnerChoice("Mexican");
        } else if (choices == 2) {
            aDinnerParty.setDinnerChoice("Indian");
        }

        // displays all the data for the DinnerParty
        JOptionPane.showMessageDialog(null, "The dinner party has " + aDinnerParty.getGuests() +
                " guests and will serve " + aDinnerParty.getDinnerChoice() + " food.");

        // calls the displayInvitation() method with the DinnerParty object
        aDinnerParty.displayInvitation();
    }
}
