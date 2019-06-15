import java.util.Scanner;

public class NhanVien extends Nguoi{
    private double luong;
    private String ngayNhanViec;
    private PBK phongBan = new PBK();

    //constructor

    public NhanVien(String ten, int namSinh, double luong, String ngayNhanViec, PBK phongBan) {
        super(ten, namSinh);
        this.luong = luong;
        this.ngayNhanViec = ngayNhanViec;
        this.phongBan = phongBan;
    }

    public NhanVien() {
        super();
        this.luong = 0f;
        this.ngayNhanViec = "";
    }

    //getter & setter

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getNgayNhanViec() {
        return ngayNhanViec;
    }

    public void setNgayNhanViec(String ngayNhanViec) {
        this.ngayNhanViec = ngayNhanViec;
    }

    public PBK getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PBK phongBan) {
        this.phongBan = phongBan;
    }

    //method
    public void Input() {
        super.Input();
        Scanner cin = new Scanner(System.in);
        String temp;
        double l;
        System.out.print("Ngay nhan viec: ");
        temp = cin.nextLine();
        setNgayNhanViec(temp);
        System.out.print("Nhap luong: ");
        l = cin.nextDouble();
        setLuong(l);
        phongBan.Input();
    }

    public void Output() {
        super.Output();
        System.out.printf("%-15s %-10.2f ", getNgayNhanViec(), getLuong());
        phongBan.Output();
    }
}
