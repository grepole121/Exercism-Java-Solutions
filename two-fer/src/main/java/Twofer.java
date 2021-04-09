import java.text.MessageFormat;

public class Twofer {
    public String twofer(String name) {
        if (name == null){
            return "One for you, one for me.";
        } else {
            return MessageFormat.format("One for {0}, one for me.", name);
        }
    }
}
