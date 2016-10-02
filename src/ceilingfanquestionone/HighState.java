package ceilingfanquestionone;

/*
 * @author george oster
 */

public class HighState implements FanState {

    @Override
    public void pullChain(CeilingFan ceilingFan) {
        ceilingFan.setFanState(ceilingFan.getOffState());
        System.out.println("the string was just pulled.");
    }

    public String toString() {
        return "\ni am in the highState";
    }

}
