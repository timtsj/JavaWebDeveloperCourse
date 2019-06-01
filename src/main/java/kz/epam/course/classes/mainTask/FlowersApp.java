package kz.epam.course.classes.mainTask;

import kz.epam.course.classes.mainTask.entity.*;
import org.apache.log4j.Logger;

import java.util.Arrays;

/**
 * Цветочница.
 * Определить иерархию цветов.
 * Создать несколько объектов-цветов.
 * Собрать букет (используя аксессуары) с определением его стоимости.
 * Провести сортировку цветов в букете на основе уровня свежести.
 * Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */
public class FlowersApp {
    static final Logger logger = Logger.getLogger(FlowersApp.class);

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
        logger.info("##Букет цветов несортированный");
        for (AFlower f : AFlowers) {
            logger.info(f.toString());
        }
    }

    /**
     * Метод получения отсортированного по увроню свежести букета цветов.
     * @param AFlowers массив букета цветов.
     */
    private static void sortFlowersByFreshness(AFlower[] AFlowers) {
        Arrays.sort(AFlowers);
        logger.info("##Букет цветов отсортированный по уровню свежести");
        for (AFlower f : AFlowers) {
            logger.info(f.toString());
        }
    }

    /**
     * Метод получения цветка в букете, соответствующий заданному диапазону длин стеблей.
     *
     * @param AFlowers массив букета цветов.
     * @param stalkLength заданный диапазон длин стеблей.
     */
    private static void getFlowersByStalkLength(AFlower[] AFlowers, int stalkLength) {
        logger.info("##Цветы со стеблем больше или равным " + stalkLength);
        for (AFlower f : AFlowers) {
            if (f.getStalkLength() >= stalkLength) {
                logger.info(f.toString());
            }
        }
    }
}
