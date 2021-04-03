package HW_020421;

import HW_020421.iHand.IHand;
import HW_020421.iHead.IHead;
import HW_020421.iLeg.iLeg;

public class Robot implements IRobot {
    private IHead head;
    private IHand hand;
    private iLeg leg;

    public Robot(IHead head, IHand hand, iLeg leg) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
    }
    public Robot(){

    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
        this.head = head;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
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
