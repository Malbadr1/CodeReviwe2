public class Employee {


   private  String name;
   private  String surname;
   private  int yearOfBirth;
   private  double salary;

    public Employee() {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
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

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}



class  EmployeeTest{

    public static void main(String[] args) {

        Employee employee1=new Employee();
        employee1.setName("ali");
        employee1.setSurname("Deo");
        employee1.setYearOfBirth(1980);
        employee1.setSalary(1500);

        System.out.println("Name : "+employee1.getName());
        System.out.println("Surname : "+employee1.getSurname());
        System.out.println("YearOfBirth : "+employee1.getYearOfBirth());
        System.out.println("Salary : "+employee1.getSalary()+"€"+"\n");

        System.out.println("The Second Employee");

        Employee employee2=new Employee();
        employee2.setName("Jon");
        employee2.setSurname("bill");
        employee2.setYearOfBirth(1989);
        employee2.setSalary(1550);

        System.out.println("Name : "+employee2.getName());
        System.out.println("Surname : "+employee2.getSurname());
        System.out.println("YearOfBirth : "+employee2.getYearOfBirth());
        System.out.println("Salary : "+employee2.getSalary()+"€");





    }

}
