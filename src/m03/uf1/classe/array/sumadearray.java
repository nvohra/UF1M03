/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.classe.array;

/**
 *
 * @author USER
 */
public class sumadearray {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = {1, 3, 4, 1, 4};
        int[] arrayC = new int[5];
        
        arrayA[0] = 2;
        arrayA[1] = 4;
        arrayA[2] = 3;
        arrayA[3] = 3;
        arrayA[4] = -1;
        
        int n;
        
        n = arrayA[3] + arrayB[0];
        for (int i = 0; i < 5; i++) {
            arrayC[i] = arrayA[i]+arrayB[i];
            System.out.println(arrayC[i]);
        }
        
        System.out.println(arrayA[3]);
    }
}
