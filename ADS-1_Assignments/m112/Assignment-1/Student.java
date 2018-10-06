public class Student implements Comparable<Student> {
    String name;
    String dateofbirth;
    int subject1;
    int subject2;
    int subject3;
    int totalmarks;
    String reservation;
    Student(String nm, String dob, int sub1, int sub2, int sub3,int tma, String res) {
        this.name = nm;
        this.dateofbirth = dob;
        this.subject1 = sub1;
        this.subject2 = sub2;
        this.subject3 = sub3;
        this.totalmarks = tma;
        this.reservation = res;
    }
    public String toString() {
        return this.name + "," + this.totalmarks + "," + this.reservation;
    }
    public String getdateofbirth() {
        return this.dateofbirth;
    }
    public int getSub1() {
        return this.subject1;
    }

    public int getSub2() {
        return this.subject2;
    }
    public int getSub3() {
        return this.subject3;
    }
    public int getTotal() {
        return this.totalmarks;
    }
    public String getRes() {
        return this.reservation;
    }


    public int compareTo(Student std){
        if(this.totalmarks < std.totalmarks){
            return -1;
        }else if(this.subject3 > std.subject3){
            return 1;
        }else if(this.subject2 < std.subject2){
            return 1;
        /*}else if(this.inn > pl2.inn){
            return -1;
        }else if(this.name.compareTo(pl2.name) < 0){
            return 1;
        }else if(this.name.compareTo(pl2.name) > 0){
            return -1;*/
        }return 0;
    }
}