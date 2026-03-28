package lab2;

public class Car {
    private String brand;
    private String model;
    private int id;
    private int yearGraduation;
    private double pricePerDay;
    private boolean isAvailable;
    private String description;

    public Car() {

    }

    public Car(String brand, String model, int yearGraduation, int id, double pricePerDay, boolean isAvilable, String description) {
        this.brand = brand;
        this.model = model;
        this.yearGraduation = yearGraduation;
        this.id = id;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvilable;
        this.description = description;
    }

    public String getBrand() {return brand;}

    public String getModel() {return model;}

    public int getId() {return id;}

    public int getYearGraduation() {return yearGraduation;}

    public double getPricePerDay() {return pricePerDay;}

    public boolean isAvilable() {return isAvailable;}

    public String getDescription() {return description;}

    public void setBrand(String brand) {this.brand = brand;}

    public void setModel(String model) {this.model = model;}

    public void setId(int id) {this.id = id;}

    public void setYearGraduation(int yearGraduation) {this.yearGraduation = yearGraduation;}

    public void setPricePerDay(double pricePerDay) {this.pricePerDay = pricePerDay;}

    public void setDescription(String description) {this.description = description;}

    public void setAvilable(boolean avilable) {isAvailable = avilable;}

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", yearGraduation=" + yearGraduation +
                ", pricePerDay=" + pricePerDay +
                ", isAvilable=" + isAvailable +
                ", description='" + description + '\'' +
                '}';
    }
}
