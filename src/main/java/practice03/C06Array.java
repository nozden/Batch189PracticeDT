package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Array {

    public static void main(String[] args) {

        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */

        int [] arr= new int[5];
        System.out.println(Arrays.toString(arr));

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i < arr.length  ; i++) {
            System.out.println("Lutfen diziye eklemek istediginiz sayıyı giriniz");
            int sayi= scan.nextInt();

            arr[i]=sayi;
        }

        System.out.println(Arrays.toString(arr));

        //ortalama = arrayin elemanlarını topla / array eleman sayısı

        double toplam = 0;//ortalama virgullu gelebilecegi icin toplamı double turunde olusturduk

        for (int each:arr) {

            toplam+=each;

        }
        System.out.println("toplam = " + toplam);
        double ortalama=toplam/ arr.length;
        System.out.println("ortalama = " + ortalama);
        

        //Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        for (int each  : arr ) {

            if (each>ortalama){
                System.out.print(each + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=arr[i]*-1;

        }
        System.out.println(Arrays.toString(arr));


    }
}
