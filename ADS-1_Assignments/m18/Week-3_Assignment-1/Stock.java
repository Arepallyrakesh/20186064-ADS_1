import java.util.Scanner;
import java.util.ArrayList;

class Stock implements Comparable<Stock> {

    private String name;

    private Double change;

    Stock(String a, Double b) {

        this.name = a;

        this.change = b;

    }

    String getname() {

        return this.name;

    }

    Double getchange() {

        return this.change;

    }

    String print() {

        return this.name + " " + this.change;

    }

    public int compareTo(final Stock that) {

        if (this.change > that.change) {

            return 1;

        } else if (this.change < that.change) {

            return -1;

        } else {

            return this.name.compareTo(that.name);

        }

    }

}