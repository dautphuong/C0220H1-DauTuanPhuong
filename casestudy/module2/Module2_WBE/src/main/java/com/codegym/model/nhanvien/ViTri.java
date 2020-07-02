package com.codegym.model.nhanvien;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vitri")
public class ViTri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idViTri;
    private String tenViTri;

    @OneToMany(mappedBy = "viTri")
    private List<NhanVien> nhanVienList;

    public ViTri() {
    }

    public ViTri(Integer idViTri, String tenViTri) {
        this.idViTri = idViTri;
        this.tenViTri = tenViTri;
    }

    public Integer getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(Integer idViTri) {
        this.idViTri = idViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
