import TurtleGraphics.*;
import java.awt.Color;

public class MakeLineTutorial {
    
    public static void main(String[] args) {
        SketchPadWindow win=new SketchPadWindow(400,400); //initiate size of window
        Pen p = new StandardPen(win); //Create a pen object
        p.up();
        //0,0 is the origin, so we must subtract to get true xy values
        //move pen to go to EXACT coordinates
        p.move(100-200,50-200);
        p.down();
        //drawString will print things onscreen
        p.drawString("(" +100 +", " + 50 +")");
        //and now for the second point
        p.move(100-200,300-200);
        p.drawString("(" + 300+ ", " +300 +")");
        
    }
    
}
