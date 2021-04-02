package HW_020421;

import HW_020421.iHand.iHand;
import HW_020421.iHead.iHead;
import HW_020421.iLeg.iLeg;

public class Robot implements iRobot {
    private iHead head;
    private iHand hand;
    private iLeg leg;

    public Robot(iHead head, iHand hand, iLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
    public Robot(){

    }

    public iHead getHead() {
        return head;
    }

    public void setHead(iHead head) {
        this.head = head;
    }

    public iHand getHand() {
        return hand;
    }

    public void setHand(iHand hand) {
        this.hand = hand;
    }

    public iLeg getLeg() {
        return leg;
    }

    public void setLeg(iLeg leg) {
        this.leg = leg;
    }

    @Override
    public void action() {
        head.speak();
        hand.upHand();
        leg.step();

    }

    @Override
    public int getPrice() {
        int price = head.getPrice() + hand.getPrice() + leg.getPrice();
        return price;
    }
}
