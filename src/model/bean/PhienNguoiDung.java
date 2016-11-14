package model.bean;

import java.sql.Timestamp;

@SuppressWarnings("all")
public class PhienNguoiDung {
	
	private int id;
    private int idmay;
    private String tenMay;
    private String tinhTrang;
    private Boolean trangThai;
    private Timestamp thoiGianBatDau;
    private Timestamp thoiGianKetThuc;
    private String thoiGianChoi;
    private String thanhTien;
	public PhienNguoiDung() {
		super();
	}
	public PhienNguoiDung(int id, int idmay, String tenMay, String tinhTrang, Boolean trangThai,
			Timestamp thoiGianBatDau, Timestamp thoiGianKetThuc, String thoiGianChoi, String thanhTien) {
		super();
		this.id = id;
		this.idmay = idmay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
		this.trangThai = trangThai;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiGianChoi = thoiGianChoi;
		this.thanhTien = thanhTien;
	}

	public PhienNguoiDung(int idmay, String tenMay, String tinhTrang, Boolean trangThai, Timestamp thoiGianBatDau,
			Timestamp thoiGianKetThuc, String thoiGianChoi, String thanhTien) {
		super();
		this.idmay = idmay;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
		this.trangThai = trangThai;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiGianChoi = thoiGianChoi;
		this.thanhTien = thanhTien;
	}
	
	public PhienNguoiDung(int idmay, Boolean trangThai, Timestamp thoiGianBatDau, Timestamp thoiGianKetThuc,
			String thoiGianChoi, String thanhTien) {
		super();
		this.idmay = idmay;
		this.trangThai = trangThai;
		this.thoiGianBatDau = thoiGianBatDau;
		this.thoiGianKetThuc = thoiGianKetThuc;
		this.thoiGianChoi = thoiGianChoi;
		this.thanhTien = thanhTien;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdmay() {
		return idmay;
	}
	public void setIdmay(int idmay) {
		this.idmay = idmay;
	}
	public String getTenMay() {
		return tenMay;
	}
	public void setTenMay(String tenMay) {
		this.tenMay = tenMay;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public Boolean getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(Boolean trangThai) {
		this.trangThai = trangThai;
	}
	public Timestamp getThoiGianBatDau() {
		return thoiGianBatDau;
	}
	public void setThoiGianBatDau(Timestamp thoiGianBatDau) {
		this.thoiGianBatDau = thoiGianBatDau;
	}
	public String getThoiGianChoi() {
		return thoiGianChoi;
	}
	public void setThoiGianChoi(String thoiGianChoi) {
		this.thoiGianChoi = thoiGianChoi;
	}
	public String getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien(String thanhTien) {
		this.thanhTien = thanhTien;
	}
	public Timestamp getThoiGianKetThuc() {
		return thoiGianKetThuc;
	}
	public void setThoiGianKetThuc(Timestamp thoiGianKetThuc) {
		this.thoiGianKetThuc = thoiGianKetThuc;
	}
}
