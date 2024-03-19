public class CleanCode {
	public static void main(String[] args){
        //shoe size array assignment 
    	int [] shoesize  =  {11,2,33,4,5,6,7,8,9,10,2,4,6,8,20,1,3,5,10,99,17,2,3,21,5,6,7,8,9,50,13,2,4,32,7,8,4,2,6,8,2,5,43,9,3,5,88,54,4,10};

        System.out.println("Shoe Sizes:");
        for(int i =0; i<shoesize.length;i++){
            System.out.print(shoesize[i] +" ");//print shoe sizes
        }

        System.out.println("\n\nEven shoe sizes:");
        for(int j=0;j<shoesize.length;j++){
            System.out.print(shoesize[j]%2==0? shoesize[j]+" ":"");// ternary operator. If %2 = 0 then number is even
        }

        System.out.println("\n\nShoe sizes %11 =0 :");//print shoe sizes whose modulus by 11 has no remainder
        for(int k=0;k<shoesize.length;k++){
            System.out.print(shoesize[k]%11==0? shoesize[k] +" ":"");
        }

        System.out.println("\n\n(Shoe sizes+1) %2 = 0 :");// print the incremented shoe size if original size+ 1 is an even number
        for(int s=0;s<shoesize.length;s++){
            System.out.print((shoesize[s]+1)%2==0? (shoesize[s]+1) +" ":"");
        }

        System.out.println("\n\n(Shoe sizes+1) %11 = 0 :");//print the incremented shoe size if original size+1 % 11 has no remainder
        for(int n=0;n<shoesize.length;n++){
            System.out.print((shoesize[n]+1)%11==0? (shoesize[n]+1) +" ":"");
        }
	}		
}