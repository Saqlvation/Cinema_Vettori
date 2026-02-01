
public class Cinema {

    private Sala sale[];
    private static final int MAX_SALE = 10;

    public Cinema() {
        sale = new Sala[MAX_SALE];
    }

    public void aggiungiSala(Sala sala) {
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] == null) {
                sale[i] = new Sala(sala);
                return;
            }
        }
    }

    public void aggiungiSala(int postiTotali) {
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] == null) {
                sale[i] = new Sala(postiTotali);
                return;
            }
        }
    }

    public int postiLiberiTot() {
        int cont = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] != null) {
                cont += sale[i].postiLiberi();
            }
        }
        return cont;
    }

    public int salePiene() {
        int cont = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] != null && sale[i].isPiena()) {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) {
        Cinema x = new Cinema();
        Sala s1 = new Sala(100);
        Sala s2 = new Sala(150);
        s1.occupaPosti(100);
        s2.occupaPosti(50);
        x.aggiungiSala(s1);
        x.aggiungiSala(s2);

        System.out.println("Posti liberi totali: " + x.postiLiberiTot());
        System.out.println("Sale piene: " + x.salePiene());
        System.out.println();

        x.aggiungiSala(100);
        System.out.println("Posti liberi totali: " + x.postiLiberiTot());
        System.out.println("Sale piene: " + x.salePiene());

    }

}
