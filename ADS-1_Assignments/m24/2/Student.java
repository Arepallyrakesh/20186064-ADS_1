/**
 * Class for book.
 */
class Student {
    private String name;
    private Integer roll;
    private Double marks;
    Student(final Integer r, final String n, final Double m) {
        this.name = n;
        this.roll = r;
        this.marks = m;
    }
    String getName() {
        return this.name;
    }
    Integer getRoll() {
        return this.roll;
    }
    Double getMarks() {
        return this.marks;
    }
    int compareTo(final Student that) {
        if (this.marks.compareTo(that.marks) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}