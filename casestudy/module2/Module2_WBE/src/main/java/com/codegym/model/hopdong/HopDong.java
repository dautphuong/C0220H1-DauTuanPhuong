package com.codegym.model.hopdong;

import com.codegym.model.dichvu.DichVu;
import com.codegym.model.khachhang.KhachHang;
import com.codegym.model.nhanvien.NhanVien;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "hopdong")
public class HopDong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHopDong;
    private String ngayLamHopDong;
    private String ngayKetThuc;
    private Double tienDatCoc;
    private Double tongTien;

    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    private NhanVien nhanVien;

    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    private KhachHang khachHang;

    @ManyToOne
    @JoinColumn(name = "id_dich_vu")
    private DichVu dichVu;

    @OneToMany(mappedBy = "hopDong",cascade = CascadeType.ALL)
    private List<HopDongChiTiet> hopDongChiTietList;

    public HopDong() {
    }

    public HopDong(Integer idHopDong, String ngayLamHopDong, String ngayKetThuc, Double tienDatCoc, Double tongTien) {
        this.idHopDong = idHopDong;
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThuc = ngayKetThuc;
        this.tienDatCoc = tienDatCoc;
        this.tongTien = tongTien;
    }

    public List<HopDongChiTiet> getHopDongChiTietList() {
        return hopDongChiTietList;
    }

    public void setHopDongChiTietList(List<HopDongChiTiet> hopDongChiTietList) {
        this.hopDongChiTietList = hopDongChiTietList;
    }

    public Double getTienDatCoc() {
        return tienDatCoc;
    }

    public void setTienDatCoc(Double tienDatCoc) {
        this.tienDatCoc = tienDatCoc;
    }

    public Integer getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(Integer idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
}

