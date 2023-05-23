/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaodichnhadat;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class GiaoDichNhaDat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         DanhSachGiaoDich ql = new DanhSachGiaoDich();
        Scanner sc = new Scanner(System.in); 
       GiaoDich gd =  new GiaoDich() ;
       GiaoDichDat gdd = new GiaoDichDat();
         GiaoDichNha gdn = new GiaoDichNha();
       int luaChon = 0 ;
       do {
        ql.MENU();
        luaChon = sc.nextInt();
        if ( luaChon == 2 ){
            System.out.println("1. In tat ca giao dich\n"+
                                "2. In giao dich dat\n "+
                                "3. In giao dich nha\n "+
                                " Nhap lua chon: " );
            int i = sc.nextInt();
            if ( i == 1 ){
                ql.xuatGiaoDich(); 
            } else if ( i == 2){
                gdd.xuat();
            } else if ( i == 3){
                gdn.xuat();
            }
        }else if (luaChon == 1){
            System.out.println("1. Them giao dich dat\n "+
                                "2. Them giao dich nha\n "+
                                " Nhap lua chon: " );
            int i = sc.nextInt();
            if ( i == 1 ){
                gd = new GiaoDichDat();
                gd.nhap();
            }else if ( i == 2 ){
                gd = new GiaoDichNha();
                gd.nhap();
            }
        }
    } while ( luaChon != 0);

    }
    
}
