import java.awt.Frame;
import java.awt.TextArea;

class TextAreaExample {

    TextAreaExample() {
        Frame f = new Frame();
        TextArea area = new TextArea("Welcome to Abodh site");
        area.setBounds(10, 20, 300, 200); // Adjusted the size
        f.add(area);
        f.setSize(1000, 400);
        f.setLayout(null); // Corrected the method name
        f.setVisible(true);
    }

}

public class program76 {
    public static void main(String[] args) {
        new TextAreaExample();
    }
}
