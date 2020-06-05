package services.Imp;

import org.springframework.stereotype.Service;
import services.CaculationService;

@Service
public class CaculationServiceImp implements CaculationService {

    @Override
    public double Caculation(double num1, double num2, String temp) {
        double num;
        switch (temp) {
            case "addition":
                num = num1 + num2;
                break;
            case "subtraction":
                num = num1 - num2;
                break;
            case "multiplication":
                num = num1 * num2;
                break;
            case "division":
                num = num1 / num2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + temp);
        }
        return num;
    }
}
