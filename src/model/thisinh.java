package model;

import java.util.Date;
import java.util.Objects;

public class thisinh {
	
	private int mathisinh;
	private String tenthisinh;
	private tinh quequan;
	private Date ngaysinh;
	private boolean gioitinh;
	private float diemMon1,diemMon2,diemMon3;
	
	public thisinh() {
		
	}

	public thisinh(int mathisinh, String tenthisinh, tinh quequan, Date ngaysinh, boolean gioitinh, float diemMon1,
			float diemMon2, float diemMon3) {
		this.mathisinh = mathisinh;
		this.tenthisinh = tenthisinh;
		this.quequan = quequan;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.diemMon1 = diemMon1;
		this.diemMon2 = diemMon2;
		this.diemMon3 = diemMon3;
	}

	public int getMathisinh() {
		return mathisinh;
	}

	public void setMathisinh(int mathisinh) {
		this.mathisinh = mathisinh;
	}

	public String getTenthisinh() {
		return tenthisinh;
	}

	public void setTenthisinh(String tenthisinh) {
		this.tenthisinh = tenthisinh;
	}

	public tinh getQuequan() {
		return quequan;
	}

	public void setQuequan(tinh quequan) {
		this.quequan = quequan;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public float getDiemMon1() {
		return diemMon1;
	}

	public void setDiemMon1(float diemMon1) {
		this.diemMon1 = diemMon1;
	}

	public float getDiemMon2() {
		return diemMon2;
	}

	public void setDiemMon2(float diemMon2) {
		this.diemMon2 = diemMon2;
	}

	public float getDiemMon3() {
		return diemMon3;
	}

	public void setDiemMon3(float diemMon3) {
		this.diemMon3 = diemMon3;
	}

	@Override
	public String toString() {
		return "thisinh [mathisinh=" + mathisinh + ", tenthisinh=" + tenthisinh + ", quequan=" + quequan + ", ngaysinh="
				+ ngaysinh + ", gioitinh=" + gioitinh + ", diemMon1=" + diemMon1 + ", diemMon2=" + diemMon2
				+ ", diemMon3=" + diemMon3 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemMon1, diemMon2, diemMon3, gioitinh, mathisinh, ngaysinh, quequan, tenthisinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		thisinh other = (thisinh) obj;
		return Float.floatToIntBits(diemMon1) == Float.floatToIntBits(other.diemMon1)
				&& Float.floatToIntBits(diemMon2) == Float.floatToIntBits(other.diemMon2)
				&& Float.floatToIntBits(diemMon3) == Float.floatToIntBits(other.diemMon3) && gioitinh == other.gioitinh
				&& mathisinh == other.mathisinh && Objects.equals(ngaysinh, other.ngaysinh)
				&& Objects.equals(quequan, other.quequan) && Objects.equals(tenthisinh, other.tenthisinh);
	}
	
	
	
	
	
	

}
