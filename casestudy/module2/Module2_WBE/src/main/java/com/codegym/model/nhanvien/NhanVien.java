package com.codegym.model.nhanvien;

import com.codegym.model.hopdong.HopDong;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idNhanVien;
    private String hoTen;
    private String ngaySinh;
    private String soCMND;
    @Min(0)
    private String luong;
    private String sdt;
    private String email;
    private String diaChi;

    @ManyToOne
    @JoinColumn(name = "id_vi_tri")
    private ViTri viTri;

    @ManyToOne
    @JoinColumn(name = "id_bo_phan")
    private BoPhan boPhan;

    @ManyToOne
    @JoinColumn(name = "id_trinh_do")
    private TrinhDo trinhDo;

    @OneToMany(mappedBy = "nhanVien")
    private List<HopDong> hopDongList;


    public NhanVien() {
    }

    public NhanVien(Integer idNhanVien, String hoTen, String ngaySinh, String soCMND, String luong, String sdt, String email, String diaChi) {
        this.idNhanVien = idNhanVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.luong = luong;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ViTri getViTri() {
        return viTri;
    }

    public void setViTri(ViTri viTri) {
        this.viTri = viTri;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(BoPhan boPhan) {
        this.boPhan = boPhan;
    }

    public TrinhDo getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(TrinhDo trinhDo) {
        this.trinhDo = trinhDo;
    }
}
