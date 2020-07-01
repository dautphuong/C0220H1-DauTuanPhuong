package com.codegym.model.dichvu;

import com.codegym.model.hopdong.HopDongChiTiet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "dichvudikem")
public class DichVuDiKem {
    @Id
    private Integer idDichVuDiKem;
    private String tenDichVuDiKem;
    private Double gia;
    private Integer donVi;
    private String trangThaiKhaDung;

    @OneToMany(mappedBy = "dichVuDiKem")
    private List<HopDongChiTiet> hopDongChiTietList;

    public DichVuDiKem() {
    }

    public DichVuDiKem(Integer idDichVuDiKem, String tenDichVuDiKem, Double gia, Integer donVi, String trangThaiKhaDung) {
        this.idDichVuDiKem = idDichVuDiKem;
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.gia = gia;
        this.donVi = donVi;
        this.trangThaiKhaDung = trangThaiKhaDung;
    }

    public Integer getIdDichVuDiKem() {
        return idDichVuDiKem;
    }

    public void setIdDichVuDiKem(Integer idDichVuDiKem) {
        this.idDichVuDiKem = idDichVuDiKem;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Integer getDonVi() {
        return donVi;
    }

    public void setDonVi(Integer donVi) {
        this.donVi = donVi;
    }

    public String getTrangThaiKhaDung() {
        return trangThaiKhaDung;
    }

    public void setTrangThaiKhaDung(String trangThaiKhaDung) {
        this.trangThaiKhaDung = trangThaiKhaDung;
    }

    public List<HopDongChiTiet> getHopDongChiTietList() {
        return hopDongChiTietList;
    }

    public void setHopDongChiTietList(List<HopDongChiTiet> hopDongChiTietList) {
        this.hopDongChiTietList = hopDongChiTietList;
    }
}
