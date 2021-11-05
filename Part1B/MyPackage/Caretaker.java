package MyPackage;

import java.util.Stack;

public class Caretaker {

    private Stack undoList;
    private Stack redoList;
    private boolean firstUndo;
    private boolean firstRedo;

    public Caretaker(){
        undoList = new Stack();
        redoList = new Stack();
        firstUndo = true;
        firstRedo = true;
    }

    public void saveMyClass(MyClass mc){
        undoList.push(new Memento(mc));
    }

    public void undo(){
        if(undoList.size() >0){
            if(firstUndo){
                Memento m = (Memento) undoList.pop();
                redoList.push(m);
                firstUndo = false;
            }
            firstRedo = true;
            Memento m = (Memento) undoList.pop();
            redoList.push(m);
            m.restore();
            System.out.println("Perform undo.");
            System.out.println("Current state :" + m.getMyClass().getState() );
        }else{
            System.out.println("nothing to undo");
        }
    }

    public void redo(){
        if(redoList.size() >0 ){
            if(firstRedo){
                Memento m = (Memento) redoList.pop();
                undoList.push(m);
                firstUndo = false;
            }

            firstUndo = true;
            Memento m = (Memento) redoList.pop();
            undoList.push(m);
            m.restore();
            System.out.println("Perform redo");
            System.out.println("Current state :" + m.getMyClass().getState() );
        }else{
            System.out.println("nothing to redo");
        }

    }

}
