package SimpleGUI;
import javax.swing.*;

// This class create our Graphical User Interface
public class MainWindow {
    private JFrame window;
    private JLabel testText;
    public MainWindow(){
        window = new JFrame();
        window.setTitle("Welcome to SimpleGUI");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(850,550);
        testText = new JLabel("Hello World!",SwingConstants.CENTER);
        window.setLocationRelativeTo(null);
    }
    public void show(){
        window.setVisible(true);
        window.getContentPane().add(testText);
    }

}
