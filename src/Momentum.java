import TerminalIO.*;
public class Momentum {

    public static void main(String[] args) {
        double v, m, answer;
        KeyboardReader r=new KeyboardReader();
        m=r.readDouble("Enter mass (in kg's): ");
        v=r.readDouble("Enter velocity (in metres/second): ");
        answer=m*v;
        System.out.println("The momentum is "+answer+" kg m/s.");
    }
    
}
