import java.lang.module.FindException;

public class BmiService {
    public int calculate(int weightKg, double heigtInMeters) {
        return (int) (weightKg / heigtInMeters / heigtInMeters);
    }

}

