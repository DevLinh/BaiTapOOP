import java.util.Scanner;

public class Nguoi {
    private String ten;
    private int namSinh;

    //constructor

    public Nguoi(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }

    public Nguoi() {
        this.ten = "";
        this.namSinh = 0;
    }

    public Nguoi(Nguoi n) {
        this.ten = n.ten;
        this.namSinh = n.namSinh;
    }

    //getter & setter

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    //method input & output
    public void Input() {
        Scanner cin = new Scanner(System.in);
        String temp;
        int n;
        System.out.print("Nhap ten: ");
        temp = cin.nextLine();
        setTen(temp);
        System.out.print("Nhap nam sinh: ");
        n = cin.nextInt();
        setNamSinh(n);
    }

    public void Output() {
        System.out.printf("%-30s %-6d ", getTen(), getNamSinh());
    }
}
