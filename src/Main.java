public class Main {
    public static void main(String[] args) {
        System.out.println(suma(1,3,5));
        Coche miCoche = new Coche();
        System.out.println(miCoche);
        miCoche.aumentarPuertas();
        System.out.println(miCoche);
    }
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
