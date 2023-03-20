import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Window extends JFrame implements MouseListener {

    Health healthbar;
    private Player1 Player1;
    public Window(){

        this.setTitle("Layout");
        this.setPreferredSize(new Dimension(600, 200));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Layer manager
        JPanel healthbar = new JPanel();
        GridLayout layout = new GridLayout(2, 1);
        healthbar.setLayout(layout);

        healthbar.add(new Health(this));
        healthbar.add(new Health(this));

        this.getContentPane().add(healthbar);
        this.pack();
        this.setVisible(true);

        this.Player1 = Player1;

    }

    private void drawWindow(){
        JFrame frame = new JFrame("Healthbar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        healthbar = new Health(Player1);
        healthbar.setPreferredSize(new Dimension(600, 100));
        frame.getContentPane().add(healthbar);
        frame.pack();
        frame.setVisible(true);
    }

    public void gethit(){

    }

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("CLICK!");
        System.out.println(e.getButton());

        if(e.getButton() == 1){
            while(Player1.getHp() > 0){
                Player1.hit(Player1.random_int);
                healthbar.repaint();
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e){

    }

    @Override
    public void mouseReleased(MouseEvent e){

    }

    @Override
    public void mouseEntered(MouseEvent e){

    }

    @Override
    public void mouseExited(MouseEvent e){

    }

}
