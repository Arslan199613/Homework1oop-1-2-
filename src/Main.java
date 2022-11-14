public class Main {
    public static void main(String[] args) {
        Human maxim =new Human();
        maxim.name = "Максим";
        maxim.town = "Минск";
        maxim.yearOfBirth = 1988;
        maxim.jobTitle = "бренд-менеджер";
        maxim.say();

        Human anna = new Human();
        anna.name = "Аня";
        anna.town = "Москва";
        anna.yearOfBirth = 1993;
        anna.jobTitle = "методист образовательных программ";
        anna.say();

        Human kate = new Human();
        kate.name = "Катя";
        kate.town = "Калинград";
        kate.yearOfBirth = 1992;
        kate.jobTitle = "продакт-менеджер";
        kate.say();

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 1995;
        artem.jobTitle = "директор по развитию бизнеса";
        artem.say();

    }
}
