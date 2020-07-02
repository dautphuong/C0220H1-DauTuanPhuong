package com.codegym.model.dichvu;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kieuthue")
public class KieuThue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idKieuThue;
    private String tenKieuThue;
    private Double gia;

    @OneToMany(mappedBy = "kieuThue")
    private List<DichVu> dichVuList;

    public KieuThue() {
    }

    public KieuThue(Integer idKieuThue, String tenKieuThue, Double gia) {
        this.idKieuThue = idKieuThue;
        this.tenKieuThue = tenKieuThue;
        this.gia = gia;
    }

    public Integer getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(Integer idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public String getTenKieuThue() {
        return tenKieuThue;
    }

    public void setTenKieuThue(String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public List<DichVu> getDichVuList() {
        return dichVuList;
    }

    public void setDichVuList(List<DichVu> dichVuList) {
        this.dichVuList = dichVuList;
    }
}
