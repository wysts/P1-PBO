package bangunruang;

public class Bola extends BangunRuang {
	private float r, phi;

  	public Bola(float _r) {
  	  this.r = _r;
  	  this.phi = 3.14f;
    
  	}

  	public void hitungLuas() {
	  this.luas = 4 * phi * r * r;
    
  	}

  	public void hitungKeliling() {
  	  this.keliling = 4/3 * phi * r * r;
    
  	}

  	public void hitungVolume() {
  	  this.volume = 4/3 * phi * r * r * r;
    
  	}
  
}
