public class Programmer extends Karyawan{
	public void setGaji(int gaji){

		if(gaji<=90){
			System.out.println("Programmer mendapatkan gaji sebesar = " +gaji);
		}
		else 
		{
			System.out.println("Gaji Anda melampaui batas");
		}
	}
}