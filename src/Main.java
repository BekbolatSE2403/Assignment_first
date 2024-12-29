import modules.School;
import modules.Student;
import modules.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws FileNotFoundException {
        School school = new School();

        Scanner studentScanner = new Scanner(new File("C:\\Users\\TIMING.KZ\\Assignment1\\src\\Student.txt"));
        while(studentScanner.hasNext()){
            String line = studentScanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            boolean gender = parts[3].equals("Male");
            Student student = new Student(name, surname, age, gender);

            for(int i = 4; i< parts.length; i++){
                student.addGrade(Integer.parseInt(parts[i]));
            }

            school.addMember(student);

        }

        studentScanner.close();

        Scanner teacherScanner = new Scanner(new File("C:\\Users\\TIMING.KZ\\Assignment1\\src\\Teacher.txt"));
        while(teacherScanner.hasNext()){
            String line = teacherScanner.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            boolean gender = parts[3].equals("Male");
            String subject = parts[4];
            int yearOfExperience = Integer.parseInt(parts[5]);
            int salary = Integer.parseInt(parts[6]);
            Teacher teacher = new Teacher(name, surname, age, gender,subject,yearOfExperience,salary);

            if(yearOfExperience > 10){
                teacher.giveRaise(10);
            }

            school.addMember(teacher);
        }

        teacherScanner.close();

        System.out.println(school);
    }
}