package Homework9;

public class Mobilya {
    private String aciklama;
    private double yukseklik;
    private boolean kapalimi;

    public Mobilya() {
    }

    public Mobilya(String aciklama, double yukseklik, boolean kapalimi) {
        this.aciklama = aciklama;
        this.yukseklik = yukseklik;
        this.kapalimi = kapalimi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        if (yukseklik<=0){
            System.out.println("Yükseklik sıfırdan büyük olmalıdır!");
        }else{
        }
        this.yukseklik = yukseklik;
    }

    public boolean isKapalimi() {
        return kapalimi;
    }

    public void setKapalimi(boolean kapalimi) {
        this.kapalimi = kapalimi;
    }

    @Override
    public String toString() {
        return "Mobilya{" +
                "aciklama='" + aciklama + '\'' +
                ", yukseklik=" + yukseklik +
                ", kapalimi=" + kapalimi +
                '}';
    }
}
