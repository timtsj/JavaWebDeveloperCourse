package kz.epam.course.classes.maintask;

import kz.epam.course.classes.maintask.entity.Bouquet;
import kz.epam.course.classes.maintask.entity.Iris;
import kz.epam.course.classes.maintask.entity.Lily;
import kz.epam.course.classes.maintask.entity.Rose;
import kz.epam.course.classes.maintask.utils.FreshnessType;
import lombok.extern.log4j.Log4j;

import java.util.Scanner;

/**
 * Цветочница.
 * Определить иерархию цветов.
 * Создать несколько объектов-цветов.
 * Собрать букет (используя аксессуары) с определением его стоимости.
 * Провести сортировку цветов в букете на основе уровня свежести.
 * Найти цветок в букете, соответствующий заданному диапазону длин стеблей.
 */
@Log4j
public class FlowersApp {

    /**
     * Метод запуска приложения
     *
     * @param args параметр не обрабатывается при запуске приложения
     */
    public static void main(String[] args) {
        log.info("Добро пожаловать в цветочницу");
        menu();
        bouquetInfo();
    }

    private static void menu() {
        log.info("Для получения информации введите цифру соответствующего пункта:\n " +
                "1. Получить список цветов в букете.\n" +
                "2. Отсортировать цветы в букете по уровню свежести.\n" +
                "3. Получить список цветов соответствующий заданому диапазону.\n" +
                "4. Получить общую сумму букета.");
    }

    private static void bouquetInfo() {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(new Rose(120, FreshnessType.FULL_FRESH, 20));
        bouquet.addFlower(new Lily(100, FreshnessType.OLD_FRESH, 25));
        bouquet.addFlower(new Iris(90, FreshnessType.MIDDLE_FRESH, 30));
        bouquet.addFlower(new Rose(150, FreshnessType.OLD_FRESH, 26));
        bouquet.addFlower(new Iris(52, FreshnessType.MIDDLE_FRESH, 40));

        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                bouquet.getFlowers();
                break;
            case 2:
                bouquet.sortFlowersByFreshness();
                break;
            case 3:
                log.info("Введите минимальную длину стебля:");
                int min = scanner.nextInt();
                log.info("Введите максимальную длину стебля:");
                int max = scanner.nextInt();
                bouquet.getFlowersByStalkLength(min, max);
                break;
            case 4:
                bouquet.getSum();
                break;
            default:
                menu();
                bouquetInfo();
        }
    }
}
