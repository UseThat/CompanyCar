package pl.companycar.model;

public class Vehicle {
    private String brand;
    private String model;
    private String engine;
    private int productionYear;

    public Vehicle(String brand, String model, String engine, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return brand + "; "+model +"; "+ engine + "; "+ productionYear;
    }
}
