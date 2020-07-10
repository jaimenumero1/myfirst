package homeworks;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class JPaneClass {
    public static void main(String[] args) {
        String userName = JOptionPane.showInputDialog("Enter Your Credentials Please");
        String passWord = JOptionPane.showInputDialog("Password");


        if(passWord != null && userName .equals("Sdet Student") && passWord.equals("123") ){
            JOptionPane.showMessageDialog(null,"Your Inn.");
        }else{JOptionPane.showMessageDialog(null,"You Are Not The Right Guy ");}
//        Map<String, String> mapBully = new HashMap<>();
//        mapBully.put("A","george");
//        System.out.println( mapBully.containsKey("A"));
//      //  mapBully.
    }
}
