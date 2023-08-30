package kyj;

public class CrCenter {
	//필드 
	private int crid; // 어린이집 pk 코드
	private String stcode; //시설코드
	private String crname; //보육시설명
	private String craddr; //주소
	private String crtel; //전화번호
	private String crfax; //팩스번호
	private String crhome; //url 홈페이지 주소
	
	//생성자
	public CrCenter() {}
	public CrCenter(int crid, String stcode, String crname, String craddr, String crtel, String crfax, String crhome) {
		super();
		this.crid = crid;
		this.stcode = stcode;
		this.crname = crname;
		this.craddr = craddr;
		this.crtel = crtel;
		this.crfax = crfax;
		this.crhome = crhome;
	}

	public int getCrid() {
		return crid;
	}

	public void setCrid(int crid) {
		this.crid = crid;
	}

	public String getStcode() {
		return stcode;
	}

	public void setStcode(String stcode) {
		this.stcode = stcode;
	}

	public String getCrname() {
		return crname;
	}

	public void setCrname(String crname) {
		this.crname = crname;
	}

	public String getCraddr() {
		return craddr;
	}

	public void setCraddr(String craddr) {
		this.craddr = craddr;
	}

	public String getCrtel() {
		return crtel;
	}


	public void setCrtel(String crtel) {
		this.crtel = crtel;
	}


	public String getCrfax() {
		return crfax;
	}


	public void setCrfax(String crfax) {
		this.crfax = crfax;
	}


	public String getCrhome() {
		return crhome;
	}

	public void setCrhome(String crhome) {
		this.crhome = crhome;
	}

	@Override
	public String toString() {
		return crname + ": " + craddr + ", 전화번호)" + crtel
				+ ", 팩스)" + crfax + ", " + crhome + "]";
	}
	
	
	
	
	
}
