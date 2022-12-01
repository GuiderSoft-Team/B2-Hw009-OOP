public interface Dortgen {
    double getGenislik();

    void setGenislik(double genislik);

    void setDerinlik(double derinlik);
    double getDerinlik();
    double alanHesapla();    //: Eğer kapaliMi false ise (genislik x derinlik) değilse (6 x genislik x derinlik)
    double hacimHesapla();    //: genislik x derinlik x yukseklik


}
