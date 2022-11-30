public class YuvarlakSehpa extends Mobilya implements Daire{
    private double yaricap;

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double yukseklik, boolean kapaliMi, double yaricap) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {
        if (yaricap<0)this.yaricap=0;
        else this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if (!isKapaliMi()){
            return Math.PI*yaricap*yaricap;
        }else {
            return 2*Math.PI*yaricap*yaricap+2*Math.PI*yaricap*getYukseklik();
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI* yaricap * yaricap *getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"[ yaricap : "+getYaricap()+"X"+" Yükseklik "+getYukseklik()+" ]";
    }
}
