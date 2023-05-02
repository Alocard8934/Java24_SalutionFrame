package JAVA24;

import javax.swing.*;

public class SalutionFrame extends JFrame {
    public SalutionFrame(){
        super("Saluton mondo!");
        setLookAndFeel();
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch(Exception exc) {
            // Error ignore
        }
    }
    
    public static void main(String[] args) {
        SalutionFrame frame = new SalutionFrame();
    }
}
