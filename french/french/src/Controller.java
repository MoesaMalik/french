import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.getAddButton().addActionListener(this);
        view.getPracticeButton().addActionListener(this);

        view.getFrenchTextField().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getAddButton()) {
            handleAddButton();
        } else if (e.getSource() == view.getPracticeButton()) {
            handlePracticeButton();
        } else if (e.getSource() == view.getFrenchTextField()) {
            handleFrenchTextFieldEnter();
        }
    }

    private void handleAddButton() {
        String englishWord = view.getEnglishTextField().getText();
        String frenchWord = view.getFrenchTextField().getText();

        model.addWord(englishWord, frenchWord);

        view.getEnglishTextField().setText("");
        view.getFrenchTextField().setText("");
        view.getStatusTextField().setText("Word added: " + englishWord);
    }

    private void handlePracticeButton() {
        String randomEnglishWord = model.getRandomEnglishWord();

        if (randomEnglishWord != null) {
            view.getEnglishTextField().setText(randomEnglishWord);
            view.getFrenchTextField().setText("");
            view.getStatusTextField().setText("Take a guess!");
        } else {
            view.getStatusTextField().setText("Glossary is empty.");
        }
    }

    private void handleFrenchTextFieldEnter() {
        String englishGuess = view.getEnglishTextField().getText();
        String frenchGuess = view.getFrenchTextField().getText();

        if (model.validateGuess(englishGuess, frenchGuess)) {
            view.getStatusTextField().setText("Well done!");
        } else {
            view.getStatusTextField().setText("Wrong! Guess again.");
        }
    }

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

    }
}
