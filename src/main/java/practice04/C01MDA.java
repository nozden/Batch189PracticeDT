package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C01MDA {

    public static void main(String[] args) {

        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int [][] arr =new int[3][2];
        System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]

        /*
        arr[0][0]
        arr[0][1]
        arr[1][0]
        arr[1][1]
        arr[2][0]
        arr[2][1]
         */

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length ; i++) {//outer array elemanlarını alacak

            for (int j = 0; j <arr[i].length  ; j++) {//inner array elemanlarını alacak

                System.out.println("Lutfen eklemek istediginiz tam sayıyı giriniz");
                arr[i][j]=scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));//[[1, 2], [3, 4], [5, 6]]

        int [] brr=new int[arr.length];//[3, 7, 11]

        for (int i = 0; i < arr.length; i++) {//dıs array elemanlarını alacak
            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {//elimdei inner arrayin elemanlarını alacak

                toplam=toplam+arr[i][j];
            }

            brr[i]=toplam;
        }

        System.out.println(Arrays.toString(brr));





    }
}
