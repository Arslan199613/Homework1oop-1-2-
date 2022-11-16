public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калиниград", 1992, "продакт-менеджер");
        Human artem = new Human("Артем", "Москва", 1995, "директор по развитию");
        Human vladimir = new Human("Владимир", "Казань", currentYear - 21, null);

        System.out.println("Задание 1");
        printInfo((maxim));
        printInfo(anna);
        printInfo((kate));
        printInfo(artem);
        printInfo(vladimir);


        Flower rosa = new Flower(null, "Голландии", 35.59, 3);
        Flower hrizantema = new Flower(null, null, 15.00, 5);
        Flower pion = new Flower(null, "Англи", 69.9, 1);
        Flower gipsofila = new Flower(null, "Турция", 19.5, 10);



        System.out.println("Задание 2");
        System.out.println("Роза обыкновенная из "+ rosa.getCountry()+", стоимость штуки-"+rosa.getCost()+" рублей");
        System.out.println("Хризантема, стоимость штуки-"+hrizantema.getCost()+" рублей"+", срок стояния- "+hrizantema.lifeSpan+"дней");
        System.out.println("Пион из "+pion.getCountry()+", стоимость штуки - "+pion.getCost()+" рублей"+ ", срок стояния-"+ pion.lifeSpan+"день");
        System.out.println("Гипсофила,страна происхождения -"+gipsofila.getCountry()+", стоимость штуки-"+gipsofila.getCost()+"рублей"+", срок стояния-"+gipsofila.lifeSpan+"дней");

        printCostOfFlowers( rosa,rosa,rosa,
                hrizantema,hrizantema,hrizantema,hrizantema,hrizantema,
                gipsofila);
    }
    private static void printInfo(Human human) {
        System.out.println("Привет! Меня зовут " + human.name + ".Я из города-" + human.getTown() + ".Я родился в " + human.getYearOfBirth() + " году.Я работаю на должности " + human.jobTitle + ".Будем знакомы!");
    }

    private static void printCostOfFlowers(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();

        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета: "+ totalCost);
        System.out.println("Срок стояния букета: "+minimumLifeSpan);
    }

}


