public class Designer extends Karyawan{
	public void setGaji(int gaji){

		if(gaji<=70){
			System.out.println("Designer mendapatkan gaji sebesar = " +gaji);
		}
		else
		{
			System.out.println("Gaji Anda melampaui batas");
		}
	}
}