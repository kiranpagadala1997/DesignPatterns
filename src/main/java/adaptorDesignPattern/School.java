package adaptorDesignPattern;

import adaptorDesignPattern.main.AssignmentWork;
import adaptorDesignPattern.main.Pen;
import adaptorDesignPattern.main.PenAdaptor;

public class School {
    public static void main(String[] args) {
//    PilotPen pp = new PilotPen();
        Pen p = new PenAdaptor();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(p);
        aw.writeAssignment("I'm an assignment");
    }
}
