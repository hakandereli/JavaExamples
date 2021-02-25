package sirket;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Patron extends Calisan{
    @Override
    public int maasHesapla() {
        return (super.maasHesapla()*3);
    }
}
