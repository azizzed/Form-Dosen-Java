public class Dosen {
	private String KodeDosen;
	private String[] nimMhs = new String[5];
	private int JumlahMhs;
	
	public void setKodeDosen(String kodeDosen) {
		this.KodeDosen = KodeDosen;
	}
	public void setNimMahasiswa(String nimMhs) {
		if (JumlahMhs<this.nimMhs.length) {
			this.nimMhs[JumlahMhs] = nimMhs;
		JumlahMhs++;
		}
	}
	public String getKodeDosen() {
		return this.KodeDosen;
	}
	public int getJumlahMhs() {
		return this.JumlahMhs;
	}
	public String getNimMhs(int indeks) {
		return (nimMhs[indeks]);
	}
}