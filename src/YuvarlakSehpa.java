public class YuvarlakSehpa extends Mobilya implements Daire {

    public YuvarlakSehpa() {
    }

    public YuvarlakSehpa(String aciklama, double yaricap, double yukseklik, boolean kapaliMi) {
        super.aciklama = aciklama;
        super.yaricap = yaricap;
        setYukseklik(yukseklik);
        super.kapaliMi = kapaliMi;
    }

    @Override
    public void setYaricap(double yaricap) {
        super.yaricap = yaricap;
    }

    @Override
    public double getYaricap() {
        return yaricap;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi) {
            return Math.PI * Math.pow(getYaricap(), 2) + 2 * Math.PI * getYaricap() * getYukseklik();
        } else {
            return Math.PI * Math.pow(getYaricap(), 2);
        }
    }

    @Override
    public double hacimHesapla() {

        return Math.PI * Math.pow(getYaricap(), 2) * getYukseklik();
    }

    @Override
    public String toString() {
        return super.toString() + " [ " + getYaricap() + " x " + getYukseklik() + " ]";
    }
}
