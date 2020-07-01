package com.codegym.model.nhanvien;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "trinh_do")
public class TrinhDo {
    @Id
    private Integer idTrinhDo;
    private String trinhDo;

    @OneToMany(mappedBy = "trinhDo")
    private List<NhanVien> nhanVienList;

    public TrinhDo() {
    }

    public TrinhDo(Integer idTrinhDo, String trinhDo) {
        this.idTrinhDo = idTrinhDo;
        this.trinhDo = trinhDo;
    }

    public Integer getIdTrinhDo() {
        return idTrinhDo;
    }

    public void setIdTrinhDo(Integer idTrinhDo) {
        this.idTrinhDo = idTrinhDo;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public List<NhanVien> getNhanVienList() {
        return nhanVienList;
    }

    public void setNhanVienList(List<NhanVien> nhanVienList) {
        this.nhanVienList = nhanVienList;
    }
}
