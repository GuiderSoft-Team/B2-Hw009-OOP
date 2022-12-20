public class YuvarlakMasa extends Mobilya implements Daire{
    private  double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        double alan = 0.0;
        if (isKapaliMi()) {
            alan=2*Math.PI*Math.pow(yaricap,2)+2*Math.PI*yaricap*getYukseklik();

        } else {
             alan=Math.PI * Math.pow(yaricap, 2);
        }
        return alan;
    }
    @Override
    public double hacimHesapla() {
        return Math.PI*Math.pow(yaricap,2)*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [%5.2f x %5.2f]",super.toString(),yaricap,getYukseklik());
    }
}
