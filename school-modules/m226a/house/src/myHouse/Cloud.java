package myHouse;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lazar on 24.08.2021.
 * Project name: house
 **/
public class Cloud extends Thread {
    public static ArrayList<Circle> cloudList = new ArrayList<Circle>();


    public void run() {
        Random random = new Random();
        for (int amount = 0; amount < 30; amount++) {
            Circle cloudPart = new Circle();
            cloudPart.changeColor("lightGray");
            cloudPart.changeSize(30);
            int DEFAULT_X = 100;
            cloudPart.setxPosition(DEFAULT_X + amount * 3);
            int DEFAULT_Y = 50;
            cloudPart.setyPosition(DEFAULT_Y + random.nextInt(20));
            cloudPart.makeVisible();
            cloudList.add(cloudPart);
            //cloudPart.slowMoveHorizontal(5);
        }

        while (currentThread().isAlive()) {
            for (Circle cloudPart : cloudList) {
                cloudPart.slowMoveHorizontal(10);
            }
        }
    }
}
