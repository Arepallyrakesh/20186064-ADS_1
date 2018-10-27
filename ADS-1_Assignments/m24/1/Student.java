/**
 * Class for student.
 */
class Student {
    /**
     * studnet name.
     */
    private String name;
    /**
     * student marks.
     */
    private Double marks;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      t     { parameter_description }
     */
    Student(final String n, final Double m) {
        this.name = n;
        this.marks = m;
    }
   
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the marks.
     *
     * @return     The marks.
     */
    public Double getMarks() {
        return this.marks;
    }
}
