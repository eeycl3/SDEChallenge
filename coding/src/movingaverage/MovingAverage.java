package movingaverage;

public interface MovingAverage<T extends Number> {

    /**
     * This method calculates and return moving average of last N elements added
     * @param n - A integer to indicate the last n elements
     * @return (Moving) Average of last N elements added shown in double.
     * @throws InvalidInputException if the input n is not 1<=n<=currentSize of this data structure(list)
     */
    double getMovingAverage(Integer n);

    /**
     * add the element at the end in this data structure(list).
     * @param element – the element(Number) to be added.
     * @return the element at the specified position in this data structure
     * @throws NullPointerException – if the specified element is null.
     */
    void add(T element);

    /**
     * Returns the element at the specified position in this data structure.
     * @param index – index of the element to return
     * @return the element at the specified position in this data structure.
     * @throws IndexOutOfBoundsException – if the index is out of range (index < 0 || index >= size())
     */
    T get(Integer index);
}
