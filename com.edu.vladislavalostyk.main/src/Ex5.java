/**
 * Created by Сашка on 27.10.2015.
 */
public class Ex5 {
    public class Dish {
        int price;
        int calories;
        String name;

        public Dish(int price, int calories, String name) {
            this.price = price;
            this.calories = calories;

            this.name = name;
        }

        public String toString() {
            return String.format(
                    " %9s страва\t, Ціна -: %5d,\t Калорійність %d "),
                    this.price, this.name, this.calories);
        }


    }
