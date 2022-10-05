/*
  Nama : Alvin Febrianto
  NIM  : 21091397031
*/

package RelasiAntarKelas;

public class SgtSamaSisi extends Titik {

  private double sisiSGT;

  public SgtSamaSisi(double x1, double y1, double x2, double y2) {
    super(x1, y1);
    Titik t2 = new Titik(x2, y2);
    sisiSGT = hitungJarak(t2);
  }

  public double hitungLuas() {
    // Tinggi segitiga dengan rumus Pythagoras
    double tinggiSegitiga = Math.sqrt(Math.pow(sisiSGT, 2) - Math.pow((sisiSGT / 2), 2));

    return sisiSGT * tinggiSegitiga / 2;
  }

  @Override
  public void tampil() {
    System.out.println("== DATA Segitiga ==");
    super.tampil();
    System.out.println("Sisi Segitiga\t\t: " + sisiSGT);
    System.out.println("Luas Segitiga\t\t: " + hitungLuas());
  }

}