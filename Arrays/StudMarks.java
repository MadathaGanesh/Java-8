
public class StudMarks implements Comparable<StudMarks> {

    private int maths;
    private int science;

    public StudMarks(int maths, int science) {
        this.maths = maths;
        this.science = science;
    }

    public String toString() {
        return "Student Marks+[ maths= " + maths + " science = " + science + "  ] ";
    }

    public int getmaths() {
        return maths;
    }

    public int getscience() {
        return science;
    }

    @Override
    public int compareTo(StudMarks o) {
        /*
         * current object < other object return "-1"
         * current object > other object return "1"
         * current object == other object return "0"
         * Writing instead of above 3 lines just simply write below return statement
         */
        System.out.println("CompatreTo() method called");
        return o.maths - this.maths; // It will display in descending order
        // return this.maths - o.maths; // It will display in ascending order
    }
}