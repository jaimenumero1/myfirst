package homeworks;
import javax.swing.JFrame;
public class JFrameWithImportingClass {
    public static void main(String[] args) {
        JFrame myWindow = new JFrame();
        String myTitle = "Jame's Cool Window Frame";
        myWindow.setTitle(myTitle);
        myWindow.setSize(250,200);
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myWindow.setVisible(true);
    }
}
