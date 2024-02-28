import java.util.Random;// import to generate a random integer that will be used as a means to return an element in teacher array

public class Teacher {
    
        //class teacher arrays
        private static String [] highSchoolTeachers = {"Mr Goku"," Mr Naruto","Mr Sheldon Cooper","Mr Tanjiro","Mr Patrick star"};
        private static String []primarySchoolTeachers = {"Mr Piccolo","Ms Hinata","Ms Nezuko","Ms Misty"," Mr Levi"," Ms Chi-Chi","Mr Frieza"};
        //PE teachers 
        private static String juniorPrimaryPEteacher = "Mrs Joy";
        private static String seniorPrimaryPEteacher = "Ms Maggie";
        private static String juniorHighPEteacher = " Mr Saitama";
        private static String seniorHighPEteahcer = "Mr Broly";
        
        private static Random rndNr = new Random();//random object creation
     

       public static String getRandomHSTeacher(){ 
          int randomIndex =  rndNr.nextInt(highSchoolTeachers.length);//generates a random integer between 0 (inclusive) and the length of the array (exclusive)
          return highSchoolTeachers[randomIndex];//return teacher at random index
       }
    
       public static String getRandomPSTeacher(){
           int randomIndex =  rndNr.nextInt(primarySchoolTeachers.length);
          return primarySchoolTeachers[randomIndex];
       }
       
       public static String getJpPEteacher(){
           return juniorPrimaryPEteacher;//return PE teacher
       }
       
        public static String getSpPEteacher(){
           return seniorPrimaryPEteacher;
       }
        
        public static String getJhPEteacher(){
           return juniorHighPEteacher;
       }
        
        public static String getShPEteacher(){
           return seniorHighPEteahcer;
       }
    
}
