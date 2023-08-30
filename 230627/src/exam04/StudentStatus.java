package exam04;

public class StudentStatus {

	private int studentId;
	private String email;
	private int kScore;
	private int eScore;
	private int mScore;
	private int sScore;
	private int hScore;
	private int totalScore;
	private String tCode;
	private String achivement;
	private String locationCode;

	public StudentStatus() {

	}

	public StudentStatus(int sutdentId, String email, int kScore, int eScore, int mScore, int sScore, int hScore,
			int totalScore, String tCode, String achivement, String locationCode) {
		super();
		this.studentId = sutdentId;
		this.email = email;
		this.kScore = kScore;
		this.eScore = eScore;
		this.mScore = mScore;
		this.sScore = sScore;
		this.hScore = hScore;
		this.totalScore = totalScore;
		this.tCode = tCode;
		this.achivement = achivement;
		this.locationCode = locationCode;
	}

	public int sumKEscore() {
		return kScore + eScore;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setSutdentId(int sutdentId) {
		this.studentId = sutdentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getkScore() {
		return kScore;
	}

	public void setkScore(int kScore) {
		this.kScore = kScore;
	}

	public int geteScore() {
		return eScore;
	}

	public void seteScore(int eScore) {
		this.eScore = eScore;
	}

	public int getmScore() {
		return mScore;
	}

	public void setmScore(int mScore) {
		this.mScore = mScore;
	}

	public int getsScore() {
		return sScore;
	}

	public void setsScore(int sScore) {
		this.sScore = sScore;
	}

	public int gethScore() {
		return hScore;
	}

	public void sethScore(int hScore) {
		this.hScore = hScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String gettCode() {
		return tCode;
	}

	public void settCode(String tCode) {
		this.tCode = tCode;
	}

	public String getAchivement() {
		return achivement;
	}

	public void setAchivement(String achivement) {
		this.achivement = achivement;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

}
