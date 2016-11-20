package model.bean;

@SuppressWarnings("all")
public class Member {
	private String id;
	private String tenDangNhap;
	private String matKhau;
	private String thanhToan;
	private String tongThoiGian;
	private String thoiGianSuDung;
	public Member(){
		super();
	}
	public Member(String id, String tenDangNhap, String matKhau, String thanhToan, String tongThoiGian,
			String thoiGianSuDung) {
		super();
		this.id = id;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.thanhToan = thanhToan;
		this.tongThoiGian = tongThoiGian;
		this.thoiGianSuDung = thoiGianSuDung;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getThanhToan() {
		return thanhToan;
	}
	public void setThanhToan(String thanhToan) {
		this.thanhToan = thanhToan;
	}
	public String getTongThoiGian() {
		return tongThoiGian;
	}
	public void setTongThoiGian(String tongThoiGian) {
		this.tongThoiGian = tongThoiGian;
	}
	public String getThoiGianSuDung() {
		return thoiGianSuDung;
	}
	public void setThoiGianSuDung(String thoiGianSuDung) {
		this.thoiGianSuDung = thoiGianSuDung;
	}
}
