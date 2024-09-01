import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI {
    public static int x = 350;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Help the Lady Cross the Road");
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            private final Image backgroundImage = new ImageIcon(".vscode\\public\\99866465-vector-illustration-of-streets-crossing-in-modern-city-city-crossroad-with-traffic-lights-markings.jpg")
                    .getImage(); // Provide the path to your background image

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setLayout(null);
        frame.add(panel);

        ImageIcon icon = new ImageIcon(
                ".vscode\\public\\pngtree-cartoon-old-lady-with-short-stick-clipart-vector-png-image_6898152.png");

        JLabel imageLabel = new JLabel(icon);
        imageLabel.setSize(icon.getIconWidth(), icon.getIconHeight());
        imageLabel.setLocation(300, 500);
        panel.add(imageLabel);

        ImageIcon icon2 = new ImageIcon(".vscode\\public\\car.png");
        Image scaledImage = icon2.getImage().getScaledInstance(150, 200, Image.SCALE_SMOOTH);  // Adjust width and height as needed
        ImageIcon scaledIcon2 = new ImageIcon(scaledImage);

        JLabel imageLabel1 = new JLabel(scaledIcon2);
        imageLabel1.setBounds(320, 400, scaledIcon2.getIconWidth(), scaledIcon2.getIconHeight());
        panel.add(imageLabel1);
        

        // Create the label
        JLabel label = new JLabel("Help The Lady Cross the Road!");
        label.setForeground(Color.RED);
        label.setSize(300, 30);
        label.setLocation(400, 100);
        panel.add(label);

        JButton button = new JButton("Left!");
        button.setBounds(200, 900, 100, 30);
        panel.add(button);

        JButton button2 = new JButton("Right");
        button2.setBounds(600, 900, 100, 30);
        panel.add(button2);
        ButtonActions buttonActions = new ButtonActions(350, label, imageLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonActions.moveLeft();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonActions.moveRight();
            }
        });

        frame.setVisible(true);
    }


    }