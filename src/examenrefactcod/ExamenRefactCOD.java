package examenrefactcod;

/**
 *
 * @author agomezcastro
 */
public class ExamenRefactCOD {

    /**
     * @param args the command line arguments
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.

    public static boolean p = false;

    public static void main(String[] args) {
        {
            int digitos = 3;
            int numdig = 0;
            if (digitos <= 0) {
                System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
            }
            for (int i = 1; i <= 99999; i++) {
                int auxil = i;

                int cont = 0;

                while (auxil != 0) {
                    auxil = auxil / 10;
                    cont++;
                }
                numdig = cont;

                if (numdig == digitos) {
                    if (i < 4) {
                        p = true;
                    } else {
                        if (i % 2 == 0) {
                            p = false;
                        } else {
                            int contadores = 0;
                            int i1 = 1;
                            int k = (i - 1) / 2;
                            if (k % 2 == 0) {
                                k--;
                            }

                            while (i1 <= k) {
                                if (i % i1 == 0) {
                                    contadores++;
                                }
                                i1 += 2;
                                if (contadores == 2) {
                                    i1 = k + 1;
                                }
                            }

                            if (contadores == 1) {
                                p = true;
                            }
                        }
                    }

                    if (p == true) {
                        System.out.println(i);
                    }
                }
            }
        }
    }

}
