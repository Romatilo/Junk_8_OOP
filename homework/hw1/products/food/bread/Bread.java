package homework.hw1.products.food.bread;

import homework.hw1.products.food.Food;

public class Bread extends Food {
    public Bread(String name, double Price, int amount, Date expireDate  )

}

//        public class Bread extends Food {
//            public Bread(String name, Double price, Integer quantity, Date exDate, String flourType) {
//                super(name, price, quantity, "шт.", exDate);
//                this.flourType = flourType;
//            }
//
//            public String getFlourType() {
//                return flourType;
//            }
//
//            public void setFlourType(String flourType) {
//                this.flourType = flourType;
//    public Bread(String name, double price, double amount, String unit) {
//                    super(name, price, amount, "pcs", );
//
//                    String flourType;            }
//
//            /**
//             * Тип муки
//             */
//            private String flourType; // По идее где то должен быть словарь static List<String> flourType = List.of("Ржаная", "Пшеничная"...); и тут хранить только индекс на этот словарь.
//
//            @Override
//            public String toString() {
//                return "Bread - " +
//                        super.toString().replace("}", ", Тип муки = " + flourType + "}");
//            }
//    }
}
