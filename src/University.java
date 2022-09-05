import java.util.ArrayList;
import java.util.List;

public class University {
    String nameOfUniversity;
    List arrayStudents = new ArrayList<>();
    int top;

    private static void calculationTheRating(){

    }

    public University(String nameOfUniversity, List arrayStudents, int top) {
        this.nameOfUniversity = nameOfUniversity;
        this.arrayStudents = arrayStudents;
        this.top = top;
    }

    public University() {
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public List getArrayStudents() {
        return arrayStudents;
    }

    public void setArrayStudents(List arrayStudents) {
        this.arrayStudents = arrayStudents;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
