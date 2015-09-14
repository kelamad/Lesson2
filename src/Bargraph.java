import TurtleGraphics.*;
import java.awt.Color;
import hsa.*;
public class Bargraph {

    public static void main(String[] args) {
        Console c=new Console(); //create the console FIRST to get values first
        int y1,y2,y3,y4;
        int x1=75,x2=150,x3=225,x4=300;
        c.println("Enter value for the FIRST bar: ");
        y1=c.readInt();
        c.println("Enter value for the SECOND bar: ");
        y2=c.readInt();
        c.println("Enter value for the THIRD bar: ");
        y3=c.readInt();
        c.println("Enter value for the FOURTH bar: ");
        y4=c.readInt();
        //Now create the sketchpad
        SketchPadWindow win=new SketchPadWindow(400,400);
        Pen p = new StandardPen(win);
        p.setColor(Color.red);
        p.setWidth(10);
        p.up();
        p.move(x1-200,50-200);
        p.setColor(Color.blue);
        p.drawString(""+y1+"");
        p.down();
        p.setColor(Color.red);
        p.move(x1-200,y1-200);//the x values must stay the same in order to keep the line straight
        p.up();
        p.move(x2-200,50-200);
        p.setColor(Color.blue);
        p.drawString(""+y2+"");
        p.down();
        p.setColor(Color.red);
        p.move(x2-200,y2-200);
        p.up();
        p.move(x3-200,50-200);
        p.setColor(Color.blue);
        p.drawString(""+y3+"");
        p.down();
        p.setColor(Color.red);
        p.move(x3-200,y3-200);
        p.up();
        p.move(x4-200,50-200);
        p.setColor(Color.blue);
        p.drawString(""+y4+"");
        p.down();
        p.move(x4-200,y4-200);
        p.up();
       
       
    }
    
}
