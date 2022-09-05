import java.util.List;

public class T2Main {
    public static void main(String[] args) {
        Student Pavel = new Student();
        Student Evgeny = new Student(20,"Evgeny");
        Student Larion = new Student(20,"Larion");
        Student Oleg = new Student(20,"Oleg");
        University AMVD = new University();
        Pavel.setAge(20);
        Pavel.setName("Pavel");
        Evgeny.setAge(22);
        Evgeny.setName("Evgeny");
        Larion.setAge(22);
        Larion.setName("Larion");
        Oleg.setAge(25);
        Oleg.setName("Oleg");
        Larion.getMarks().add(5);
        Larion.getMarks().add(5);
        Larion.getMarks().add(5);
        Larion.getMarks().add(5);
        Pavel.getMarks().add(4);
        Pavel.getMarks().add(4);
        Pavel.getMarks().add(4);
        Pavel.getMarks().add(4);
        Evgeny.getMarks().add(1);
        Evgeny.getMarks().add(3);
        Evgeny.getMarks().add(3);
        Evgeny.getMarks().add(5);
        Oleg.getMarks().add(2);
        Oleg.getMarks().add(2);
        Oleg.getMarks().add(3);
        Oleg.getMarks().add(3);
        AMVD.setNameOfUniversity("Academy");
        AMVD.getArrayStudents().add(Pavel.getName());
        AMVD.getArrayStudents().add(Larion.getName());
        AMVD.getArrayStudents().add(Evgeny.getName());
        AMVD.getArrayStudents().add(Oleg.getName());
        Larion.calculationMarks();
        System.out.println(Larion.getMarks());
        System.out.println(AMVD.getNameOfUniversity());
        System.out.println(AMVD.getArrayStudents());
        System.out.println(Larion.getSrZnachMarks());
    }

}
