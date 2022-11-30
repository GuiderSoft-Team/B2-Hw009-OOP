public class YuvarlakMasa extends  Mobilya implements Daire{

    private double yaricap;

    public YuvarlakMasa(String aciklama, double yukseklik, double yaricap, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    public YuvarlakMasa() {
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if (isKapaliMi()){
            return  ((2 *Math.PI *yaricap *yaricap) + (2 *Math.PI *yaricap *getYukseklik()));

        }else {
            return Math.PI*yaricap*yaricap;
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [ %5.2f x %5.2f ]",super.toString(),yaricap,getYukseklik());
    }
}
