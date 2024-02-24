public class Printer {

    public static void printGreeting(String name, String surname){
        System.out.println("Hello, "+name+" "+surname+".");
    }
    
    //prints name, surname, age, miles
    public static void print(String name, String surname, String dob, String miles ){
        
        printGreeting(name, surname);
        System.out.println("You are "+AgeCalculator.calculate(dob)+" years old");
        System.out.println("You are "+AgeCalculator.calcAgeSeconds(AgeCalculator.calculate(dob))+" seconds old");
        System.out.println("You are "+AgeCalculator.calcAgeMS(AgeCalculator.calculate(dob))+" milliseconds old");
        System.out.println("Your Hexadecimal age: "+AgeCalculator.ageHex(AgeCalculator.calculate(dob)));
        System.out.println("Your age in Binary: "+AgeCalculator.ageBinary(AgeCalculator.calculate(dob)));
        System.out.println("The distance from your favourite shop is "+miles+" miles");
         System.out.println("The distance from your favourite shop is "+(Double.parseDouble(miles)*1.609344*1000)+" m");
        
    }
    
}