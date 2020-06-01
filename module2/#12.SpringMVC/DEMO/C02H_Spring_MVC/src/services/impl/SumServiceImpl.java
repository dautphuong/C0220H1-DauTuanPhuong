package services.impl;

import org.springframework.stereotype.Service;
import services.SumService;

@Service
public class SumServiceImpl implements SumService {
    @Override
    public double sum(double a, double b) {
        return a + b;
    }
}
