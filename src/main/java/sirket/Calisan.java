package sirket;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public abstract class Calisan {
    private String ad;
    private int netAsgariucret = 3000;

    public int maasHesapla(){
        return netAsgariucret;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNetAsgariucret() {
        return netAsgariucret;
    }

    public void setNetAsgariucret(int netAsgariucret) {
        this.netAsgariucret = netAsgariucret;
    }
}
