package model;

import java.util.ArrayList;
import java.util.Objects;

public class tinh {
	
	private int matinh;
	private String tentinh;
	
	
	public tinh(int matinh, String tentinh) {
		super();
		this.matinh = matinh;
		this.tentinh = tentinh;
	}


	public int getMatinh() {
		return matinh;
	}


	public void setMatinh(int matinh) {
		this.matinh = matinh;
	}


	public String getTentinh() {
		return tentinh;
	}


	public void setTentinh(String tentinh) {
		this.tentinh = tentinh;
	}


	@Override
	public String toString() {
		return "tinh [matinh=" + matinh + ", tentinh=" + tentinh + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(matinh, tentinh);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		tinh other = (tinh) obj;
		return matinh == other.matinh && Objects.equals(tentinh, other.tentinh);
	}
	
	public static ArrayList<tinh> getDStinh(){
		String[] arr_tinh = {"An Giang",
				"Bà Rịa - Vũng Tàu",
				"Bắc Giang",
				"Bắc Kạn",
				"Bạc Liêu",
				"Bắc Ninh",
				"Bến Tre",
				"Bình Định",
				"Bình Dương",
				"Bình Phước",
				"Bình Thuận",
				"Cà Mau",
				"Cần Thơ",
				"Cao Bằng",
				"Đà Nẵng",
				"Đắk Lắk",
				"Đắk Nông",
				"Điện Biên",
				"Đồng Nai",
				"Đồng Tháp",
				"Gia Lai",
				"Hà Giang",
				"Hà Nam",
				"Hà Nội",
				"Hà Tĩnh",
				"Hải Dương",
				"Hải Phòng",
				"Hậu Giang",
				"Hòa Bình",
				"Hưng Yên",
				"Khánh Hòa",
				"Kiên Giang",
				"Kon Tum",
				"Lai Châu",
				"Lâm Đồng",
				"Lạng Sơn",
				"Lào Cai",
				"Long An",
				"Nam Định",
				"Nghệ An",
				"Ninh Bình",
				"Ninh Thuận",
				"Phú Thọ",
				"Phú Yên",
				"Quảng Bình",
				"Quảng Nam",
				"Quảng Ngãi",
				"Quảng Ninh",
				"Quảng Trị",
				"Sóc Trăng",
				"Sơn La",
				"Tây Ninh",
				"Thái Bình",
				"Thái Nguyên",
				"Thanh Hóa",
				"Thừa Thiên Huế",
				"Tiền Giang",
				"TP. Hồ Chí Minh",
				"Trà Vinh",
				"Tuyên Quang",
				"Vĩnh Long",
				"Vĩnh Phúc",
				"Yên Bái"
	};
	
		ArrayList<tinh> listTinh = new ArrayList<tinh>();
		int i = 0;
		for (String tentinh : arr_tinh) {
			tinh t  = new tinh(i,tentinh);
			listTinh.add(t);
		}
		return listTinh;
	
	}
	
	public static tinh gettinh(int quequan) {
		return tinh.getDStinh().get(quequan-1);
	}


	public static tinh getTinhByTen(String string) {
		ArrayList<tinh> t = tinh.getDStinh();
		for (tinh tinh1 : t ) {
			if(tinh1.tentinh.equals(string))
				return tinh1;
		}
		return null;
	}

}
