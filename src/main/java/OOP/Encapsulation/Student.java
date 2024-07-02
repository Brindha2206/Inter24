package OOP.Encapsulation;

 class Encap {
    public String Student;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String Department;
    public  int Roll_no;
}

public class Student {
    public static void main(String[] args) {
        Encap obj = new Encap();
        obj.setRoll_no(58);
        obj.setStudent("Brindha");
        obj.setDepartment("CSE");

        System.out.println(obj.getRoll_no()+" "+obj.getStudent()+" "+obj.getDepartment());
    }
}
