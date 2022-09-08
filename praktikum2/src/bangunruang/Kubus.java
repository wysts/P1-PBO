package bangunruang;

public class Kubus extends BangunRuang {
	private float s;

	public Kubus(float _s) {
		this.s = _s;
    
	}

	public void hitungLuas() {
		this.luas = 6 * (s * s);
  
	}

	public void hitungKeliling() {
		this.keliling = s * 12;
  
	}

	public void hitungVolume() {
		this.volume = s * s * s;
  
	}

}