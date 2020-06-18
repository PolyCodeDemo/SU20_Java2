/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.models;

import java.util.Date;

/**
 *
 * @author tiennh
 */
public class Sach {
    protected String tenSach;
    protected String tenTacGia;
    protected String theLoai;
    protected Date ngayXB;

    public Sach() {
    }

    public Sach(String tenSach, String tenTacGia, String theLoai, Date ngayXB) {
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.theLoai = theLoai;
        this.ngayXB = ngayXB;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public Date getNgayXB() {
        return ngayXB;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNgayXB(Date ngayXB) {
        this.ngayXB = ngayXB;
    }
    
    
}
