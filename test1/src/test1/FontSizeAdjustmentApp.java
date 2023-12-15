package test1;
//5번 문제
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;

public class FontSizeAdjuster extends JFrame {
    private JLabel label;
    private int fontSize = 12; // 초기 폰트 크기

    public FontSizeAdjuster() {
        setTitle("Font Size Adjuster");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Love Java");
        label.setFont(new Font("Arial", Font.PLAIN, fontSize));

        add(label);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();

                if (keyCode == KeyEvent.VK_PLUS || keyCode == KeyEvent.VK_EQUALS) {
                    fontSize += 5;
                } else if (keyCode == KeyEvent.VK_MINUS) {
                    fontSize = Math.max(fontSize - 5, 5);
                }

                label.setFont(new Font("Arial", Font.PLAIN, fontSize));
            }
        });

        setFocusable(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FontSizeAdjuster app = new FontSizeAdjuster();
            app.setVisible(true);
        });
    }
}