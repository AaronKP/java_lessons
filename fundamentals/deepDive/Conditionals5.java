import java.util.Scanner;

public class Conditionals5 {

    private static Student student ;//object declaration as static so we use the same object.
    
    public static void main(String[] args) {
        
        boolean proceed =true;//loop control variable
        String userInput;//store scanner input for app continuation
        Scanner kb =new Scanner(System.in);
        
        while(proceed){//loop that coontrols whether the app runs multiple times
                  
            boolean isGradeValid =false;// valid grade loop sentinel/check
            boolean isNameSurnameValid=false;// valid name and surname sentinel check
            //prompts
            String name = Prompter.prompt("What is your name?");
            String surname= Prompter.prompt("What is your Surname?");

            nsChk: while(isNameSurnameValid==false){//loop for name and surname validation
                
                isNameSurnameValid=NameSurnameValidator.validateNameSurname(name, surname);//validate name and surname
                 if(isNameSurnameValid){
                    break nsChk;
                }else{
                    name = Prompter.prompt("What is your name?");//re-prompt if invalid
                    surname= Prompter.prompt("What is your Surname?");
                }
            }

            String grade = Prompter.prompt("What grade are you in?");//grade prompt

            gradeChk: while(isGradeValid==false){//grade validation loop
                isGradeValid=GradeValidator.validateGrade(grade);
                if(isGradeValid){
                    break gradeChk;
                }else{
                    grade = Prompter.prompt("What grade are you in?");
                }
            }

            //switch statement comparing user grade against grades 1-12
            switch(Integer.parseInt(grade)){
                case 1:
                	//create student object . Method call to get a random class teacher and to get the PE teacher for that grade
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getJpPEteacher());
                    Printer.printStudentDetails(student);//print details for that student
                    break;
                case 2:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getJpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 3:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getJpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 4:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getSpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 5:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getSpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 6:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getSpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 7:
                    student= new Student(name,surname,grade,'B',Teacher.getRandomPSTeacher(),Teacher.getSpPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 8:
                    student= new Student(name,surname,grade,'A',Teacher.getRandomHSTeacher(),Teacher.getJhPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 9:
                    student= new Student(name,surname,grade,'A',Teacher.getRandomHSTeacher(),Teacher.getJhPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 10:
                    student= new Student(name,surname,grade,'A',Teacher.getRandomHSTeacher(),Teacher.getJhPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 11:
                    student= new Student(name,surname,grade,'A',Teacher.getRandomHSTeacher(),Teacher.getShPEteacher());
                    Printer.printStudentDetails(student);
                    break;
                case 12:
                    student= new Student(name,surname,grade,'A',Teacher.getRandomHSTeacher(),Teacher.getShPEteacher());
                    Printer.printStudentDetails(student);
                    break;


            }
            //Prompt to continue the app
            System.out.println("End Application? Enter Y to continue or any other key to end");
            userInput=kb.nextLine();
            if(userInput.equalsIgnoreCase("Y")){
                proceed=true;//update sentinel based on response
            }else{
                proceed =false;
            }
        }
        
    }
    
}
