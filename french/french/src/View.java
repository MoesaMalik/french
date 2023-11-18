import javax.swing.*;
import java.awt.*;

public class View extends JFrame {



    JLabel englishLabel;
    JLabel frenchLabel;

    JTextField englishTextField;
    JTextField frenchTextField;

    JTextField status;

    JButton addButton;
    JButton practiceButton;

    public View() {
        super("DuoLearno!");


        setLayout(new GridLayout(4, 2));

        englishLabel = new JLabel("English");
        frenchLabel = new JLabel("French");

        englishTextField = new JTextField(15);
        frenchTextField = new JTextField(15);

        status = new JTextField(20);

        addButton = new JButton("Add");
        practiceButton = new JButton("Practice");


        add(englishLabel);
        add(frenchLabel);

        add(englishTextField);
        add(frenchTextField);
        add(addButton);
        add(practiceButton);
        add(status);

        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public JLabel getEnglishLabel() {
        return englishLabel;
    }

    public JLabel getFrenchLabel() {
        return frenchLabel;
    }

    public JTextField getEnglishTextField() {
        return englishTextField;
    }

    public JTextField getFrenchTextField() {
        return frenchTextField;
    }

    public JTextField getStatusTextField() {
        return status;
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getPracticeButton() {
        return practiceButton;
    }


}
