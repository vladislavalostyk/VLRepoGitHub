/**
 * Created by Сашка on 27.10.2015.
 */
public class Cafe {

    public static void main(String[] args) {

        Dish[] dishes = new Dish[6];
        dishes[0] = new Dish(42, 508, "Голубки");
        dishes[1] = new Dish(23, 487, "Борщик");
        dishes[2] = new Dish(7, 114, "Узвар");
        dishes[3] = new Dish(35, 617, "Вареники");
        dishes[4] = new Dish(33, 988, "Крумплі");
        dishes[5] = new Dish(9, 56, "Кавіль");

        for (int i = 0; i < dishes.lenght; i++) {
            System.out.println(dishes[i]);
        }

    }

}
