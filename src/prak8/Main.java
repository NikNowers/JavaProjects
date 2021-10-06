package prak8;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends Animation {
    public int imageIndex = 0;

    public Main(String path) {
        for (int i = 1; i <= 7; i++) {
            String fullPath = path + "art (" + i + ").png";
            framlist.add(new ImageIcon(fullPath).getImage());
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\nil03\\IdeaProjects\\JavaProjects\\src\\prak8\\gif\\";

        Main main = new Main(path);
        main.startAnimation(80);
    }

    public void startAnimation(int delay) {
        Timer timer = new Timer(delay, arg0 -> {
            Main.this.repaint();

            image = framlist.get(imageIndex);
            imageIndex++;
            if (imageIndex == framlist.size()) {
                imageIndex = 0;
            }
        });
        timer.start();
    }
}
