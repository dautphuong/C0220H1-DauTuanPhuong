package com.codegym.model.dichvu;

import com.codegym.model.hopdong.HopDong;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "dichvu")
public class DichVu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDichVu;
    private String tenDichVu;
    private Double dienTich;
    private Integer soTang;
    private Integer soNguoiToiDa;
    private Double chiPhiThue;
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "id_kieu_thue")
    private KieuThue kieuThue;

    @ManyToOne
    @JoinColumn(name="id_loai_dich_vu")
    private LoaiDichVu loaiDichVu;

    @OneToMany(mappedBy = "dichVu")
    private List<HopDong> hopDongList;

    public DichVu() {
    }

    public DichVu(Integer idDichVu, String tenDichVu, Double dienTich, Integer soTang, Integer soNguoiToiDa, Double chiPhiThue, String trangThai) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThai = trangThai;
    }

    public Integer getIdDichVu() {
        return idDichVu;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    public void setIdDichVu(Integer idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTich() {
        return dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }
}
