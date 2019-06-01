package kz.epam.course.classes.mainTask.entity;

/**
 * Класс обьекта цветка Роза
 */
public class Rose extends AFlower {

    /**
     * Стоимость цветка Роза
     */
    private int roseCost;

    /**
     * Конструктор для создания объекта Роза
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Rose(int cost, EFreshness fresh, int stalkLength) {
        super(0, fresh, stalkLength);
        setCost(cost);
    }

    /**
     * Переопределенный метод возвращает значение цены цветка
     *
     * @return возвращает значение цены цветка
     */
    @Override
    public int getCost() {
        return roseCost;
    }

    /**
     * Переопределенный метод позволяет занести значение цены цветка по уровню свежести.
     *
     * @param cost содержит значение цены цветка
     */
    @Override
    public void setCost(int cost) {
        switch (this.getFresh()) {
            case FULL_FRESH:
                roseCost = cost;
                break;
            case MIDDLE_FRESH:
                roseCost = cost - 2;
                break;
            case OLD_FRESH:
                roseCost = cost - 4;
                break;
        }
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
