package practice04;

public class C07Varargs {

    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
        int matematik =4;
        int geometri=2;
        int fizik=3;
        int kimya=3;
        int biyoloji=3;
        int edebiyat=2;
        int tarih=2;
        int cografya=2;

        dersSecimi(edebiyat,tarih,cografya,kimya,geometri);


    }

    private static void dersSecimi(int... dersler) {
        int sum=0;//ders saatleri toplamını koyacagımız bir kap
        for (int each: dersler) {
            sum+=each;//sum=sum+each;
        }
        if (sum>12){
            System.out.println("Limiti astiniz");
        }else System.out.println("Islem basariyla tamamlandi");

    }


}
