package ru.job4j.array;

import java.util.Objects;

public class Cinema {
    public static Place checkEmptyPlace(Place[][] places) {
        boolean check;
        for (int i = 0; i < places.length; i++) {
            for (int j =  0; j < places[i].length; j++) {
                Place tmpPlace = new Place(i,j);
                check = !tmpPlace.equals(places[i][j]);
                check &= (i == 0 || places[i - 1][j] == null);
                check &= (i == places.length - 1 || places[i + 1][j] == null);
                check &= (j == 0 || places[i][j - 1] == null);
                check &= (j == places[i].length - 1 || places[i][j + 1] == null);
                if (check) {
                    return tmpPlace;
                }
            }
        }
        return null;
    }

    public static class Place {
        private int row;

        private int cell;

        public Place(int row, int cell) {
            this.row = row;
            this.cell = cell;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Place place = (Place) o;
            return row == place.row &&
                    cell == place.cell;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, cell);
        }
    }
}