import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;



public class Model {

    private HashMap<String, String> glossary;

    public Model() {
        glossary = new HashMap<>();
    }

    public void addWord(String english, String french) {
        glossary.put(english, french);

    }

    public String getRandomEnglishWord() {
        ArrayList<String> keys = new ArrayList<>(glossary.keySet());
        if (!keys.isEmpty()) {
            int randomIndex = (int) (Math.random() * keys.size());
            return keys.get(randomIndex);
        }
        return null;
    }

    public boolean validateGuess(String english, String guess) {
        String actualTranslation = glossary.get(english);
        return actualTranslation != null && actualTranslation.equals(guess);
    }

    public HashMap<String, String> getGlossary() {
        return glossary;
    }
}
