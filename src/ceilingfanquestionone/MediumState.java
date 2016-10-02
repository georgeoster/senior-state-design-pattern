package ceilingfanquestionone;

/*
 * @author george oster
 */

public class MediumState implements FanState {

    @Override
    public void pullChain(CeilingFan ceilingFan) {
        ceilingFan.setFanState(ceilingFan.getHighState());
        System.out.println("the string was just pulled.");
    }

    public String toString() {
        return "\ni am in the mediumState";
    }

}
