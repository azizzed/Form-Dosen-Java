package contoh;
public class main {
	public static void main(String args[]) {
		//membentuk objek mhs 1
		Mahasiswa m1 = new Mahasiswa();
		m1.setNim("311410058");
		m1.setNama("aziz zed");
		
		//membentuk objek mhs 2
		Mahasiswa m2 = new Mahasiswa();
		m2.setNim("311410838");
		m2.setNama("Ading Bagus Saputra");
		
		//membentuk objek Dosen
		Dosen d = new Dosen();
		d.setKodeDosen("RBD");
		
		//hubungkan antara dosen dan mahasiswa
		d.setNimMahasiswa(m1.getNim());
		d.setNimMahasiswa(m2.getNim());
	
		//menampilkan data dosen "d" dan mahasiswa yang di ajar
		System.out.println("Kode Dosen:"+d.getKodeDosen());
		System.out.println("Mengajar Mahasiswa");
		
		//ambil jumlah mahasiswa yang di ajar dosen d
		int	jum = d.getJumlahMhs();
		
		//ambil nim yang diajar oleh dosen d dengan perulangan
		for (int i=0; i<jum; i++) {
			System.out.println("  -"+d.getNimMhs(i));
		}
	}
}