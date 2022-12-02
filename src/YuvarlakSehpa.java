public class YuvarlakSehpa extends Mobilya implements Daire{


    public YuvarlakSehpa() {
    }


    public YuvarlakSehpa(String aciklama, double yukseklik, boolean kapaliMi) {
        super(aciklama, yukseklik, kapaliMi);
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
        return 0;
    }

    @Override
    public double hacimHesapla() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[%d*%d]",getYaricap(),getYukseklik());
    }
}
