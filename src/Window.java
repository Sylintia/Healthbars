import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(){

        this.setTitle("Layout");
        this.setPreferredSize(new Dimension(600, 200));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layer manager
        JPanel multiPanel = new JPanel();
        GridLayout layout = new GridLayout(2, 1);
        multiPanel.setLayout(layout);

        multiPanel.add(new Health(this));
        multiPanel.add(new Health(this));

        this.getContentPane().add(multiPanel);
        this.pack();
        this.setVisible(true);

    }

}
