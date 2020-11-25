package day24;

public class DisplayInfo {

	public static void main(String[] args) {
		GetInfo info = new GetInfo();
		info.setName("hari");
		info.setNationality("bengalideshi");
		info.setRoll("1");

		GetInfo info1 = new GetInfo();

		info1.setName("geeta");
		info1.setNationality("pokhara");
		info1.setRoll("2");
		System.out.println(info.getName());

		System.out.println(info.getNationality());
		System.out.println(info.getRoll());

		/*
		 * info.setName("hari"); info.setNationality("nepali"); info.setRoll("1");
		 */

		System.out.println(info1.getName());

		System.out.println(info1.getNationality());
		System.out.println(info1.getRoll());

	}

}
