package es.upm.miw.iwvg.forge.junit;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public final String EMPTY_COLLECTION_EXCEPTION = "Empty collection";

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION_EXCEPTION);
        }
        /*
        double sum = 0;
        for (double item : this.collection) {
            sum += item;
        }
        return sum;
        */
        // return this.collection.stream().mapToDouble(value -> value).sum();
        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException(EMPTY_COLLECTION_EXCEPTION);
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }

    public Double lower() {
       if(collection == null || collection.isEmpty()) {
           throw new ArithmeticException(EMPTY_COLLECTION_EXCEPTION);
        }
        double lowerItem = this.collection.get(0);
        for (double item : this.collection) {
            if (item < lowerItem) {
                lowerItem = item;
            }
        }
        return lowerItem;
    }

}
