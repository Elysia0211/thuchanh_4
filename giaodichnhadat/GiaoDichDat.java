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
public class GiaoDichDat extends GiaoDich{
    private String loaiDat;
    private double thanhTien;
    public GiaoDichDat() {

    }
    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loatDat, double thanhTien) {
        super();
        this.loaiDat = loatDat;
    }

    
    

    public String getLoaiDat() {
        return this.loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }

    public double getThanhTien() {
        return this.thanhTien;
    }
    public void nhap(Scanner sc){
        
//        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai dat: ");
        if(sc.nextLine().equals("A")){
            this.loaiDat = "A";
        }
        else if(sc.nextLine().equals("B")){
            this.loaiDat = "B";
        }else if( sc.nextLine().equals("C")){
            this.loaiDat = "C";
        }else{
            System.out.println("Nhap lai loai dat: ");
        }

    }
    public void xuat(Scanner sc){
        
        System.out.println("Loai dat: " + this.loaiDat);
        System.out.println("Thanh tien: " + this.thanhTien);
    }
//    public void setThanhTien() {
//        if (loaiDat.equals("A")){
//            thanhTien = dienTich * 3/2 * donGia;
//        } else if (loaiDat.equals("B") && loaiDat.equals("C")){
//            thanhTien = dienTich * donGia;
//        }  
//    }

    @Override
    public String toString() {
        return "{" +
            " loaiDat='" + getLoaiDat() + "'" +
            ", thanhTien='" + getThanhTien() + "'" +
            "}";
    }
    
}
