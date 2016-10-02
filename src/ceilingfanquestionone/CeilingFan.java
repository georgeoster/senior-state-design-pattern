package ceilingfanquestionone;

/*
 * @author george oster
 */

public class CeilingFan {

    FanState offState;
    FanState lowState;
    FanState mediumState;
    FanState highState;

    FanState currentFanState;

    public CeilingFan() {
        offState = new OffState();
        lowState = new LowState();
        mediumState = new MediumState();
        highState = new HighState();

        currentFanState = offState;
    }

    public void setFanState(FanState state) {
        this.currentFanState = state;
    }

    public FanState getFanState() {
        return this.currentFanState;
    }

    public FanState getOffState() {
        return this.offState;
    }

    public FanState getLowState() {
        return this.lowState;
    }

    public FanState getMediumState() {
        return this.mediumState;
    }

    public FanState getHighState() {
        return this.highState;
    }

}
