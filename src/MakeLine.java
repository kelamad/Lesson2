import TurtleGraphics.*;
import java.awt.Color;
import hsa.*;
public class MakeLine {
    
    public static void main(String[] args) {
        Console c=new Console();
        //0,0 is the origin, so we must subtract to get true xy values
        //move pen to go to EXACT coordinates
        int x1,y1,x2,y2;
        c.println("Enter the X value for the FIRST point: ");
        x1=c.readInt();
        c.println("Enter the Y value for the FIRST point: ");
        y1=c.readInt();
        c.println("Enter the X value for the SECOND point: ");
        x2=c.readInt();
        c.println("Enter the Y value for the SECOND point: ");
        y2=c.readInt();
        c.close();
        SketchPadWindow win=new SketchPadWindow(400,400); //initiate size of window
        Pen p = new StandardPen(win); //Create a pen object
        p.up();
        p.move(x1-200,y1-200);
        p.down();
        //drawString will print things onscreen
        p.drawString("(" +x1 +", " + y1 +")");
        //and now for the second point
        p.move(x2-200,y2-200);
        p.drawString("(" + x2+ ", " +y2 +")");
        
    }
    
}
