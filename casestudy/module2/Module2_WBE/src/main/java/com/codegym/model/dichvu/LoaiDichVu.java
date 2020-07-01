package com.codegym.model.dichvu;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "loaidichvu")
public class LoaiDichVu {
    @Id
    private Integer idLoaiDichVu;
    private String tenLoaiDichVu;

    @OneToMany(mappedBy = "loaiDichVu")
    private List<DichVu> dichVuList;

    public LoaiDichVu() {
    }

    public LoaiDichVu(Integer idLoaiDichVu, String tenLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public Integer getIdLoaiDichVu() {
        return idLoaiDichVu;
    }

    public void setIdLoaiDichVu(Integer idLoaiDichVu) {
        this.idLoaiDichVu = idLoaiDichVu;
    }

    public String getTenLoaiDichVu() {
        return tenLoaiDichVu;
    }

    public void setTenLoaiDichVu(String tenLoaiDichVu) {
        this.tenLoaiDichVu = tenLoaiDichVu;
    }

    public List<DichVu> getDichVuList() {
        return dichVuList;
    }

    public void setDichVuList(List<DichVu> dichVuList) {
        this.dichVuList = dichVuList;
    }
}
