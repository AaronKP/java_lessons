public class Printer {
    
    //print student details
    public static void printStudentDetails(Student student){
        System.out.println("*****STUDENT DETAILS*****");
        System.out.println("Student: "+ student.getName()+" "+student.getSurname());
        System.out.println("Grade: "+ student.getGrade());
        System.out.println("Block: "+ student.getBlock());
        System.out.println("Class Teacher: "+student.getClassTeacher());
        System.out.println("PE teacher: "+student.getPeTeacher());
        System.out.println("*************************");
        
    }
}
