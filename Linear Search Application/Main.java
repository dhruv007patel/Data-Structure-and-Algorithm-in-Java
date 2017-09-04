
import java.awt.Color;



public class Main {

    
    public static void main(String[] args) {
        GUI f = new GUI();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    
        f.getContentPane().setBackground(Color.white);
        f.setResizable(false);
    }
    
}
