import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm extends JFrame{
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton button;
    private JPanel drawPanel;
    private JButton drawButton;

    JPanel getPanel1 () {
        return panel1;
    }

    MyForm() {
        setVisible(true);
        setSize(500, 500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);
        add(panel1);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(textArea1.getText());
            }
        });

        textArea1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea1.setBackground(Color.yellow);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        textArea1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() == '6')
                    textArea1.setText(textArea1.getText() + "Hello World!");
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        drawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D graphics2D = (Graphics2D) drawPanel.getGraphics();
                graphics2D.setColor(Color.red);
                graphics2D.drawRect(10, 10, 50, 50);
                graphics2D.fillRect(70, 10, 50, 50);
            }
        });
    }
}
