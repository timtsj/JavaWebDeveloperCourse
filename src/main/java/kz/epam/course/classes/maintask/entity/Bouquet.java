package kz.epam.course.classes.maintask.entity;

import lombok.extern.log4j.Log4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j
public class Bouquet {
    private List<AbstractFlower> flowers = new ArrayList<>();

    public void addFlower(AbstractFlower flower) {
        flowers.add(flower);
    }

    /**
     * Метод получения букета цветов.
     */
    public void getFlowers() {
        log.info("##Букет цветов несортированный");
        for (AbstractFlower f : flowers) {
            log.info(f.toString());
        }
    }

    /**
     * Метод получения отсортированного по увроню свежести букета цветов.
     */
    public void sortFlowersByFreshness() {
        Arrays.sort(flowers.toArray());
        log.info("##Букет цветов отсортированный по уровню свежести");
        for (AbstractFlower f : flowers) {
            log.info(f.toString());
        }
    }

    /**
     * Метод получения цветка в букете, соответствующий заданному диапазону длин стеблей.
     * @param minLength заданный диапазон длин стеблей.
     */
    public void getFlowersByStalkLength(int minLength, int maxLength) {
        log.info("##Цветок со стеблем соответствующий заданному диапазону длин стеблей " + minLength + " и " + maxLength);
        for (AbstractFlower f : flowers) {
            if (f.getStalkLength() >= minLength && f.getStalkLength() <= maxLength) {
                log.info(f.toString());
            }
        }
    }

    public void getSum() {
        int sum = 0;

        for (AbstractFlower flower : flowers) {
            sum += flower.getCost();
        }

        log.info("##Общая сумма букета: " + sum);
    }
}
