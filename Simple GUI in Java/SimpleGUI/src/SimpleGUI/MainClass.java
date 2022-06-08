package SimpleGUI;
import javax.swing.*;

// This class is our launcher for SimpleGUI
public class MainClass {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();
            }
        });
    }
}
