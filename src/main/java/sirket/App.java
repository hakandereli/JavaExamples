package sirket;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class App {
    public static void main(String[] args) {

        Calisan isci = new Isci(200,700);
        System.out.println("Normal Prim Alan İşçi Maaşı :"+ isci.maasHesapla());
        System.out.println("----------------------");

        Calisan primAlmayanIsci = new Isci(200);
        System.out.println("Prim Alamayan İşçi Maaşı :"+ primAlmayanIsci.maasHesapla());
        System.out.println("----------------------");


        Calisan fazlaPrimAlmayaCalisanIsci = new Isci(200,5000);
        System.out.println("Fazla Prim İsteyen İşçi Maaşı :"+ fazlaPrimAlmayaCalisanIsci.maasHesapla());
        System.out.println("----------------------");


        Calisan yonetici = new Yonetici();
        System.out.println("Yonetici Maaşı :"+yonetici.maasHesapla());
        System.out.println("----------------------");


        Calisan patron = new Patron();
        System.out.println("Patron Maaşı :"+patron.maasHesapla());
        System.out.println("----------------------");

    }
}
