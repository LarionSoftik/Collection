import java.util.ArrayList;
import java.util.List;

public class Student {
    private int age;
    private String name;
    private List marks = new ArrayList<>();
    private int srZnachMarks = calculationMarks();

    public int calculationMarks(Student.Larion.marks){
        int sumMarks = 0;
        int size;
        for (int i = 0; i < marks.size(); i++){
            int z = (int) marks.get(i);
            sumMarks = sumMarks + z;
        }
        srZnachMarks = sumMarks / Larion.marks.size();
        return srZnachMarks;
    }

    public int getSrZnachMarks() {
        return srZnachMarks;
    }

    public void setSrZnachMarks(int srZnachMarks) {
        this.srZnachMarks = srZnachMarks;
    }

    public Student(int age, String name, List marks, int srZnachMarks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
        this.srZnachMarks = srZnachMarks;
    }

    public Student() {
    }

    public Student(int age, String name) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getMarks() {
        return marks;
    }

    public void setMarks(List marks) {
        this.marks = marks;
    }
}