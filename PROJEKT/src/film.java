

public class film {
	public String tytu�;
	private String autor;
	public int cena;
	private String gatunek;                                 //Zmienne
	private int ilosc;
	public int wiek;
	public int balance;

	film() {
		this.tytu� = "";
		this.autor = "";
		this.cena = 0;                                     //Konstruktor bezparametrowy
		this.gatunek = "";
		this.ilosc = 0;
}

	film(String tytu�, String autor, int cena, String gatunek, int ilosc) {              
		this.tytu� = tytu�;
		this.autor = autor;
		this.cena = cena;                                  //Konstruktor z parametrami
		this.gatunek = gatunek;
		this.ilosc = ilosc;
	}

	public int getwiek(){                                  
		return wiek;                                               
	}
	public void setwiek(int wiek){
		this.wiek=wiek;
	}
   public String getTytu�() {
		return tytu�;
	}

	public void setTytu�(String tytu�) {
		this.tytu� = tytu�;
	}
                                                                            //Metody i klasy ustawiajace zmienne
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) { 
		this.autor = autor;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String getGatunek() {
		return gatunek;
	}

	public void setGatunek(String gatunek) {
		this.gatunek = gatunek;
	}

	public String toString() {
		return "Film " + "'" + tytu� + "', autora: " + autor
			 + ", cena: " + cena + ", gatunek: '" + gatunek
			 + "', dost�pna ilo��: " + ilosc;
	}

	public int getIlosc() {
		return ilosc;
	}

	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}

	
	
}