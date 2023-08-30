package exam01;

public class SeoulLocationVO {
	private int no;
	private String title;
	private String titleInfo;
	private String address;
	private String phone;
	private String info;
	private String traffic;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleInfo() {
		return titleInfo;
	}

	public void setTitleInfo(String titleInfo) {
		this.titleInfo = titleInfo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getTraffic() {
		return traffic;
	}

	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}

	@Override
	public String toString() {
		return "SeoulLocationVo [no=" + no + ", title=" + title + ", titleInfo=" + titleInfo + ", address=" + address
				+ ", phone=" + phone + ", info=" + info + ", traffic=" + traffic + "]";
	}

}
