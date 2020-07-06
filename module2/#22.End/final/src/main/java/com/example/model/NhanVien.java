package com.example.model;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.Period;

@Entity
public class NhanVien implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer maNhanVien;
    @NotEmpty(message = "Không được để trống")
    private String nhomNhanVien;
    @NotEmpty(message = "Không được để trống")
    private String hoten;
    @Pattern(regexp = "nam|nữ",message = "Sai giá trị nam hoặc nữ")
    private String gioiTinh;
    @NotEmpty(message = "Không được để trống")
    public String ngaySinh;
    @Pattern(regexp = "[0-9]{10}",message = "cmnd cần 10 số ")
    public String soCMND;
    @Pattern(regexp = "090[0-9]{7}|091[0-9]{7}",message = "số điện thoại số đầu 090 hoặc 091 và 7 chữ số")
    private String soDienThoai;
    @Pattern(regexp = "^([a-zA-Z0-9_.-])+@(([a-zA-Z0-9-])+.)+[.]([a-zA-Z0-9]{2,4})+$",message = "sai định dạng email")
    public String email;
    public String diaChi;

    public NhanVien() {
    }

    public NhanVien(String nhomNhanVien, String hoten, String gioiTinh, String ngaySinh, String soCMND, String soDienThoai, String email, String diaChi) {
        this.nhomNhanVien = nhomNhanVien;
        this.hoten = hoten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.diaChi = diaChi;
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

    public Integer getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(Integer maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getNhomNhanVien() {
        return nhomNhanVien;
    }

    public void setNhomNhanVien(String nhomNhanVien) {
        this.nhomNhanVien = nhomNhanVien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanVien user= (NhanVien) target;
        String[] arr=user.ngaySinh.split("-");

        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));

        Period p = Period.between(birthday, today);

        if(p.getYears()<=18){
            errors.rejectValue("ngaySinh","user.ngaySinh");
        }
    }
}
