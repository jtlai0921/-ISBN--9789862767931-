package lab.session2;

class StudentDAOFactory {
    public IStudentDAO createStudentDAO() {
        return new StudentDAOImpl();
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        StudentDAOFactory factory = new StudentDAOFactory();
        // studentDAO在建立物件實體上中間格了一層StudentDAOFactory
        // 用意在防止應用程式與DAO實作(StudentDAOImpl)過度緊密耦合
        IStudentDAO studentDAO = factory.createStudentDAO();
        // block of code
    }
}

