package com.codegym.model.khachhang;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loaikhach")
public class LoaiKhach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLoaiKhach;
    private String tenLoaiKhach;

    @OneToMany(mappedBy = "loaiKhach")
    private List<KhachHang> khachHangList;

    public LoaiKhach() {
    }

    public LoaiKhach(Integer idLoaiKhach, String tenLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public Integer getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(Integer idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getTenLoaiKhach() {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public List<KhachHang> getKhachHangList() {
        return khachHangList;
    }

    public void setKhachHangList(List<KhachHang> khachHangList) {
        this.khachHangList = khachHangList;
    }

}
