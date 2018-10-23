/**
 * Class for details.
 */
class Details {
    /**
     * name.
     */
    private String name;
    /**
     * dob.
     */
    private String dob;
    /**
     * s1.
     */
    private int subject1;
    /**
     * s2.
     */
    private int subject2;
    /**
     * s3.
     */
    private int subject3;
    /**
     * total.
     */
    private int total;
    /**
     * cat.
     */
    private String category;
    /**
     * Constructs the object.
     *
     * @param      n     { parameter_description }
     * @param      d     { parameter_description }
     * @param      s1    The s 1
     * @param      s2    The s 2
     * @param      s3    The s 3
     * @param      t     { parameter_description }
     * @param      rc    The rectangle
     */
    Details(final String n, final String d, final int s1,
            final int s2, final int s3, final int t, final String rc) {
        this.name = n;
        this.dob = d;
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
        this.total = t;
        this.category = rc;    
    }
    /**
     * get name.
     *
     *Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    String getname() {
        return this.name;
    }
    /**
     * get dob.
     *
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     *
     * @return     { description_of_the_return_value }
     */
    String getdob() {
        return this.dob;
    }
    /**
     * get s1.
     * Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    int getsubject1() {
        return this.subject1;
    }
    /**
     * get s2.
     *
     * @return     { description_of_the_return_value }
     */
    int getsubject2() {
        return this.subject2;
    }
    /**
     * s3.
     *  Best case: O(1)
     *  worst case: O(1)    
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    int getsubject3() {
        return this.subject3;
    }
    /**
     * total.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    int gettotal() {
        return this.total;
    }
    /**
     * cat.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    String getcategory() {
        return this.category;
    }
    /**
     * get age.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    int getage() {
        int age = 0;
        final int year = 2018, days = 365, month = 30, ten = 10;
        String[] token = this.getdob().split("-");
        age += (year - Integer.parseInt(token[2])) * days;
        age += (ten - Integer.parseInt(token[1])) * month;
        age += Integer.parseInt(token[0]);

        return age;
    }
    /**
     * compare.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Details that) {
        if (this.gettotal() > that.gettotal()) {
            return 1;
        } else if (this.gettotal() < that.gettotal()) {
            return -1;
        } else {
            if (this.getsubject3() > that.getsubject3()) {
                return 1;
            } else if (this.getsubject3() < that.getsubject3()) {
                return -1;
            } else {
                if (this.getsubject2() > that.getsubject2()) {
                    return 1;
                } else if (this.getsubject2() < that.getsubject2()) {
                    return -1;
                } else {
                    if (this.getage() < that.getage()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            }
        }

    }    
    /**
     * prints.
     *  Best case: O(1)
     *  worst case: O(1)
     *  Average case: O(1)
     * @return     { description_of_the_return_value }
     */
    String print() {
        return this.getname() + "," + this.gettotal() + ","
               + this.getcategory();
    }
}
