package Collections;

import java.util.Objects;

public class Car {
    private  int hashCode;
    private final int id;
    private static int counterCars = 0;
    private final String modelName;
    private final CarBrand brand;
    private boolean isTrading;

    public Car(String modelName, CarBrand brand, boolean isTrading){
        this.modelName = modelName;
        this.brand = brand;
        this.isTrading = isTrading;
        id = counterCars++;
        hashCode = 12;
        hashCode = 31 * hashCode + (modelName != null ? modelName.hashCode() : 0);
        hashCode = 31 * hashCode + (brand != null ? brand.hashCode() : 0);
    }

    @Override
    public boolean equals(Object object){
        if(object == this)
            return true;
        if(object == null || getClass() != object.getClass())
            return false;
        Car car = (Car) object;
        return Objects.equals(modelName,car.modelName) && Objects.equals(brand,car.brand);
    }

    @Override
    public int hashCode(){
        return hashCode;
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append("{ ").append(" ID: ").append(id).append(" ModelName: ").append(modelName).append(" Brand: ")
                .append(brand).append(" Trading: ").append(isTrading).append(" }");
        return result.toString();
    }

}
