package ceilingfanquestionone;

/*
 * @author george oster
 */

public class CeilingFanQuestionOne {

    public static void main(String[] args) {

        CeilingFan tester = new CeilingFan();

        for (int i = 0; i < 8; i++) {

            System.out.println(tester.currentFanState.toString());

            tester.getFanState().pullChain(tester);

        }

    }

}
