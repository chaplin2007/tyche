package partner.model;

public class Answer2_vo {
	
	private int ans_idx;
	private int ans_user;
	private String ans_data;
	private String ans_submit_date;
	private Answer2_vo() {
		super();
	}
	private Answer2_vo(int ans_idx, int ans_user, String ans_data,
			String ans_submit_date) {
		super();
		this.ans_idx = ans_idx;
		this.ans_user = ans_user;
		this.ans_data = ans_data;
		this.ans_submit_date = ans_submit_date;
	}
	public int getAns_idx() {
		return ans_idx;
	}
	public int getAns_user() {
		return ans_user;
	}
	public String getAns_data() {
		return ans_data;
	}
	public String getAns_submit_date() {
		return ans_submit_date;
	}
	public void setAns_idx(int ans_idx) {
		this.ans_idx = ans_idx;
	}
	public void setAns_user(int ans_user) {
		this.ans_user = ans_user;
	}
	public void setAns_data(String ans_data) {
		this.ans_data = ans_data;
	}
	public void setAns_submit_date(String ans_submit_date) {
		this.ans_submit_date = ans_submit_date;
	}
	
	
	
}
