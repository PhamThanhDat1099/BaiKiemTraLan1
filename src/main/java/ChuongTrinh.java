/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    import java.util.Scanner;

public class ChuongTrinh {
    public static void main(String[] args) {
        QuanLyCD quanLyCD = new QuanLyCD();
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            
            do {
                System.out.println("----- Menu Quan Ly CD -----");
                System.out.println("1. Xuat toan bo danh sach CD");
                System.out.println("2. Tinh tong tri gia CD trong cua hang");
                System.out.println("3. Lay ra cac CD phat hanh truoc nam 2020");
                System.out.println("4. Tim cac CD ma ten CD co chua chu 'Tinh'");
                System.out.println("5. Sap xep CD theo gia giam dan");
                System.out.println("6. Xoa CD theo ma so");
                System.out.println("7. Sua gia ban cua CD theo ma so");
                System.out.println("0. Thoat");
                System.out.print("Chon chuc nang: ");
                choice = scanner.nextInt();
                scanner.nextLine(); 
                
                switch (choice) {
                    case 1:
                        quanLyCD.xuatDanhSachCD();
                        break;
                    case 2:
                        double tongTriGia = quanLyCD.tinhTongTriGia();
                        System.out.println("Tong tri gia CD trong cua hang: " + tongTriGia);
                        break;
                    case 3:
                        quanLyCD.layCDTruocNam(2020);
                        break;
                    case 4:
                        System.out.print("Nhap chuoi can tim trong ten CD: ");
                        String chuoi = scanner.nextLine();
                        quanLyCD.timCDCoChuaChu(chuoi);
                        break;
                    case 5:
                        quanLyCD.sapXepTheoGiaGiamDan();
                        System.out.println("Danh sach CD sau khi sap xep:");
                        quanLyCD.xuatDanhSachCD();
                        break;
                    case 6:
                        System.out.print("Nhap ma so CD can xoa: ");
                        String masoXoa = scanner.nextLine();
                        quanLyCD.xoaCDTheoMaSo(masoXoa);
                        break;
                    case 7:
                        System.out.print("Nhap ma so CD can sua gia: ");
                        String masoSua = scanner.nextLine();
                        System.out.print("Nhap gia ban moi: ");
                        double giaMoi = scanner.nextDouble();
                        quanLyCD.suaGiaBanTheoMaSo(masoSua, giaMoi);
                        break;
                    case 0:
                        System.out.println("Thoat chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop lo. Vui long chon lai.");
                        break;
                }
            } while (choice != 0);
        }
    }
}
