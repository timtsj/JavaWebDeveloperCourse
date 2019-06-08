package kz.epam.course.classes.maintask.entity;

import kz.epam.course.classes.maintask.utils.FreshnessType;

/**
 * Класс обьекта цветка Роза
 */
public class Rose extends AbstractFlower {

    /**
     * Конструктор для создания объекта Роза
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Rose(int cost, FreshnessType fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        setCost(cost, 2, 4);
    }

    /**
     * Метод возвращает информацию об объекте класса цветок
     *
     * @return содержит подробную информацию о текущем объекте
     */
    @Override
    public String toString() {
        return String.format("%s; %s", "Rose", super.toString());
    }
}
