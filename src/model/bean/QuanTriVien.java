package model.bean;

@SuppressWarnings("all")
public class QuanTriVien {
	private int idqtv;
	private String tenDangNhap;
	private String matKhau;
	private String hoTen;
	private boolean isAdmin;
	public QuanTriVien() {
		super();
	}
	public QuanTriVien(int idqtv, String tenDangNhap, String matKhau, String hoTen, boolean isAdmin) {
		super();
		this.idqtv = idqtv;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.hoTen = hoTen;
		this.isAdmin = isAdmin;
	}
	public int getIdqtv() {
		return idqtv;
	}
	public void setIdqtv(int idqtv) {
		this.idqtv = idqtv;
	}
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
