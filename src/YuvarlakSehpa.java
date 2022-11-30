public class YuvarlakSehpa extends Mobilya implements Daire{

    private double yaricap;

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double h, boolean kapaliMi, double yaricap) {
        super(aciklama, h, kapaliMi);
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
        if (!isKapaliMi()){
            return Math.PI*yaricap*yaricap;
        }else{
            return 2 * Math.PI * yaricap * yaricap + 2 * Math.PI * yaricap * getH();
        }
    }

    @Override
    public double hacimHesapla() {
       return  Math.PI * yaricap * yaricap  * getH();
    }
    @Override
    public String toString() {
        return super.toString() + "[" + yaricap + "x" + getH() + "]";
    }
}
