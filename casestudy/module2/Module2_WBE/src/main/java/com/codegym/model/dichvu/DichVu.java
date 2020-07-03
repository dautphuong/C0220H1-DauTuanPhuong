package com.codegym.model.dichvu;

import com.codegym.model.hopdong.HopDong;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "dichvu")
public class DichVu {
    @Id
//    @GeneratedValue(generator = "iddichvu_generator")
//    @GenericGenerator(name = "iddichvu_generator",
//            strategy = "com.codegym.IdGenerator.IdDichVuGenerator")
    @Pattern(regexp = "(DV-[0-9]{4})")
    private String idDichVu;
    @NotEmpty
    private String tenDichVu;
    @Min(1)
    private Double dienTich;
    //chỉ hiện khi kieuthue=villa hoặc house
    @Min(0)
    private Integer soTang;
    @Min(1)
    private Integer soNguoiToiDa;
    @Min(0)
    private Double chiPhiThue;
    private String trangThai;

    @ManyToOne
    @JoinColumn(name = "id_kieu_thue")
    private KieuThue kieuThue;

    //chỉ hiện khi kieuThue là Room
    @ManyToOne
    @JoinColumn(name="id_loai_dich_vu")
    private LoaiDichVu loaiDichVu;

    @OneToMany(mappedBy = "dichVu",cascade = CascadeType.ALL)
    private List<HopDong> hopDongList;

    public DichVu() {
    }

    public DichVu(String idDichVu, String tenDichVu, Double dienTich, Integer soTang, Integer soNguoiToiDa, Double chiPhiThue, String trangThai) {
        this.idDichVu = idDichVu;
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThai = trangThai;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    public void setIdDichVu(String idDichVu) {
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
