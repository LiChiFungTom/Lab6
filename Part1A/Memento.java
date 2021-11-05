

public class Memento {
    
    private MyClass myClass;
    private int mState;

    public Memento(MyClass mc){
        this.myClass = mc;
        this.mState = mc.state;
    }

    public void restore(){
        myClass.state = this.mState;
    }

}
