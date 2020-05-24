package emprunt;

public class Emprunt {
private int DateDebut;
private int DateFin;
public int getDateDebut() {
	return DateDebut;
}
public void setDateDebut(int dateDebut) {
	DateDebut = dateDebut;
}
public int getDateFin() {
	return DateFin;
}
public void setDateFin(int dateFin) {
	DateFin = dateFin;
}
protected Emprunt(int dateDebut, int dateFin) {
	super();
	DateDebut = dateDebut;
	DateFin = dateFin;
}

}
