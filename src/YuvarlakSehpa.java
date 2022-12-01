public class YuvarlakSehpa extends Mobilya implements Daire{
    private double yaricap;
    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(double yaricap) {
        this.yaricap = yaricap;
    }

    public YuvarlakSehpa(String aciklama, double yukseklik, double yaricap,boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
        this.yaricap = yaricap;
    }

    @Override
    public void setYaricap(double yaricap) {

    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if(!super.isKapaliMi()){
            return Math.PI*getYaricap()*getYaricap();
        }else{
            return 2*Math.PI*getYaricap()*getYaricap()+2*Math.PI*getYaricap()*getYukseklik();
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*getYaricap()*getYaricap()*getYukseklik();
    }

    @Override
    public String toString() {
        return String.format("%s [%f x %f]",getAciklama(),getYaricap(),getYukseklik());
    }
}
