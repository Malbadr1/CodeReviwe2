import java.util.ArrayList;

public class Student {

    private  String name;
    private  String surname;
    private  int yearOfBirth;
    private  int age;
    private  String classes;

    public Student(String name, String surname, int yearOfBirth, int age, String classes) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.age = age;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student " +
                "name is :" + name + '\'' + surname + '\'' +
                ", yearOfBirth : " + yearOfBirth +
                ", age : " + age +
                ", goes to class : " + classes + '\'' +"\n";
    }
}

class StudentUtil{
    public static void getStudent(ArrayList<Student> student){
        for (Student st:student) {
            System.out.println(st);

        }

    }
}

class StudentTest{


    public static void main(String[] args) {

        ArrayList<Student> student=new ArrayList<>();
       student.add(new Student("maxi","gerhard",2014,6,"1a")) ;
        student.add(new Student("Arm","Dje",2013,7,"1c"));
        student.add(new Student("Aso","Doe",2012,8,"2b"));
        student.add(new Student("mary","Leo",2011,9,"3a"));
        student.add(new Student("sara","Leo",2010,10,"4c"));

        StudentUtil.getStudent(student);


    }
}
