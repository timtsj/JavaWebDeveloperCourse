package kz.epam.course.classes.mainTask.entity;

/**
 * Класс обьекта цветка Лилия
 */
public class Lily extends AFlower {

    /**
     * Стоимость цветка Лилия
     */
    private int lilyCost;

    /**
     * Конструктор для создания объекта Лилия
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Lily(int cost, EFreshness fresh, int stalkLength) {
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
        return lilyCost;
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
                lilyCost = cost;
                break;
            case MIDDLE_FRESH:
                lilyCost = cost - 3;
                break;
            case OLD_FRESH:
                lilyCost = cost - 6;
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
        return String.format("%s; %s", "Lily", super.toString());
    }
}
