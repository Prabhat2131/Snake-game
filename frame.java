import javax.swing.*;

public class frame extends  JFrame{
    frame(){
        // adding the panel to the frame
        this.add (new panel());
        this.setTitle("SnakeGame");
        // to make sure uniform game window size
        this.setResizable(false);

        this.setVisible(true);
        this.pack();
    }
 
}
