/**
 * Created by Сашка on 27.10.2015.
 */
public class Cafe {

    public static void main(String[] args) {

        Ex5.Dish[] dishes = new Ex5.Dish[6];
        dishes[0] = new Ex5.(42, 508, "Голубки");
        dishes[1] = new Ex5.(23, 487, "Борщик");
        dishes[2] = new Ex5.(7, 114, "Узвар");
        dishes[3] = new Ex5.(35, 617, "Вареники");
        dishes[4] = new Ex5.(33, 988, "Крумплі");
        dishes[5] = new Ex5.(9, 56, "Кавіль");

        for (int i = 0; i < dishes.lenght; i++) {
            System.out.println(dishes[i]);
        }

    }

}
