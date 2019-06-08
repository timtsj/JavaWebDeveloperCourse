package kz.epam.course.classes.maintask;

import kz.epam.course.classes.maintask.entity.*;
import kz.epam.course.classes.maintask.utils.FreshnessType;

/**
 * Цветочница.
 * Определить иерархию цветов.
 * Создать несколько объектов-цветов.
 * Собрать букет (используя аксессуары) с определением его стоимости.
 * Провести сортировку цветов в букете на основе уровня свежести.
 * Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */
public class FlowersApp {

    /**
     * Метод запуска приложения
     *
     * @param args параметр не обрабатывается при запуске приложения
     */
    public static void main(String[] args) {

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(120, FreshnessType.FULL_FRESH, 20));
        bouquet.addFlower(new Lily(100, FreshnessType.OLD_FRESH, 25));
        bouquet.addFlower(new Iris(90, FreshnessType.MIDDLE_FRESH, 30));
        bouquet.addFlower(new Rose(150, FreshnessType.OLD_FRESH, 26));
        bouquet.addFlower(new Iris(52, FreshnessType.MIDDLE_FRESH, 40));

        bouquet.getFlowers();
        bouquet.sortFlowersByFreshness();
        bouquet.getFlowersByStalkLength(40);
        bouquet.getSum();
    }
}
