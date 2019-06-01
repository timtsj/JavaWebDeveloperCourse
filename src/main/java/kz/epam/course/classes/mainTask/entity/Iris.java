package kz.epam.course.classes.mainTask.entity;

/**
 * Класс обьекта цветка Ирис
 */
public class Iris extends AFlower {

    /**
     * Стоимость цветка Ирис
     */
    private int irisCost;

    /**
     * Конструктор для создания объекта Ирис
     * @param cost          параметр содержит цену цветка
     * @param fresh         параметр содержит уровень свежести цветка
     * @param stalkLength   параметр содержит количество стеблей цветка
     */
    public Iris(int cost, EFreshness fresh, int stalkLength) {
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
        return irisCost;
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
                irisCost = cost;
                break;
            case MIDDLE_FRESH:
                irisCost = cost - 3;
                break;
            case OLD_FRESH:
                irisCost = cost - 6;
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
        return String.format("%s; %s", "Iris", super.toString());
    }
}
