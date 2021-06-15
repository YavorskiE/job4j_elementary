package ru.job4j;

import java.util.Objects;

public class Equals2 {

    private String name;
    private int index;
    private double weight;

    public Equals2(String name, int index, double weight) {
        this.name = name;
        this.index = index;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Equals2{"
                + "name='" + name + '\''
                + ", index=" + index
                + ", weight=" + weight
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Equals2)) return false;
        Equals2 toPlay = (Equals2) o;
        return getIndex() == toPlay.getIndex()
                && Double.compare(toPlay.getWeight(), getWeight()) == 0
                && Objects.equals(getName(), toPlay.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getIndex(), getWeight());
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//        Equals2 other = (Equals2) obj;
//        if (name == null) {
//            if (other.name != null)
//                return false;
//        } else if (!name.equals(other.name))
//            return false;
//        if (index != other.index)
//            return false;
//        if (Math.abs(weight - other.weight) > 0.01)
//            return false;
//        return true;
//    }

//    @Override
//    public int hashCode() {
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + (name == null ? 0 : name.hashCode());
//        result = prime * result + index;
//        result = prime * result + (int) weight;
//        return result;
//    }
}
