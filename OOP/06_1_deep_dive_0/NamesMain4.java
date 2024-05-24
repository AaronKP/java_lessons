/**
 * A class that prints a custom greeting 
 * @version 4
 * @since 1
 * */
public class NamesMain4{
	public static void main(String[] args) {

		String hobby,nationality;
		int height;
		HobbyGetter hobbyGetter = new HobbyGetter();
		hobby=hobbyGetter.getHobby();

		NationalityGetter nationalityGetter = new NationalityGetter();
		nationality=nationalityGetter.getNationality();

		HeightGetter heightGetter = new HeightGetter();
		height = heightGetter.getHeight();

		System.out.println("Your height is "+height+"cm ");
		System.out.println("Your nationality is "+nationality);
		System.out.println("Your hobby is  "+hobby);

	}
}