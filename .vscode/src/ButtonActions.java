import javax.swing.*;

public class ButtonActions {
    private int x;
    private JLabel label;
    private JLabel imageLabel;

    public ButtonActions(int x, JLabel label, JLabel imageLabel) {
        this.x = x;
        this.label = label;
        this.imageLabel = imageLabel;
    }

    public void moveLeft() {
        x -= 100;
        label.setText("Good Job!");
        label.setLocation(450, 100);
        System.out.println("Walked to the Left");
        imageLabel.setLocation(x, 500);
    }

    public void moveRight() {
        x += 100;
        label.setText("Good Job!");
        label.setLocation(450, 100);
        System.out.println("Walked to the Right");
        imageLabel.setLocation(x, 500);
    }

    public int getX() {
        return x;
    }
}