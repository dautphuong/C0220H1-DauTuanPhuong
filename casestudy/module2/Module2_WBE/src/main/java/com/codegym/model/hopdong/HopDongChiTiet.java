package com.codegym.model.hopdong;

import com.codegym.model.dichvu.DichVuDiKem;

import javax.persistence.*;

@Entity
@Table(name = "hopdongchitiet")
public class HopDongChiTiet {
    @Id
    private Integer idHopDongChiTiet;
    private Integer soLuong;

    @ManyToOne
    @JoinColumn(name = "id_dich_vu_di_kem")
    private DichVuDiKem dichVuDiKem;

    @ManyToOne
    @JoinColumn(name = "id_hop_dong")
    private HopDong hopDong;

    public HopDongChiTiet() {
    }

    public HopDongChiTiet(Integer idHopDongChiTiet, Integer soLuong) {
        this.idHopDongChiTiet = idHopDongChiTiet;
        this.soLuong = soLuong;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public Integer getIdHopDongChiTiet() {
        return idHopDongChiTiet;
    }

    public void setIdHopDongChiTiet(Integer idHopDongChiTiet) {
        this.idHopDongChiTiet = idHopDongChiTiet;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }
}
