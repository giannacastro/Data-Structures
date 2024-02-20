import javax.swing.*;
import java.awt.Font;

public class DinnerParty extends Party {
    private String dinnerChoice;

    public void setDinnerChoice(String choice) {
        dinnerChoice = choice;
    }

    public String getDinnerChoice() {
        return dinnerChoice;
    }

    public static void main(String[] args) {
        DinnerParty dinnerParty = new DinnerParty();

        // uses JOptionPane to get the number of guests
        String guestsInput = JOptionPane.showInputDialog("Enter the number of guests for the dinner party:");
        int numGuests = Integer.parseInt(guestsInput);
        dinnerParty.setGuests(numGuests);

        // uses JOptionPane to get the dinner choice
        String dinnerInput = JOptionPane.showInputDialog("What will be served for dinner?");
        dinnerParty.setDinnerChoice(dinnerInput);

        // creates a fancy font for the dinner choice // creativity
        Font fancyFont = new Font("Script", Font.BOLD, 16);

        // displays the invitation with the dinner choice in a different font
        JLabel invitationLabel = new JLabel("You're invited to a dinner party! We're serving ");
        JLabel dinnerChoiceLabel = new JLabel(dinnerParty.getDinnerChoice());
        dinnerChoiceLabel.setFont(fancyFont);

        JPanel invitationPanel = new JPanel();
        invitationPanel.add(invitationLabel);
        invitationPanel.add(dinnerChoiceLabel);

        JOptionPane.showMessageDialog(null, invitationPanel);
    }
}
