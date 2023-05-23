/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giaodichnhadat;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaoDichNha extends GiaoDich{
    private String loaiNha, diaChi;

    public GiaoDichNha() {
    }

    public GiaoDichNha(String loaiNha, String diaChi) {
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public GiaoDichNha(String loaiNha, String diaChi, String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "GiaoDichNha{" + "loaiNha=" + loaiNha + ", diaChi=" + diaChi + '}';
    }
     public void nhap(Scanner sc){
       System.out.println("Nhap vào loai nha:");
        loaiNha=sc.nextLine();
        
       System.out.println("Nhap vào dia chi:");
        diaChi=sc.nextLine();
   
   }
}
