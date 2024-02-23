import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArraysGUI extends JFrame {
    private JTextField textField;
    private JButton button;
    private JTextArea textArea;

    public ArraysGUI() {
        setTitle("Array Input");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField();
        button = new JButton("Add to Array");
        textArea = new JTextArea();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                double value = Double.parseDouble(input);
                textArea.append(value + "\n");
                textField.setText("");
            }
        });

        add(textField, BorderLayout.NORTH);
        add(button, BorderLayout.CENTER);
        add(new JScrollPane(textArea), BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ArraysGUI();
            }
        });
    }
}
