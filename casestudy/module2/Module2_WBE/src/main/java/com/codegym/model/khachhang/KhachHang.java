package com.codegym.model.khachhang;

import com.codegym.model.hopdong.HopDong;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @Pattern(regexp = "(KH-[0-9]{4})", message = "Sai định dạng KH-XXXX")
    private String idKhachHang;
    @NotEmpty(message = "Không đươc để trống")
    private String hoTen;
    @NotEmpty(message = "Không được để trống")
    private String ngaySinh;
    @Pattern(regexp = "([0-9]{9}|[0-9]{12})", message = "CMND cần 9 hoặc 12 chữ số")
    private String soCMND;
    @Pattern(regexp = "(090[0-9]{7}|091[0-9]{7}|(84)90[0-9]{7}|(84)91[0-9]{7})", message = "Số điện thoại bắt đầu bằng 090 hoặc 091")
    private String sdt;
    @Email
    private String email;
    private String diaChi;
    @ManyToOne
    @JoinColumn(name = "id_loai_khach")
    private LoaiKhach loaiKhach;

    @OneToMany(mappedBy = "khachHang", cascade = CascadeType.ALL)
    private List<HopDong> hopDongList;

    public KhachHang() {
    }

    public KhachHang(String idKhachHang, String hoTen, String ngaySinh, String soCMND, String sdt, String email, String diaChi) {
        this.idKhachHang = idKhachHang;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
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

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
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

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }
}
