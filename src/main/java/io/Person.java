package io;

import java.io.Serializable;

/**
 * @author HAKAN DERELİ
 * @since 5.xxx.x
 */
public class Person implements Serializable {
    private String ad;
    private String soyAd;
    private Long tcKimlikNo;

    public Person(String ad, String soyAd, Long tcKimlikNo) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public Long getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(Long tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", tcKimlikNo=" + tcKimlikNo +
                '}';
    }
}
