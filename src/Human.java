public class Human {

    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    public Human( String name, String town, int yearOfBirth, String jobTitle) {
        if (name == null) {
            this.name = "Информация не указана";
        }else{
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        }else{
            this.town = town;
        }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        }else{
            this.yearOfBirth = yearOfBirth;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        }else {
            this.jobTitle = jobTitle;
        }
    }
    void say() {
        System.out.println("Привет! Меня зовут "+name+".Я из города-"+town+".Я родился в "+yearOfBirth+" году.Я работаю на должности "+ jobTitle+ ".Будем знакомы!");
    }
}




