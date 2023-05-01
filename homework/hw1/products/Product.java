package homework.hw1.products;

//Реализовать класс товар, содержащий следующие свойства:
//        1. Название
//        2. Цена
//        3. Количество
//        4. Единица измерения
//        А так же реализовать следующие классы-наследники:
//        1. Продукты питания, содержащие следующие свойства:
//        1.1 Срок годности
//        2. Напитки, содержащие следующие свойства:
//        2.1 Объём
//        3. Предметы гигиены, содержащие следующие свойства:
//        3.1 Количество штук в упаковке
//        4. Детские товары:
//        4.1 Минимальный возраст
//        4.2 Гипоаллергенность,
//        А так же реализовать слеюущие классы, наследуемые от приведённых выше классов
//        (надеюсь сами разберётесь от каких именно):
//        5. Молоко, содержащиее следующее свойство:
//        5.1 Процент жирности
//        5.2 Срок годности
//        6. Лимонад
//        7. Хлеб, содержащий следующие свойство:
//        7.1 Тип муки
//        8. Яйца, содержащее следующиее свойство:
//        8.1 Количество в упаковке
//        9. Маски
//        10. Туалетная бумага, содержащее следующее свойство:
//        10.1 Количество слоёв
//        11. Подгузники, содержащие следующее свойства:
//        11.1 Размер
//        11.2 Минимальный вес
//        11.3 Максимальный вес
//        11.4 Тип
//        12. Соска
//        У всех классов перегрузить метод ToString класса Object, от которого наследуются все классы,
//        в котором будет происходить вывод всей информации о товаре, так же реализовать конструкторы,
//        принемающие все поля.
//        Реализовать в классе Program, метод выводящий все данные о товаре. Создать в Main все объекты
//        товаров и проверить работу метода, созданного в классе Program


public abstract class Product {

    private String name;
    private double price;
    private int amount;
    private String unit;

    protected Product(String name, double price, int amount, String unit){
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object quantity) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + name + '\'' +
                ", Price=" + price +
                ", Amount=" + amount +
                " " + unit +
                '}';
    }
}
