import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Health extends JPanel implements MouseListener {

    Window myWindow;
    public Health(Window win){

        myWindow = win;
        this.setBorder(BorderFactory.createLineBorder(Color.black));

        this.setBackground(Color.magenta);
        addMouseListener(this);
        this.setSize(new Dimension(600, 200));

    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);


    }

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("CLICK!");
        System.out.println(e.getButton());

        if(e.getButton() == 1){
            Player1.hit();
        }
    }

    public void hit(){
        String ans = " ";
       // while(Player1.getHp() > 0){

      //  }
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
