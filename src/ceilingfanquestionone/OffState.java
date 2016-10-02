package ceilingfanquestionone;

/*
 * @author george oster
 */

public class OffState implements FanState {

    @Override
    public void pullChain(CeilingFan ceilingFan) {
        ceilingFan.setFanState(ceilingFan.getLowState());
        System.out.println("the string was just pulled.");
    }

    public String toString() {
        return "\ni am in the offState";
    }

}
