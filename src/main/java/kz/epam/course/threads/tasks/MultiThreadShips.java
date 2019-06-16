package kz.epam.course.threads.tasks;

import java.util.Random;

public class MultiThreadShips {
    private static final int CONTAINERS_IN_HARBOR = 7;
    private static final int MAX_CONTAINERS_IN_HARBOR = 10;
    private static final int SHIP_WORKING_COUNT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        Harbor harbor = new Harbor(CONTAINERS_IN_HARBOR, MAX_CONTAINERS_IN_HARBOR);

        new Thread(new Ship(harbor, SHIP_WORKING_COUNT, random.nextInt(3)), "Ship_1").start();
        new Thread(new Ship(harbor, SHIP_WORKING_COUNT, random.nextInt(3)), "Ship_2").start();
        new Thread(new Ship(harbor, SHIP_WORKING_COUNT, random.nextInt(3)), "Ship_3").start();
        new Thread(new Ship(harbor, SHIP_WORKING_COUNT, random.nextInt(3)), "Ship_4").start();
        new Thread(new Ship(harbor, SHIP_WORKING_COUNT, random.nextInt(3)), "Ship_5").start();
    }
}