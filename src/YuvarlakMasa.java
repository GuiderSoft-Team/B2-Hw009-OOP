public class YuvarlakMasa extends Mobilya implements Daire {

    double yaricap;

    public YuvarlakMasa() {

    }

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMİ, double yaricap) {
        super(aciklama, yukseklik, kapaliMİ);
        this.yaricap = yaricap;
    }

    public YuvarlakMasa(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {
        return getYaricap();
    }

    @Override
    public double alanHesapla() {

        return Math.PI*Math.pow(yaricap,2);
    }

    @Override
    public double hacimHesapla() {

        return Math.PI*Math.pow(yaricap,2)*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%5.2f %5.2f ", yaricap * getYukseklik());
    }
}