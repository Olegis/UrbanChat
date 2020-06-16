import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {
    private JTextArea jTextArea;
    private JTextField jTextField;


    public ChatWindow() {
        setTitle("UrbanChat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        jTextArea = new JTextArea();
        jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(200, 200));
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jTextArea.setEditable(false);
        jTextArea.setLineWrap(true);
        JButton jButtonSend = new JButton("Send");
        setVisible(true);
    }
}
