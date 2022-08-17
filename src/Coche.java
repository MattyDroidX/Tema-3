public class Coche {
    private int nroDePuertas = 4;

    public void aumentarPuertas() {
        this.nroDePuertas++;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "nroDePuertas=" + nroDePuertas +
                '}';
    }
}
