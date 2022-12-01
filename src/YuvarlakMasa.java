public class YuvarlakMasa extends Mobilya implements Daire{

    private double yaricap;
    public YuvarlakMasa() {
    }
    public YuvarlakMasa(String aciklama,double yaricap, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        setYaricap(yaricap);
    }
    @Override
    public void setYaricap(double yaricap) {
       if(yaricap>0) this.yaricap=yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (getKapaliMi()) {
            return 2 * Math.PI * yaricap * yaricap + 2 * Math.PI * yaricap * getYukseklik();
        }else{
            return Math.PI*yaricap*yaricap;
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString()+"[yaricap : "+getYaricap()+"X"+ " Yukseklik "+getYukseklik()+" ]";
    }
}
