import hsa.*;
public class PizzaCost {

    public static void main(String[] args) {
        Console c=new Console();
        double base=2.25, tops=0.75, diameter;
        double numtop;
        boolean a=true;
        while(true){
        c.print("Enter size of pizza (diameter) (in inches): ");
        diameter=c.readDouble();
        diameter=diameter*0.5;
        c.println("Enter amount of desired toppings: ");
        numtop=c.readInt();
        numtop=numtop*tops;
        double total=numtop+base+diameter;
        c.println("Base Pizza cost + Utilities: $"+base);
        c.println("Cost of Base Ingredients: $" +diameter);
        c.println("Cost of toppings: $" + numtop);
        c.println("Total cost: $" +total);
        c.println("");
        c.println("Next order: ");
        c.println("");
        if(a=false) break; //this loop will go on forever
        }
        
    }
    
}
