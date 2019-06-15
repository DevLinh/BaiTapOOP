import java.util.Scanner;

public class PBK {
    private String maPBK;
    private String tenPBK;

    //constructor

    public PBK(String maPBK, String tenPBK) {
        this.maPBK = maPBK;
        this.tenPBK = tenPBK;
    }

    public PBK() {
        this.maPBK = "";
        this.tenPBK = "";
    }

    public PBK(PBK p) {
        this.maPBK = p.maPBK;
        this.tenPBK = p.tenPBK;
    }

    //getter & setter

    public String getMaPBK() {
        return maPBK;
    }

    public void setMaPBK(String maPBK) {
        this.maPBK = maPBK;
    }

    public String getTenPBK() {
        return tenPBK;
    }

    public void setTenPBK(String tenPBK) {
        this.tenPBK = tenPBK;
    }

    //method
    public void Input() {
        Scanner cin = new Scanner(System.in);
        String temp;
        System.out.print("Nhap ma PBK: ");
        temp = cin.nextLine();
        setMaPBK(temp);
        System.out.print("Nhap ten PBK: ");
        temp = cin.nextLine();
        setTenPBK(temp);
    }

    public void Output() {
        System.out.printf("%-10s %-30s ",getMaPBK(), getTenPBK());
    }
}
