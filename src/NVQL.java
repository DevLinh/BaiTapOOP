import java.util.Scanner;

public class NVQL extends NhanVienCLC {
    private float phuCapQL;

    //constructor

    public NVQL(String ten, int namSinh, double luong, String ngayNhanViec, PBK phongBan, String trinhDo, String nganh, String noiDaoTao, float phuCapQL) {
        super(ten, namSinh, luong, ngayNhanViec, phongBan, trinhDo, nganh, noiDaoTao);
        this.phuCapQL = phuCapQL;
    }

    public NVQL() {
        super();
        this.phuCapQL = 0f;
    }


    //setter & getter

    public float getPhuCapQL() {
        return phuCapQL;
    }

    public void setPhuCapQL(float phuCapQL) {
        this.phuCapQL = phuCapQL;
    }
    //method
    public void Input() {
        super.Input();
        Scanner cin = new Scanner(System.in);
        float p;
        System.out.print("Nhap phu cap quan ly: ");
        p = cin.nextFloat();
        setPhuCapQL(p);
    }

    public void Output() {
        super.Output();
        System.out.printf("%-10.2f %-10.2f ", getPhuCapQL(), tinhTongLuong());
    }
    //override method
    double tinhTongLuong() {
        return getLuong() + getPhuCapQL();
    }
}
