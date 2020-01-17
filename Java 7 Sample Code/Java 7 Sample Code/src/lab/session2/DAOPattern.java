package lab.session2;

class Student {
    private int id;
    private String name;
    private char sex;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
}

interface IStudentDAO {
    public boolean add(Student student);
    public boolean update(Student student);
    public boolean deleteById(int id);
    public Student getStudentById(int id);
    public Student[] queryStudents();
}

class StudentDAOImpl implements IStudentDAO {
    public boolean add(Student student) { 
        // block of code
        return true; 
    };
    public boolean update(Student student) { 
        // block of code
        return true; 
    };
    public boolean deleteById(int id) { 
        // block of code
        return true; 
    };
    public Student getStudentById(int id) {
        // block of code
        return null;
    }
    public Student[] queryStudents() {
        // block of code
        return null;
    }
    
}

public class DAOPattern {
    public static void main(String[] args) {
        IStudentDAO studentDAO = new StudentDAOImpl();
        // block of code
    }
}


