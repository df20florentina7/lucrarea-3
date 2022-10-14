import java.util.Scanner;

public class Main {
    final static int COST_ORA = 40;
    final static int COST_MINUT_SUPLIMENTAR = 1;

    public static void main(String[] args) {
        int totalTimp = total();
        allInclusive(totalTimp);

    }

    private static int total() {
        int minCaiac, minCanoe, minScaunDePlaja, minUmbrela;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("numarul de minute in care a inchiriat CAIACUL este:");
        minCaiac = inputDevice.nextInt();
        System.out.println("numarul de minute in care a inchiriat CANOE este:");
        minCanoe = inputDevice.nextInt();
        System.out.println("numarul de minute in care a inchiriat SCAUNUL DE PLAJA este:");
        minScaunDePlaja = inputDevice.nextInt();
        System.out.println("numarul de minute in care a inchiriat UMBRELA este:");
        minUmbrela = inputDevice.nextInt();
        return minCaiac + minCanoe + minScaunDePlaja + minUmbrela;
    }

    private static void allInclusive(int total) {
        int ore = total / 60;
        int minute = total - ore * 60;
        int pret = ore * COST_ORA + minute * COST_MINUT_SUPLIMENTAR;
        System.out.println("ore: " + ore + " minute: " + minute + " pretul total: " + pret);
    }
}
