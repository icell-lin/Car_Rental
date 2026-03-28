package lab2;

public class DamageReport {
    private int id;
    private String description;
    private double repairCost;
    private RentalOrder rentalOrder;


    public DamageReport() {

    }

    public DamageReport(int id, double repairCost, String description) {
        this.id = id;
        this.repairCost = repairCost;
        this.description = description;
    }

    public DamageReport(int id, String description, double repairCost, RentalOrder rentalOrder) {
        this.id = id;
        this.description = description;
        this.repairCost = repairCost;
        this.rentalOrder = rentalOrder;
    }

    public RentalOrder getRentalOrder() {return rentalOrder;}

    public void setRentalOrder(RentalOrder rentalOrder) {this.rentalOrder = rentalOrder;}

    public void setId(int id) {this.id = id;}

    public void setDescription(String description) {this.description = description;}

    public void setRepairCost(double repairCost) {this.repairCost = repairCost;}

    public String getDescription() {return description;}

    public double getRepairCost() {return repairCost;}

    public int getId() {return id;}

    @Override
    public String toString() {
        return "DamageReport{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", repairCost=" + repairCost +
                '}';
    }
}
