package web.model;

public class Car {

    private String model;

    private int series;

    private int id;

    public Car(String model, int series, int id) {
        this.model = model;
        this.series = series;
        this.id = id;
    }

    public int getSeries() {
        return series;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", id=" + id +
                '}';
    }
}
