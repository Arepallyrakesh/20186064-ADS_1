class Student implements Comparable<Student> {
    int roll;
    String name;
    double marks;
    Student (int r, String n, double m) {
        this.roll = r;
        this.name = n;
        this.marks = m;
    }

    public int getrollnum(){
        return roll;
    }


    public void setrollnum(int rollnum){
        this.roll = rollnum;
    }

   public String getname(){
        return name;
    }

    public void setname(String name){
        this.name = name;
    }

    public double getmarks(){
        return marks;
    }

    public void setmarks(double marks){
        this.marks = marks;
    }

    public String toString() {
        return this.roll + "," + this.name + "," + this.marks; 
    }
   public  int compareTo(final Student that) {
        if (this.marks > that.marks) {
            return -1;
        }
        if (this.marks < that.marks) {
            return 1;
        }
        if (this.marks == that.marks) {
            if (this.name.compareTo(that.name) >  0) {
                System.out.println("jshdfhsfsd");
                return -1;
            }
            if (this.name.compareTo(that.name) < 0) {
                return 1;
            }
        }
        if (this.marks == that.marks && this.name.equals(that.name)) {
            if (this.roll > that.roll) {
                return -1;
            }
            if (this.roll < that.roll) {
                return 1;
            }
        }
        return 0;
    }
}

