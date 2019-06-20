package day41;

public class TeacherAction {

	public static void main(String[] args) {
		
		
		Teacher akbar = new Teacher();
		//fields are private we cannot access
		
		
		//System.out.println(akbar.name);
		//System.out.println(akbar.speciality);
		
		
		
		akbar.setName("Akbar");
		akbar.setSpeciality("magic");
		
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpeciality());
		
		
		akbar.setName("MagicMan Spartan");
		akbar.speciality ("Relase magic horse");
		
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpeciality());
		
	}

}
