package com.codegym.model.nhanvien;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "bophan")
public class BoPhan {
    @Id
    private Integer idBoPhan;
    private String tenBoPhan;

    @OneToMany(mappedBy = "boPhan")
    private List<NhanVien> nhanVienList;

    public BoPhan() {
    }

    public BoPhan(Integer idBoPhan, String tenBoPhan) {
        this.idBoPhan = idBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public Integer getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(Integer idBoPhan) {
        this.idBoPhan = idBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
