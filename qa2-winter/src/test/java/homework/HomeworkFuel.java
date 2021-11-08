package homework;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class HomeworkFuel {
    @Test
    public void calculationFuel() {
        int fuelFor100km = 15;
        int distance = 200;
        int fuelFor1km;

//        fuelFor1km = (fuelFor100km / 100);
//        double result = fuelFor1km * distance;

        double result = (distance * fuelFor100km) / 100;

        System.out.println(result + " литров топлива понадобится");

    }
}

