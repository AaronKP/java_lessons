public class ConverterClass implements ConverterInterface{

	private static int i =5;
	private static int j=7;
	private int x=6;
	private int y=8;
	private static final int VAR2=10;
	private static final String VAR3="10";
	private static final int VAR1=0;
	private int VAR4;
	private int VAR5;
	private static int VAR6;
	private static int VAR7;

	static{
		VAR7=11;
	}

	{
		VAR4=15;
		i++;
		j++;
		x++;
		y++;
		VAR4++;
		VAR5++;
		VAR6++;
		VAR7++;
	}

	public ConverterClass(){
		VAR5 =13;
		VAR6=9;
	}

	public ConverterClass(int i, int j){

		System.out.println("Result for 2 args Constructor: "+((this.i+this.j-this.VAR6+4.0)+this.VAR7));
	}

	public ConverterClass(int a, int b, int c){
		this(a,b);
		double result =(a-b+this.VAR6+c)-this.VAR7;
		System.out.println("Result for 3 args Constructor:"+(result));
	}



	@Override
	public void converter(String input) throws NumberFormatException{
		try{

			int nr = Integer.parseInt(input);
			System.out.println("Converted String : "+ nr);

		}catch (NumberFormatException e){
			System.out.println("Error: "+e);
		}
	}

	public void doIt(){
		int a =2;
		System.out.println("Overloaded Method 3: "+this.doIt(this.x,this.y,a));

	}

	public int doIt(int i, int j, int x){
		int a =4;
		int b =1;

		System.out.println("Overloaded Method 2: "+doIt(i,j,a,b));

		return (i + j - x) / a * VAR2;

	}

	public static int doIt(int i, int j, int x, int y){

		int a=3;
		return  (i + j * x) / a * VAR2;
	}

	public static void main(String[] args) {
		ConverterClass cc = new ConverterClass();
		cc.doIt();

		ConverterClass obj = new ConverterClass();
		obj.converter(VAR3);

		ConverterClass obj3 = new ConverterClass(j, VAR6,VAR7);


	}
}