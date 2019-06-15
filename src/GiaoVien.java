import java.util.Scanner;

public class GiaoVien extends NhanVienCLC {
    private float thuLaoGD;

    //constructor

    public GiaoVien(String ten, int namSinh, double luong, String ngayNhanViec, PBK phongBan, String trinhDo, String nganh, String noiDaoTao, float thuLaoGD) {
        super(ten, namSinh, luong, ngayNhanViec, phongBan, trinhDo, nganh, noiDaoTao);
        this.thuLaoGD = thuLaoGD;
    }

    public GiaoVien() {
        super();
        this.thuLaoGD = 0f;
    }

    //setter && getter

    public float getThuLaoGD() {
        return thuLaoGD;
    }

    public void setThuLaoGD(float thuLaoGD) {
        this.thuLaoGD = thuLaoGD;
    }

    //method
    public void Input() {
        super.Input();
        Scanner cin = new Scanner(System.in);
        float p;
        System.out.print("Nhap thu lao giao duc: ");
        p = cin.nextFloat();
        setThuLaoGD(p);
    }

    public void Output() {
        super.Output();
        System.out.printf("%-10.2f %-10.2f ", getThuLaoGD(), tinhTongLuong());
    }

    //override method
    double tinhTongLuong() {
        return getThuLaoGD() + getLuong();
    }
}
