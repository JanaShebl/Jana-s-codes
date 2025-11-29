/*
      ██╗ █████╗ ███╗   ██╗ █████╗
      ██║██╔══██╗████╗  ██║██╔══██╗
      ██║███████║██╔██╗ ██║███████║
 ██   ██║██╔══██║██║╚██╗██║██╔══██║
 ╚█████╔╝██║  ██║██║ ╚████║██║  ██║
  ╚════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝
*/

import java.lang.classfile.constantpool.StringEntry;
import java.math.BigInteger;
import java.util.*;


public class Sheet_4 {

    static class Person {
        protected String name;
        protected String address;
        protected String phoneNumber;
        protected String e_mail;

        public Person(String name, String address, String phoneNumber, String e_mail) {
            this.address = address;
            this.e_mail = e_mail;
            this.phoneNumber = phoneNumber;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person's name : " + name;
        }
    }

    static class Student extends Person {
        private int status;

        public static final int freshman = 1;
        public static final int sophomore = 2;
        public static final int junior = 3;
        public static final int senior = 4;

        public Student(String name, String address, String phoneNumber, String e_mail, int status) {
            this.status = status;
            super(name, address, phoneNumber, e_mail);
        }

        @Override
        public String toString() {
            return "Student's name : " + name;
        }
    }

    // =>

    static class MyDate {
        private int year;
        private int month;
        private int day;

        public MyDate() {
            Calendar calendar = Calendar.getInstance();
            this.year = calendar.get(Calendar.YEAR);
            this.month = calendar.get(Calendar.MONTH);
            this.day = calendar.get(Calendar.DAY_OF_MONTH);
        }

        public MyDate(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public int getDay() {
            return day;
        }

        @Override
        public String toString() {
            return day + "-" + month + "-" + year;
        }
    }

    // =>

    static class Employee extends Person {
        private String office;
        private double salary;
        private MyDate dataHired;

        public Employee(String name, String address, String phoneNumber, String e_mail, String office, double salary, MyDate dataHired) {
            this.office = office;
            this.salary = salary;
            this.dataHired = dataHired;
            super(name, address, phoneNumber, e_mail);
        }

        @Override
        public String toString() {
            return "Employee's name : " + name;
        }
    }

    static class Faculty extends Employee {
        protected int officeHours;
        protected String rank;

        public Faculty(String name, String address, String phoneNumber, String e_mail, String office, double salary, MyDate datahired, int officeHours,
                       String rank) {
            super(name, address, phoneNumber, e_mail, office, salary, datahired);
            this.officeHours = officeHours;
            this.rank = rank;
        }

        @Override
        public String toString() {
            return "Name of faculty class  : " + name;
        }
    }

    static class Staff extends Employee {
        String title;

        public Staff(String name, String address, String phoneNumber, String e_mail, String office, double salary, MyDate datahired, String title) {
            super(name, address, phoneNumber, e_mail, office, salary, datahired);
            this.title = title;
        }

        public String toString() {
            return "Name of staff class  : " + name;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.ENGLISH);

        Person person = new Person("Yahia", "maadi", "01111111111", "yahia@gamil.com");
        System.out.println(person);

        Student student = new Student("Mary", "maadi", "01111111111", "mary@gamil.com", Student.senior);
        System.out.println(student);

        Employee employee = new Employee("Mourad", "maadi", "01111111111", "mourad@gamil.com", "School office", 1000000, new MyDate(2026, 5, 19));
        System.out.println(employee);

        Faculty faculty = new Faculty("Hassan", "maadi", "01111111111", "hassan@mail.com",
                "library Office", 1500.0, new MyDate(2020, 9, 1),
                5, "Professor");
        System.out.println(faculty);

        Staff staff = new Staff("Morgan", "maadi", "01111111111", "morgan@mail.com",
                "admin Office", 700.0, new MyDate(2022, 3, 5), "Administrator");
        System.out.println(staff);
    }
}
