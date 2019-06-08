package kz.epam.course.classes.mainTask.entity;

import kz.epam.course.classes.mainTask.utils.FreshnessType;

import java.util.Objects;

/**
 * Абстрактый класс для наследования объектов Цветок
 */
public abstract class AbstractFlower implements Comparable<AbstractFlower> {

    /**
     * Стоимость цветка
     */
    int cost;

    /**
     * Свежесть цветка
     */
    private FreshnessType fresh;

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
    public AbstractFlower(int cost, FreshnessType fresh, int stalkLength) {
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
    public void setCost(int cost, int middleDiscount, int oldDiscount) {
        switch (getFresh()) {
            case FULL_FRESH:
                this.cost = cost;
                break;
            case MIDDLE_FRESH:
                this.cost = cost - middleDiscount;
                break;
            case OLD_FRESH:
                this.cost = cost - oldDiscount;
                break;
        }
    }

    /**
     * Метод возвращает значение свежести цветка
     *
     * @return возвращает значение свежести цветка
     */
    public FreshnessType getFresh() {
        return fresh;
    }

    /**
     * Метод позволяет занести значение свежести цветка
     * @param fresh содержит значение свежести цветка
     */
    public void setFresh(FreshnessType fresh) {
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
        AbstractFlower abstractFlower = (AbstractFlower) obj;
        return cost == abstractFlower.cost &&
                stalkLength == abstractFlower.stalkLength &&
                fresh == abstractFlower.fresh;
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
    public int compareTo(AbstractFlower obj) {
        if (this.fresh.ordinal() > obj.fresh.ordinal())
            return 1;
        if (this.fresh.ordinal() < obj.fresh.ordinal())
            return -1;
        else
            return 0;
    }
}
