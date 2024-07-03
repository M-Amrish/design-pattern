package Builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private  String batch;

    public static class StudentBuilder {

        private String name;
        private int age;
        private double psp;
        private  String batch;


        public String getName() {
            return name;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;

        }

        public Student build() {
            return new Student(this);
        }
    }

    private Student(StudentBuilder studentBuilder){

        if(studentBuilder.getAge() > 25){
            throw new RuntimeException();
        }
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.batch = studentBuilder.getBatch();
        this.psp = studentBuilder.getPsp();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public  static StudentBuilder builder(){
        return new StudentBuilder();
    }

}
