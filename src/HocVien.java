import java.util.Scanner;

public class HocVien extends Nguoi {
    private int diem1, diem2, diem3;

    //constructor

    public HocVien(String ten, int namSinh, int diem1, int diem2, int diem3) {
        super(ten, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public HocVien() {
        super();
        this.diem1 = 0;
        this.diem2 = 0;
        this.diem3 = 0;
    }

    //getter & setter

    public int getDiem1() {
        return diem1;
    }

    public void setDiem1(int diem1) {
        this.diem1 = diem1;
    }

    public int getDiem2() {
        return diem2;
    }

    public void setDiem2(int diem2) {
        this.diem2 = diem2;
    }

    public int getDiem3() {
        return diem3;
    }

    public void setDiem3(int diem3) {
        this.diem3 = diem3;
    }

    //method

    @Override
    public void Input() {
        Scanner cin = new Scanner(System.in);
        super.Input();
        int d;
        System.out.print("Nhap diem 1: ");
        d = cin.nextInt();
        setDiem1(d);
        System.out.print("Nhap diem 2: ");
        d = cin.nextInt();
        setDiem2(d);
        System.out.print("Nhap diem 3: ");
        d = cin.nextInt();
        setDiem3(d);
    }

    @Override
    public void Output() {
        super.Output();
        System.out.printf("%-3d %-3d %-3d ", getDiem1(), getDiem2(), getDiem3());
    }
}
