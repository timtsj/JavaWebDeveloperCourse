package kz.epam.course.classes.maintask.entity;

import kz.epam.course.classes.maintask.utils.FreshnessType;

import java.util.Objects;

/**
 * Класс обьекта цветка Ирис
 */
public class Iris extends AbstractFlower {

    /**
     * Конструктор для создания объекта Ирис
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Iris(int cost, FreshnessType fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        setCost(cost, 3, 6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iris iris = (Iris) o;
        return this.cost == iris.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.cost);
    }

    /**
     * Метод возвращает информацию об объекте класса цветок
     *
     * @return содержит подробную информацию о текущем объекте
     */
    @Override
    public String toString() {
        return String.format("%s; %s", "Iris", super.toString());
    }
}
