import Builder.Student;
//import Builder.StudentBuilder;

public class Main {
    public static void main(String[] args) {

//       // StudentBuilder studentBuilder = new StudentBuilder();
//        StudentBuilder studentBuilder = Student.builder();
//        studentBuilder.setAge(23);
//        studentBuilder.setName("Amrish");
//
//        // Student student = new Student(studentBuilder);
//        Student student = studentBuilder.build();


        Student student = Student
                .builder()
                .setAge(22)
                .setName("Rish")
                .setPsp(22.0)
                .build();


        Student.StudentBuilder builder = new Student.StudentBuilder();

        System.out.println("DEBBUG...");
    }
}