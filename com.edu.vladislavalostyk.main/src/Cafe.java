/**
 * Created by ����� on 27.10.2015.
 */
public class Cafe {

    public static void main(String[] args) {

        Dish[] dishes = new Dish[6];
        dishes[0] = new Dish(42, 508, "�������");
        dishes[1] = new Dish(23, 487, "������");
        dishes[2] = new Dish(7, 114, "�����");
        dishes[3] = new Dish(35, 617, "��������");
        dishes[4] = new Dish(33, 988, "������");
        dishes[5] = new Dish(9, 56, "�����");

        for (int i = 0; i < dishes.lenght; i++) {
            System.out.println(dishes[i]);
        }

    }

}
