package kyr;

public class UserMode {
	private String loginMode;
	private boolean viewMode;
	
	UserMode() {
		this.loginMode = "U";
		this.viewMode = false;
	}
	
	public void setLoginMode(String loginMode) {
		this.loginMode = loginMode;
	}
	
	public String getLoginMode() {
		return loginMode;
	}
	
	public void setViewMode(boolean viewMode) {
		this.viewMode = viewMode;
	}
	
	public boolean getViewMode() {
		return viewMode;
	}
	
	public boolean isAdmin() {
		return loginMode.equals("U") ? false : true;
	}
}
