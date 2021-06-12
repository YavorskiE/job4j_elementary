package ru.job4j;

import java.util.Objects;

public class Equals0 {

    private String name;
    private int index;
    private double weight;

    public Equals0(String name, int index, double weight) {
        this.name = name;
        this.index = index;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Equals0{"
                + "name='" + name + '\''
                + ", index=" + index
                + ", weight=" + weight
                + '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Equals0)) return false;
//        Equals0 toPlay = (Equals0) o;
//        return index == toPlay.index
//                && Double.compare(toPlay.weight, weight) == 0
//                && name.equals(toPlay.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, index, weight);
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Equals0 other = (Equals0) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (index != other.index)
            return false;
        if (Math.abs(weight - other.weight) > 0.01)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + index;
        result = prime * result + (int) weight;
        return result;
    }
}
