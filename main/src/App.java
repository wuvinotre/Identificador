import java.util.Scanner;

public class App {

    static final int QUANTIDADE_KOMBI = 5;
    static final int QUANTIDADE_MAXIMA = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        // String s = "CFGGCFCFCGGFGFF";

        // String s = "CFGGFCGFCCCFGGCFCFFFGGCCC";

        // String s = "FFFCGCGCGCGFCCGGFCGFCFGCFGCFGC";

        int garrafasC = 0;
        int garrafasF = 0;
        int garrafasG = 0;
        int caixasCarregadas = 0;

        char[] kombi = new char[QUANTIDADE_KOMBI];

        for (int i = 0; i < s.length(); i++) {
            if (caixasCarregadas == QUANTIDADE_KOMBI) {
                break;
            }

            char refrigerante = s.charAt(i);
            if ('C' == refrigerante) {
                garrafasC++;
                if (garrafasC % QUANTIDADE_MAXIMA == 0) {
                    kombi[caixasCarregadas] = 'C';
                    caixasCarregadas++;
                }
            }

            if ('F' == refrigerante) {
                garrafasF++;
                if (garrafasF % QUANTIDADE_MAXIMA == 0) {
                    kombi[caixasCarregadas] = 'F';
                    caixasCarregadas++;
                }
            }

            if ('G' == refrigerante) {
                garrafasG++;
                if (garrafasG % QUANTIDADE_MAXIMA == 0) {
                    kombi[caixasCarregadas] = 'G';
                    caixasCarregadas++;
                }
            }
        }
        for (int i = 0; i < kombi.length; i++) {
            System.out.println("Na kombi contém a caixa do refrigerante " + kombi[i]);
        }
    }
}