public class OperacionesMatematicas {

    public static void main(String[] args) {
        int numeroPrimo = 17;
        double numeroRaiz = 25;
        
        System.out.println("¿Es " + numeroPrimo + " primo?: " + verificarPrimo(numeroPrimo));
        System.out.println("La raíz de " + numeroRaiz + " es: " + calcularRaiz(numeroRaiz));
    }
    public static boolean verificarPrimo(int n) {
        if (n <= 1) return false; 
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static double calcularRaiz(double n) {
        if (n < 0) return Double.NaN; 
        if (n == 0) return 0;
        
        double x = n;
        double error = 0.000001; 
        
        while (Math.abs(x * x - n) > error) {
            x = (x + n / x) / 2.0;
        }

        return x;
    }
}
