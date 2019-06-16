package kz.epam.course.threads.tasks;

import java.util.concurrent.atomic.AtomicInteger;

public class Harbor {
    private AtomicInteger containers = new AtomicInteger();
    private int maximumContainers;

    public Harbor(int containersInHarbor, int maximumContainers) {
        this.containers.set(containersInHarbor);
        this.maximumContainers = maximumContainers;
    }

    public boolean addContainer() {
        if (containers.get() < maximumContainers) {
            containers.incrementAndGet();
            return true;
        } else
            return false;
    }

    public boolean getContainer() {
        if (containers.get() > 0) {
            containers.decrementAndGet();
            return true;
        } else
            return false;
    }

    public int containersInHarbor() {
        return containers.get();
    }
}
