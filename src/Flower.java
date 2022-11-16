public class Flower {
    private String flowerColor;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if(flowerColor==null){
            this.flowerColor = "информация не указана";
        }else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Информация не указана";
        }else {
            this.country = country;
        }
        if (cost <= 0) {
            this.cost = 1;
        }else {
            this.cost = cost;
        }
        this.cost = cost;
        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        }else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String flowerColor, String country, double cost) {
        this(flowerColor, country, cost, 3);
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null && flowerColor.isEmpty()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null & country.isEmpty()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        }else{
            this.cost = cost;
        }
    }
}
