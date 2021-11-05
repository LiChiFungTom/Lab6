
import java.util.Scanner;

import MyPackage.*;

public class Lab06Q1B {
    
    public static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Caretaker ct = new Caretaker();

        ct.saveMyClass(mc);

        System.out.println("Create a my class object with state 1");
        while(true){
            System.out.println("Enter command: 0 = exit, 1 = undo, 2 = redo, 3 = doAction");    
            int command = sc.nextInt();

            if(command == (0)){
                System.exit(0);
            }else if(command == (1)){
                //undo
                ct.undo();
            }else if(command == (2)){
                //redo
                ct.redo();
            }else if(command == (3)){
                
                // doAction
                mc.doAction();
                ct.saveMyClass(mc);
                System.out.println("Current state: " + mc.getState());
            }
    
        }

    
    }
    


}
