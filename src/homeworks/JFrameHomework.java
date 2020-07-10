package homeworks;

import javax.swing.*;

public class JFrameHomework {
    public static void main(String[] args) {
        javax.swing.JFrame myFrame = new javax.swing.JFrame();
        String myTitle = "Sori's Window";

        myFrame.setTitle(myTitle);
        myFrame.setSize(3200,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
