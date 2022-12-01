public class YuvarlakMasa extends Mobilya implements Daire{

    public YuvarlakMasa() {
    }

    public YuvarlakMasa(String metalDolap, double yukseklik, boolean kapaliMi) {
        super(metalDolap, yukseklik, kapaliMi);
    }




    @Override
    public double getGenislik() {
        return 0;
    }

    @Override
    public void setDerinlik(double derinlik) {

    }

    @Override
    public double getDerinlik() {
        return 0;
    }

    @Override
    public double alanHesapla() {
        if (kapaliMi()){
            return Math.PI*getYariCap()*getYariCap();
        }else {
            return 2*Math.PI*getYariCap()*getYariCap()+2*Math.PI*getYariCap();
        }
    }

    @Override
    public boolean kapaliMi() {
        return false;
    }

    @Override
    public String getMetalDolap() {
        return super.getMetalDolap();
    }

    @Override
    public void setMetalDolap(String metalDolap) {
        super.setMetalDolap(metalDolap);
    }

    @Override
    public double getYukseklik() {
        return super.getYukseklik();
    }

    @Override
    public void setYukseklik(double yukseklik) {
        super.setYukseklik(yukseklik);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double hacimHesapla() {
        return Math.PI*getYariCap()*getYariCap();


    }
}
