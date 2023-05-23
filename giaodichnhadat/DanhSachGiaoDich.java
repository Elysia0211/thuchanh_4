/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodichnhadat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachGiaoDich {
    ArrayList<GiaoDich> gd;
    public void themGiaoDich(GiaoDich g){
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng giao dịch cần thêm:");
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println("Nhap giao dich thứ"+i);
            if(g instanceof GiaoDichDat){
                g = new GiaoDichDat();
                g.nhap(sc);
            }
            if(g instanceof GiaoDichNha){
                g = new GiaoDichNha();
                g.nhap(sc);
            }
            gd.add(g);
            
        }
    }
    public void xuatGD(){
        System.out.format("%-10s %-30s %-15s %-10s %-15s %-10s %-20s %-20s -20s",
                "| Ma GD:",
                "|Ngay giao dich:",
                "|Don gia:",
                "|Loai dat:",
                "|Thanh tien",
                "|Loai nha",
                "|Dien tich",
                "|Dịa chỉ",
                "|Thanh tien");
    }
    for (GiaoDich g:gd){
        System.out.format("%-10s %-30s %-15s %-10s %-15s %-10s %-20s %-20s -20s",
                g.getMaGiaoDich(),
                g.getNgayGiaoDich(),
                g.getDonGia(),
                g.getGiaoDichDat().getLoaiDat(),
                g.getThanhTien(),
                g.getGiaoDichNha().getLoaiNha(),
                g.getDienTich(),
                g.getDiaChi(),
                g.getThanhTien());
               
                
}
}
