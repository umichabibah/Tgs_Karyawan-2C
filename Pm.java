public class Pm extends Karyawan{
	public void setGaji(int gaji){

		if(gaji<=100){
			System.out.println("Project Manager mendapatkan gaji sebesar = " +gaji);
		}
		else
		{
			System.out.println("Gaji Anda melampaui batas");
		}
	}
}