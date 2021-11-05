

import java.util.Stack;

public class Caretaker {

    private Stack undoList;

    public Caretaker(){
        undoList = new Stack();
    }

    public void saveMyClass(MyClass mc){
        undoList.push(new Memento(mc));
    }

    public void undo(){
        if(undoList.size() >0){
            Memento m = (Memento) undoList.pop();
            m.restore();
        }else{
            System.out.println("nothing to undo");
        }
    }

}
