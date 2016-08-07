
public class Osoba {
	private String imie;
	private int wiek;

	public Osoba(String imie, int wiek) {
		this.imie = imie;
		this.wiek = wiek;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getWiek() {
		return wiek;
	}

	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Osoba other = (Osoba) obj;
		if (imie == null) {
			if (other.imie != null)
				return false;
		} else if (!imie.equals(other.imie))
			return false;
		if (wiek != other.wiek)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Osoba [imie=" + imie + ", wiek=" + wiek + "]";
	}

}
