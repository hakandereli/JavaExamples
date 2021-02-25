package sirket;

import java.security.PublicKey;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Isci extends Calisan implements PrimAlir {
    public Isci(int agi, int primTutari) {
        this.agi = agi;
        this.primTutari = primTutari;
    }

    public Isci(int agi) {
        this.agi = agi;
    }

    private int agi;
    private int primTutari;

    @Override
    public int maasHesapla() {
        try {
            primEkle(this.primTutari);
        } catch (IsciPrimUstSinirException e) {
            System.out.println(e.getMessage());
        }
        return super.maasHesapla() + agi + this.primTutari;
    }

    public int primEkle(int primTutari) throws IsciPrimUstSinirException {
        if (primTutari >= getNetAsgariucret()) {
            throw new IsciPrimUstSinirException("İşçi Net Asgari ücretten fazla prim alamaz !");
        } else {
            this.primTutari = primTutari;
        }
        return this.primTutari;
    }

}
