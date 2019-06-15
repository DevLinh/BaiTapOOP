import java.util.Scanner;

abstract class NhanVienCLC extends NhanVien{
    private String trinhDo;
    private String nganh;
    private String noiDaoTao;

    //constuctor

    public NhanVienCLC(String ten, int namSinh, double luong, String ngayNhanViec, PBK phongBan, String trinhDo, String nganh, String noiDaoTao) {
        super(ten, namSinh, luong, ngayNhanViec, phongBan);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }

    public NhanVienCLC() {
        super();
        this.trinhDo = "";
        this.nganh = "";
        this.noiDaoTao = "";
    }

    //getter & setter

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

    //method
    public void Input() {
        super.Input();
        Scanner cin = new Scanner(System.in);
        String temp;
        System.out.print("Trinh do: ");
        temp = cin.nextLine();
        setTrinhDo(temp);
        System.out.print("Nganh: ");
        temp = cin.nextLine();
        setNganh(temp);
        System.out.print("Noi dao tao: ");
        temp = cin.nextLine();
        setNoiDaoTao(temp);
    }

    public void Output() {
        super.Output();
        System.out.printf("%-15s %-15s %-15s ", getTrinhDo(), getNganh(), getNoiDaoTao());
    }

    abstract double tinhTongLuong();
}
