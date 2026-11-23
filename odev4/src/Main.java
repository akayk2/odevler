//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
void main() {
    String[] sehirler = new String[15];
    sehirler[0] = "İstanbul";
    sehirler[1] = "Ankara";
    sehirler[2] = "İzmir";
    sehirler[3] = "Bursa";
    sehirler[4] = "Antalya";
    sehirler[5] = "Adana";
    sehirler[6] = "Konya";
    sehirler[7] = "Trabzon";
    sehirler[8] = "Eskişehir";
    sehirler[9] = "Samsun";
    sehirler[10] = "Hatay";
    sehirler[11] = "Iğdır";
    sehirler[12] = "Erzincan";
    sehirler[13] = "Muğla";
    sehirler[14] = "Sivas";
    Arrays.sort(sehirler);

    for (String sehir : sehirler) {
        System.out.println(sehir);
    }
}