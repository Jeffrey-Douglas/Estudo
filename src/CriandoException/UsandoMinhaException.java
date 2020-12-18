package CriandoException;

public class UsandoMinhaException {

    public static void main(String[] args) {
        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
        int[] denom = {2, 0, 4, 8, 0, 2, 3};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], denom[i]);
                }
                System.out.println(numeros[i] + " / " + denom[i] + " = " + (numeros[i]/denom[i]));

            } catch (ArrayIndexOutOfBoundsException | ArithmeticException | DivisaoNaoExata e) {
                System.out.println("Aconetecu um erro ");
                e.printStackTrace();

            }
        }
    }
}
