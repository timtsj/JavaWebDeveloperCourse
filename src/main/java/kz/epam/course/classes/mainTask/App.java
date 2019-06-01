package kz.epam.course.classes.mainTask;

import kz.epam.course.classes.mainTask.entity.*;

import java.util.Arrays;

/**
 * Цветочница.
 * Определить иерархию цветов.
 * Создать несколько объектов-цветов.
 * Собрать букет (используя аксессуары) с определением его стоимости.
 * Провести сортировку цветов в букете на основе уровня свежести.
 * Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */
public class App {
    /**
     * Метод запуска приложения
     *
     * @param args параметр не обрабатывается при запуске приложения
     */
    public static void main(String[] args) {
        AFlower[] AFlowers =
                {
                        new Rose(120, EFreshness.FULL_FRESH, 20),
                        new Lily(100, EFreshness.OLD_FRESH, 25),
                        new Iris(90, EFreshness.MIDDLE_FRESH, 30),
                        new Rose(150, EFreshness.OLD_FRESH, 26),
                        new Iris(52, EFreshness.MIDDLE_FRESH, 40)
                };

        getFlowers(AFlowers);
        sortFlowersByFreshness(AFlowers);
        getFlowersByStalkLength(AFlowers, 40);
    }

    /**
     * Метод получения букета цветов.
     * @param AFlowers массив букета цветов.
     */
    private static void getFlowers(AFlower[] AFlowers) {
        System.out.println("Букет цветов несортированный");
        for (AFlower f : AFlowers) {
            System.out.println(f.toString());
        }
    }

    /**
     * Метод получения отсортированного по увроню свежести букета цветов.
     * @param AFlowers массив букета цветов.
     */
    private static void sortFlowersByFreshness(AFlower[] AFlowers) {
        Arrays.sort(AFlowers);
        System.out.println("Букет цветов отсортированный по уровню свежести");
        for (AFlower f : AFlowers) {
            System.out.println(f.toString());
        }
    }

    /**
     * Метод получения цветка в букете, соответствующий заданному диапазону длин стеблей.
     *
     * @param AFlowers массив букета цветов.
     * @param stalkLength заданный диапазон длин стеблей.
     */
    private static void getFlowersByStalkLength(AFlower[] AFlowers, int stalkLength) {
        System.out.println("Цветы со стеблем больше или равным " + stalkLength);
        for (AFlower f : AFlowers) {
            if (f.getStalkLength() >= stalkLength) {
                System.out.println(f.toString());
            }
        }
    }
}
