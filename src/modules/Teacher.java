package modules;


public class Teacher extends Person {
    private String subject;
    private int yearOfExperience;
    private int salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearOfExperience, int salary) {
        super(name, surname, age, gender);
        setSubject(subject);
        setYearOfExperience(yearOfExperience);
        setSalary(salary);
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getYearOfExperience(){
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience){
        this.yearOfExperience = yearOfExperience;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void giveRaise(double percentage){
        salary += (int)(salary * (percentage/100));
    }

    @Override
    public String toString(){
        return super.toString() + " I teach " + subject + " my salary is " + salary;
    }
}
