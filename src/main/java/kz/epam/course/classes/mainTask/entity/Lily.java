package kz.epam.course.classes.mainTask.entity;

import kz.epam.course.classes.mainTask.utils.FreshnessType;

/**
 * Класс обьекта цветка Лилия
 */
public class Lily extends AbstractFlower {

    /**
     * Конструктор для создания объекта Лилия
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Lily(int cost, FreshnessType fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        setCost(cost, 3, 6);
    }

    /**
     * Метод возвращает информацию об объекте класса цветок
     *
     * @return содержит подробную информацию о текущем объекте
     */
    @Override
    public String toString() {
        return String.format("%s; %s", "Lily", super.toString());
    }
}
