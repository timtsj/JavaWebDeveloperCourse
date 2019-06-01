package kz.epam.course.classes.mainTask.entity;

import java.util.Objects;

/**
 * Абстрактый класс для наследования объектов Цветок
 */
public abstract class AFlower implements Comparable<AFlower> {

    /**
     * Стоимость цветка
     */
    private int cost;

    /**
     * Свежесть цветка
     */
    private EFreshness fresh;

    /**
     * Количество стеблей цветка
     */
    private int stalkLength;

    /**
     * Конструктор для создания объекта цветок
     *
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public AFlower(int cost, EFreshness fresh, int stalkLength) {
        this.cost = cost;
        this.fresh = fresh;
        this.stalkLength = stalkLength;
    }

    /**
     * Метод возвращает значение цены цветка
     *
     * @return возвращает значение цены цветка
     */
    public int getCost() {
        return cost;
    }

    /**
     * Метод позволяет занести значение цены цветка
     *
     * @param cost содержит значение цены цветка
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Метод возвращает значение свежести цветка
     *
     * @return возвращает значение свежести цветка
     */
    public EFreshness getFresh() {
        return fresh;
    }

    /**
     * Метод позволяет занести значение свежести цветка
     * @param fresh содержит значение свежести цветка
     */
    public void setFresh(EFreshness fresh) {
        this.fresh = fresh;
    }

    /**
     * Метод возвращает значение количества стеблей цветка
     *
     * @return возвращает значение количества стеблей цветка
     */
    public int getStalkLength() {
        return stalkLength;
    }

    /**
     * Метод позволяет занести значение количества стеблей цветка
     * @param stalkLength содержит значение количества стеблей цветка
     */
    public void setStalkLength(int stalkLength) {
        this.stalkLength = stalkLength;
    }

    /**
     * Метод генерирует HashCode объекта
     * @return возвращает HashCode объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(cost, fresh, stalkLength);
    }

/**
     * Метод позволяет сравнить на идентичность текущий объект класса цветок с переданным для сравнения
     *
     * @param obj параметр содержит объект для сравнения
     * @return результат сравнения
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        AFlower aFlower = (AFlower) obj;
        return cost == aFlower.cost &&
                stalkLength == aFlower.stalkLength &&
                fresh == aFlower.fresh;
    }

    /**
     * Метод возвращает информацию об объекте класса цветок
     *
     * @return содержит подробную информацию о текущем объекте
     */
    @Override
    public String toString() {
        return String.format("Cost: %d, Freshness: %s, StalkLength: %d",
                getCost(), getFresh(), getStalkLength());
    }

    /**
     * Переопределенный метод для сравнения свежести текущего объекта цветка
     * со свежестью объекта цветок переданного для сравнения
     *
     * @param obj содержит объект для сравнения с текущим объектом
     * @return возвращает результат сравнения свежести цветов
     */
    @Override
    public int compareTo(AFlower obj) {
        if (this.fresh.ordinal() > obj.fresh.ordinal())
            return 1;
        if (this.fresh.ordinal() < obj.fresh.ordinal())
            return -1;
        else
            return 0;
    }
}
