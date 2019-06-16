package kz.epam.course.threads.tasks;

import lombok.extern.log4j.Log4j;

import java.util.Random;

@Log4j
public class Ship implements Runnable {
    private Harbor harbor;
    private int workCount;
    private int loadedContainers;
    private static final int MAX_CONTAINERS = 3;

    public Ship(Harbor harbor, int workCount, int containers) {
        this.harbor = harbor;
        this.workCount = workCount;
        this.loadedContainers = containers;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < workCount; i++) {
            boolean work = false;
            int x = random.nextInt(3);
            String s = Thread.currentThread().getName() + ", " + ((x == 0) ? "add" : (x == 1) ? "get" : "add/get");
            s += ", harbor: " + harbor.containersInHarbor();
            s += ", ship: " + loadedContainers;
            switch (x) {
                case 0:
                    if (loadedContainers > 0)
                        if (harbor.addContainer()) {
                            loadedContainers--;
                            work = true;
                        }
                    break;
                case 1:
                    if (loadedContainers < MAX_CONTAINERS)
                        if (harbor.getContainer()) {
                            loadedContainers++;
                            work = true;
                        }
                    break;
                case 2:
                    if (loadedContainers > 0)
                        if (harbor.addContainer()) {
                            loadedContainers--;
                            work = true;
                        }

                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (loadedContainers < MAX_CONTAINERS)
                        if (harbor.getContainer()) {
                            loadedContainers++;
                            work = true;
                        }
                    break;
            }
            s += ", harbor: " + harbor.containersInHarbor();
            s += ", ship: " + loadedContainers;
            if (work) {
                log.info(s);
            }


            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
