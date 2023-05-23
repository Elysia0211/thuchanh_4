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
public class GiaoDich {
    private String maGiaoDich;
    private LocalDate ngayGiaoDich;
    private double donGia, dienTich;

    public GiaoDich() {
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public LocalDate getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    @Override
    public String toString() {
        return "GiaoDich{" + "maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", donGia=" + donGia + ", dienTich=" + dienTich + '}';
    }
    public void nhap(Scanner sc){
        System.out.println("Nhap vào ma giao dich:");
        maGiaoDich=sc.nextLine();
        System.out.println("Nhap vào đơn giá: ");
        donGia=sc.nextDouble();
        System.out.println("Nhap vào dien tich: ");
        dienTich=sc.nextDouble();
        int ngay,thang,nam;
        do{
            System.out.println("Nhap vào ngay giao dich: ");
            ngay=sc.nextInt();  
            if(ngay<0 || ngay>31){
                System.out.println("Nhap lai");
            }
            }while( ngay>0 || ngay<31);
        
            do{
              System.out.println("Nhap vào thang giao dich: ");
            thang=sc.nextInt();  
            if(thang<1 || thang>12){
                System.out.println("Nhap lai");
            }
            }while( thang>1 || thang<12); 
            
            
            
              System.out.println("Nhap vào năm giao dich: ");
            nam=sc.nextInt();  
            ngayGiaoDich= LocalDate.of(ngay,thang,nam);
            
        }
    
     public void xuat(){
        System.out.println("Ma giao dich: " + maGiaoDich);
        System.out.println("Ngay giao dich: " + ngayGiaoDich);
        System.out.println("Don gia: " + donGia);
        System.out.println("Dien tich: " + dienTich);
    }

   public GiaoDichDat getGiaoDichDat() {
        return getGiaoDichDat();
    }
    public GiaoDichNha getGiaoDichNha() {
        return getGiaoDichNha();
    }
        
    
}
