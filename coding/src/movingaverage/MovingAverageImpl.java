package movingaverage;

import java.util.ArrayList;
import java.util.List;

public class MovingAverageImpl<T extends Number> implements MovingAverage {

    private List<T> list = new ArrayList<>();

    @Override
    public double getMovingAverage(Integer n) {
        int size = list.size();
        if (n > size || n<1) {
            String errorMessage = String.format("input n:%s is invalid, it should be 1 <= n <= %s ", n, size);
            throw new InvalidInputException(errorMessage);
        }
        double sum = 0.0;
        int i = n - 1;
        while (i >= 0) {
            sum = sum + list.get(size - 1 - i).doubleValue();
            i--;
        }
        return sum / n;
    }

    @Override
    public void add(Number element) {
        if (element == null) {
            throw new NullPointerException();
        }
        list.add((T) element);
    }


    @Override
    public T get(Integer index) {
        return list.get(index);
    }
}
