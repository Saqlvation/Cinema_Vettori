
public class Sala {

    private int postiTotali;
    private int postiOccupati;

    public Sala(int postiTotali) {
        this.postiTotali = postiTotali;
        this.postiOccupati = 0;
    }

    public Sala(Sala s) {
        this.postiTotali = s.getPostiTotali();
        this.postiOccupati = s.getPostiOccupati();
    }

    public int postiLiberi() {
        return postiTotali - postiOccupati;
    }

    public void occupaPosti(int n) {
        if (n > 0 && postiOccupati + n <= postiTotali) {
            postiOccupati += n;
        }
    }

    public void liberaPosti(int n) {
        if (n > 0 && n <= postiOccupati) {
            postiOccupati -= n;
        }
    }

    public boolean isPiena() {
        return postiOccupati == postiTotali;
    }

    public int getPostiOccupati() {
        return postiOccupati;
    }

    public int getPostiTotali() {
        return postiTotali;
    }

    @Override
    public String toString() {
        return "Sala: " + postiOccupati + "/" + postiTotali + " occupati";
    }
}
