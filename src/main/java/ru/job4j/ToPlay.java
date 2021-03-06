package ru.job4j;

import java.util.Objects;

public class ToPlay {

    String name;
    int index;
    double weight;

    public ToPlay(String name, int index, double weight) {
        this.name = name;
        this.index = index;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "ToPlay{"
                + "name='" + name + '\''
                + ", index=" + index
                + ", weight=" + weight
                + '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof ToPlay)) return false;
//        ToPlay toPlay = (ToPlay) o;
//        return index == toPlay.index
//                && Double.compare(toPlay.weight, weight) == 0
//                && name.equals(toPlay.name);
//    }

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
        ToPlay other = (ToPlay) obj;
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

    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four", "five"};
        for (int i =0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        for (String number : numbers) {
            System.out.println(number);
        }
        ToPlay toPlay = new ToPlay("Fedor", 999, 78.9);
        System.out.println(toPlay);
    }
}
