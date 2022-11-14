public class Main {
    public static void main(String[] args) {
        Human maxim =new Human("Максим","Минск",1988,"бренд-менеджер");
        Human anna = new Human("Аня","Москва",1993,"методист образовательных программ");
        Human kate = new Human("Катя","Калиниград",1992,"продакт-менеджер");
        Human artem = new Human("Артем","Москва",1995,"директор по развитию");
        maxim.say();
        anna.say();
        kate.say();
        artem.say();
    }
}
