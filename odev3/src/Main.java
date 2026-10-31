void main() {
    int ortalama = 49;
    String sonuc;
    if (ortalama >= 85) {
        sonuc = "takdir aldın";
    } else if (ortalama >= 75) {
        sonuc = "teşekkür aldın";
    } else if (ortalama >= 50) {
        sonuc = "geçtin";
    } else {
        sonuc = "kaldın";
    }
  System.out.println(sonuc);
}



