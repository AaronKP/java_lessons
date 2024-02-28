public class Student {//student class for creating student objects with relevant properties.
    
    //properties 
    private String name;
    private String surname;
    private String grade;
    private char block;
    private String classTeacher;
    private String peTeacher;

    //student constructor to set properties
    public Student(String name,String surname, String grade, char block, String classTeacher, String peTeacher) {
        this.name = name;
        this.surname=surname;
        this.grade = grade;
        this.block = block;
        this.classTeacher = classTeacher;
        this.peTeacher = peTeacher;
    }

    // accessor methods to return fields 
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public char getBlock() {
        return block;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public String getPeTeacher() {
        return peTeacher;
    }

    public String getSurname() {
        return surname;
    }
    
    
   
}
