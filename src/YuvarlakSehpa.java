public class YuvarlakSehpa extends  Mobilya implements Daire {
    private double yaricap;

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double yukseklik, double yaricap, boolean kapaliMİ) {
        super(aciklama, yukseklik, kapaliMİ);
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
        return Math.PI * Math.pow(yaricap, 2);
    }

    @Override
    public double hacimHesapla() {
        return Math.PI * Math.pow(yaricap, 2)* getYukseklik();
    }

    @Override
    public String toString() {


        return String.format("%s %5.2f  %5.2f %b", super.getAciklama(), super.getYukseklik(), this.yaricap, false);

    }
}
