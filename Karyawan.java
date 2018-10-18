public class Karyawan{
	String nama;
	String alamat;
	private int gaji;

	public void setGaji(int pembayaran){
		gaji=pembayaran;
	}

	public void setNama(String nm){
		System.out.println("Nama = "+nama);
	}

	public void setAlamat(String almt){
		System.out.println("Alamat = "+alamat);
	}

	public int getGaji(){
		return this.gaji;
	}

	
}