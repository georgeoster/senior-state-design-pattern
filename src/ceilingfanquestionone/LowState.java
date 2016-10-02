package ceilingfanquestionone;

/*
 * @author george oster
 */

public class LowState implements FanState {

    @Override
    public void pullChain(CeilingFan ceilingFan) {
        ceilingFan.setFanState(ceilingFan.getMediumState());
        System.out.println("the string was just pulled.");
    }

    public String toString() {
        return "\ni am in the lowState";
    }

}
