public class Mobilya {

    private String metalDolap;

    private double yukseklik;

    private boolean kapaliMi;

    private double yariCap;

    public Mobilya(String metalDolap, double yukseklik, boolean kapaliMi, double yariCap) {
        this.metalDolap = metalDolap;
        this.yukseklik = yukseklik;
        this.kapaliMi = kapaliMi;
        this.yariCap = yariCap;
    }



    public Mobilya() {
    }

    public Mobilya(String metalDolap, double yukseklik, boolean kapaliMi) {
    }

    public String getMetalDolap() {
        return metalDolap;
    }

    public void setMetalDolap(String metalDolap) {
        this.metalDolap = metalDolap;
    }

    public double getYukseklik() {
        return yukseklik;
    }



    public void setYukseklik(double yukseklik) {
        if (yukseklik > 0) {
            this.yukseklik = yukseklik;
        } else
            this.yukseklik = 0;
    }

    public double getYariCap() {
        return yariCap;
    }

    public void setYariCap(double yariCap) {
        this.yariCap = yariCap;
    }

    @Override
        public String toString() {
            return metalDolap;
        }


    }
