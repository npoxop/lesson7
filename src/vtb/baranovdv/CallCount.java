package vtb.baranovdv;
//Реализовать класс в конструкторе которого будет счетчик количества создаваемых объектов. Написать метод для получения информации о количестве.
public class CallCount {
    public static void main (String[] args){
        Object vasya = new Object("Вася");
        System.out.println(String.format("Текущий счетчик: %d", vasya.getCount()));
        Object petya = new Object("Петя");
        System.out.println(String.format("Текущий счетчик: %d", petya.getCount()));
        Object leha = new Object("Леха");
        System.out.println(String.format("Текущий счетчик: %d", leha.getCount()));
    }
}
class Object {
    String name;
    int id;
    static int count = 0;
    Object(String name) {
    this.name = name;
    this.id = ++count;
}
    public static int getCount(){
        return count;
    }
    public void main (String[] args) {
    }
}

