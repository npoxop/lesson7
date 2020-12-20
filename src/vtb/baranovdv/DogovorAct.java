package vtb.baranovdv;

import java.util.Arrays;
import java.util.Date;

//Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата,
// список товаров (массив строк). Написать класс со статическим методом конвертации
// договора в акт (на вход передавать договор, на выходе получаем акт).
public class DogovorAct{
    public static void main(String[] args){
        Dogovor dogovor1 = new Dogovor(14, "12.05.2017", new String[]{"Кабачки", "Помидоры", "Укроп"});
        Dogovor dogovor2 = new Dogovor(15, "15.05.2017", new String[]{"Тушенка", "Грибы", "Яйца"});
        Act act1 = new Act(dogovor1.getNomer(), dogovor1.getData(), dogovor1.getGoods());
        Act act2 = new Act(dogovor2.getNomer(), dogovor2.getData(), dogovor2.getGoods());
        System.out.printf("Акт номер %d дата %s товары: %s", act1.nomer, act1.data, Arrays.toString(act1.goods));
        System.out.println();
        System.out.printf("Акт номер %d дата %s товары: %s", act2.nomer, act2.data, Arrays.toString(act2.goods));
    }
}

class Dogovor {
    int nomer;
    String data;
    String[] goods;

    Dogovor(int nomer, String data, String[] goods) {
        this.nomer = nomer;
        this.data = data;
        this.goods = goods;
    }

    public int getNomer() {
        return nomer;
    }
    public String getData(){
        return data;
    }
    public String[] getGoods(){
        return goods;
    }
}
class Act {
        int nomer;
        String data;
        String[] goods;

        Act (int nomer, String data, String[] goods){
            this.nomer = nomer;
            this.data = data;
            this.goods = goods;
        }

}
