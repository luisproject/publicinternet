package model.bean;

@SuppressWarnings("all")
public class May {
	private int idm;
	private String tenMay;
	private String tinhTrang;
	private Boolean trangThai;
	private String moTa;
	private int donGia;
	public May() {
		super();
	}
	public May(int idm, String tenMay, String tinhTrang, Boolean trangThai, String moTa, int donGia) {
		super();
		this.idm = idm;
		this.tenMay = tenMay;
		this.tinhTrang = tinhTrang;
		this.trangThai = trangThai;
		this.moTa = moTa;
		this.donGia = donGia;
	}
	public int getIdm() {
		return idm;
	}
	public void setIdm(int idm) {
		this.idm = idm;
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
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
}
