public class YuvarlakMasa extends Mobilya implements Daire {

   private double yaricap;

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String aciklama, double yaricap,double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
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
        if (!isKapaliMi()) {
            return Math.PI*yaricap*yaricap;
        }else {
            return (2*Math.PI*yaricap*yaricap) + (2*Math.PI*yaricap*getYukseklik());
        }    }

    @Override
    public double hacimHesapla() {
      return Math.PI*yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString() + "["+yaricap+"x"+getYukseklik()+"]";
    }
}
