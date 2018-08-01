package partner.model;

public class Landing_vo {
	
	private int lan_idx;
	private String lan_site;
	private String lan_agent;
	private String lan_name;
	private String lan_gender;
	private String lan_phone;
	private String lan_due_date;
	private String lan_submit_date;
	private Landing_vo() {
		super();
	}
	private Landing_vo(int lan_idx, String lan_site, String lan_agent,
			String lan_name, String lan_gender, String lan_phone,
			String lan_due_date, String lan_submit_date) {
		super();
		this.lan_idx = lan_idx;
		this.lan_site = lan_site;
		this.lan_agent = lan_agent;
		this.lan_name = lan_name;
		this.lan_gender = lan_gender;
		this.lan_phone = lan_phone;
		this.lan_due_date = lan_due_date;
		this.lan_submit_date = lan_submit_date;
	}
	public int getLan_idx() {
		return lan_idx;
	}
	public String getLan_site() {
		return lan_site;
	}
	public String getLan_agent() {
		return lan_agent;
	}
	public String getLan_name() {
		return lan_name;
	}
	public String getLan_gender() {
		return lan_gender;
	}
	public String getLan_phone() {
		return lan_phone;
	}
	public String getLan_due_date() {
		return lan_due_date;
	}
	public String getLan_submit_date() {
		return lan_submit_date;
	}
	public void setLan_idx(int lan_idx) {
		this.lan_idx = lan_idx;
	}
	public void setLan_site(String lan_site) {
		this.lan_site = lan_site;
	}
	public void setLan_agent(String lan_agent) {
		this.lan_agent = lan_agent;
	}
	public void setLan_name(String lan_name) {
		this.lan_name = lan_name;
	}
	public void setLan_gender(String lan_gender) {
		this.lan_gender = lan_gender;
	}
	public void setLan_phone(String lan_phone) {
		this.lan_phone = lan_phone;
	}
	public void setLan_due_date(String lan_due_date) {
		this.lan_due_date = lan_due_date;
	}
	public void setLan_submit_date(String lan_submit_date) {
		this.lan_submit_date = lan_submit_date;
	}
	
	
}
