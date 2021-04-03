package HW_020421;

import HW_020421.iHand.SamsungHand;
import HW_020421.iHand.SonyHand;
import HW_020421.iHand.ToshibaHand;
import HW_020421.iHead.SamsungHead;
import HW_020421.iHead.SonyHead;
import HW_020421.iHead.ToshibaHead;
import HW_020421.iLeg.SamsungLeg;
import HW_020421.iLeg.SonyLeg;
import HW_020421.iLeg.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(15),new SonyHand(25), new ToshibaLeg(25));
        Robot robot2 = new Robot(new SonyHead(20), new ToshibaHand(20), new SamsungLeg(20));
        Robot robot3 = new Robot(new ToshibaHead(25), new SamsungHand(30), new SonyLeg(15));

        robot1.action();
        System.out.println(robot1.getPrice());

        robot2.action();
        System.out.println(robot2.getPrice());

        robot3.action();
        System.out.println(robot3.getPrice());

    }
}
