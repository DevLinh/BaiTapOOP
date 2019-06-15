import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class QLNV {


    private static int menu() {
        int n;
        Scanner cin = new Scanner(System.in);
        System.out.println("Vui long dua ra lua chon!");
        System.out.println("1. Nhap mot HOC VIEN");
        System.out.println("2. Nhap mot nhan vien QUAN LY");
        System.out.println("3. Nhap mot GIAO VIEN");
        System.out.println("4. Xuat danh sach dung Array List");
        System.out.println("5. Chinh sua nam sinh theo ten");
        System.out.println("6. Tim nhan vien co luong cao nhat");
        System.out.println("7. Xoa doi tuong theo ten");
        System.out.println("0. EXIT!!!");
        System.out.print(">> ");
        n = cin.nextInt();
        return n;
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Nguoi> ds = new ArrayList<Nguoi>();
        while (true) {
            switch (menu()) {
                case 1:
                    System.out.println("Nhap thong tin HOC VIEN");
                    HocVien h = new HocVien();
                    h.Input();
                    ds.add(h);
                    break;
                case 2:
                    System.out.println("Nhap thong tin nhan vien QUAN LY");
                    NVQL n = new NVQL();
                    n.Input();
                    ds.add(n);
                    break;
                case 3:
                    System.out.println("Nhap thong tin GIAO VIEN");
                    GiaoVien g = new GiaoVien();
                    g.Input();
                    ds.add(g);
                    break;
                case 4:
                    if (ds.isEmpty()) {
                        System.out.println("CHUA CO THONG TIN, VUI LONG NHAP LIEU TRUOC KHI XEM");
                        break;
                    }
                    byte chon;
                    do {
                        System.out.println("Nhap 1: xuat danh sach HOC VIEN");
                        System.out.println("Nhap 2: xuat danh sach QUAN LY");
                        System.out.println("Nhap 3: xuat danh sach GIAO VIEN");
                        System.out.print(">> ");
                        chon = cin.nextByte();
                        if (chon > 3 || chon < 1) {
                            System.out.println("Lua chon khong hop le! VUI long lua chon lai");
                        }
                    } while (chon > 3 || chon < 1);
                    if (chon == 1) {
                        System.out.printf("%-30s %-6s %-3s %-3s %-3s\n", "Ho & ten", "NS", "D1", "D2", "D3");
                        System.out.println("----------------------------------------------------------------");
                        for (Nguoi i : ds) {
                            if (i instanceof HocVien) {
                                i.Output();
                                System.out.println("");
                            }
                        }
                    } else if (chon == 2) {
                        System.out.printf("%-30s %-6s %-15s %-10s %-10s %-30s %-15s %-15s %-15s %-10s %-10s\n", "Ho & ten", "NS", "NgayNV", "Luong", "MaPBK", "TenPBK", "Trinh do", "Nganh", "NoiDT", "PhuCapQL", "TongLuong");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        for (Nguoi i : ds) {
                            if (i instanceof NVQL) {
                                i.Output();
                                System.out.println("");
                            }
                        }
                    } else if (chon == 3) {
                        System.out.printf("%-30s %-6s %-15s %-10s %-10s %-30s %-15s %-15s %-15s %-10s %-10s\n", "Ho & ten", "NS", "NgayNV", "Luong", "MaPBK", "TenPBK", "Trinh do", "Nganh", "NoiDT", "ThuLaoGD", "TongLuong");
                        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        for (Nguoi i : ds) {
                            if (i instanceof GiaoVien) {
                                i.Output();
                                System.out.println("");
                            }
                        }
                    }

                    break;
                case 5:
                    //chinh sua nam sinh theo ten nhan vien
                    String ten;
                    System.out.print("Nhap ten nhan vien muon chinh sua: ");
                    ten = cin.nextLine();
                    int nam;
                    boolean t = false;
                    for (Nguoi i : ds) {
                        if (i.getTen().equals(ten))
                            t = true;
                    }
                    if(t == false) {
                        System.out.println("Khong co nhan vien ten " + ten);
                        break;
                    } else {
                        System.out.println("Tien Hanh sua doi thong tin cua " + ten);
                        for (Nguoi i : ds) {
                            if (i.getTen().equals(ten)) {
                                System.out.print("Doi tuong " + "[" + i.getTen() + "]" + " co nam sinh la " + i.getNamSinh() + "\n");
                                System.out.print("Nam sinh sua doi: ");
                                nam = cin.nextInt();
                                i.setNamSinh(nam);
                                System.out.print("\n------------------------------------\n");
                            }
                        }
                        break;
                    }
                case 6:
                    double max = 0f;
                    for (Nguoi i : ds) {
                        if (i instanceof NVQL) {
                            double temp = ((NVQL) i).tinhTongLuong();
                            if ( temp > max ) {
                                max = temp;
                            }
                        }
                        if (i instanceof GiaoVien) {
                            double temp = ((GiaoVien) i).tinhTongLuong();
                            if ( temp > max ) {
                                max = temp;
                            }
                        }
                    }
                    System.out.printf("%-30s %-6s 5-10s\n", "Ho & Ten", "NS", "Tongluong");
                    for (Nguoi i : ds) {
                        if (i instanceof NVQL ) {
                            double temp = ((NVQL) i).tinhTongLuong();
                            if (temp == max) {
                                System.out.printf("%-30s %-6s 5-10.2f\n", i.getTen(), i.getNamSinh(), max);
                            }
                        }
                    }
                    for (Nguoi i : ds) {
                        if (i instanceof GiaoVien ) {
                            double temp = ((GiaoVien) i).tinhTongLuong();
                            if (temp == max) {
                                System.out.printf("%-30s %-6s 5-10.2f\n", i.getTen(), i.getNamSinh(), max);
                            }
                        }
                    }
                    break;
                case 7:

                    System.out.print("Nhap ten nhan vien muon xoa: ");
                    ten = cin.nextLine();
                    byte c;
                    boolean tp = false;
                    for (Nguoi i : ds) {
                        if (i.getTen().equals(ten))
                            tp = true;
                    }
                    if(tp == false) {
                        System.out.println("Khong co nhan vien ten " + ten);
                        System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! !");
                        break;
                    } else {
                        System.out.println("Tien Hanh XOA thong tin cua " + ten);
                        Iterator<Nguoi> itr = ds.iterator();
                        while (itr.hasNext()) {
                            Nguoi id =  itr.next();
                            if (id.getTen().equals(ten)) {
                                itr.remove();
                            }
                        }
                        System.out.println("DONE!");
                        break;
                    }
                default:
                    System.out.println("Thoat...");
                    System.exit(0);
            }
        }
    }
}