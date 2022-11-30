public class YuvarlakMasa extends Mobilya implements Daire{

    private double yaricap;

    public YuvarlakMasa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) throws LengthException {
        super(aciklama, yukseklik, kapaliMi);
        setYaricap(yaricap);
    }

    public YuvarlakMasa() {
    }

    @Override
    public void setYaricap(double yaricap) throws LengthException {
        if (yaricap<=0) throw new LengthException("Yaricap pozitif olmali!");
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
        }else {
            return 2*Math.PI*yaricap*yaricap + 2*Math.PI*yaricap*getYukseklik();
        }
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*yaricap*yaricap*getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString() + "[" + yaricap + " x " + getYukseklik() + "]";
    }
}
