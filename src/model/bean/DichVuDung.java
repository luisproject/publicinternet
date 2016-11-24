package model.bean;

@SuppressWarnings("all")
public class DichVuDung {
	private int id;
	private int idm;
	private String tenDichVu;
	private int donGia;
	private int soLuong;
	private String trangThai;
	public DichVuDung() {
		super();
	}
	public DichVuDung(int id, int idm, String tenDichVu, int donGia, int soLuong, String trangThai) {
		super();
		this.id = id;
		this.idm = idm;
		this.tenDichVu = tenDichVu;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.trangThai = trangThai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdm() {
		return idm;
	}
	public void setIdm(int idm) {
		this.idm = idm;
	}
	public String getTenDichVu() {
		return tenDichVu;
	}
	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}
}
