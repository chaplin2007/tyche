package partner.model;

public class Cont_package_vo {
	
	private int cont_idx;
	private String cont_pack_idx;
	private String cont_pack_name;
	private String cont_user_name;
	private String cont_content;
	private String cont_user_phone;
	private String cont_call_date;
	private String cont_call_time;
	private String cont_status;
	private String cont_return_date;
	private String cont_submit_date;
	private Cont_package_vo() {
		super();
	}
	private Cont_package_vo(int cont_idx, String cont_pack_idx,
			String cont_pack_name, String cont_user_name, String cont_content,
			String cont_user_phone, String cont_call_date,
			String cont_call_time, String cont_status, String cont_return_date,
			String cont_submit_date) {
		super();
		this.cont_idx = cont_idx;
		this.cont_pack_idx = cont_pack_idx;
		this.cont_pack_name = cont_pack_name;
		this.cont_user_name = cont_user_name;
		this.cont_content = cont_content;
		this.cont_user_phone = cont_user_phone;
		this.cont_call_date = cont_call_date;
		this.cont_call_time = cont_call_time;
		this.cont_status = cont_status;
		this.cont_return_date = cont_return_date;
		this.cont_submit_date = cont_submit_date;
	}
	public int getCont_idx() {
		return cont_idx;
	}
	public String getCont_pack_idx() {
		return cont_pack_idx;
	}
	public String getCont_pack_name() {
		return cont_pack_name;
	}
	public String getCont_user_name() {
		return cont_user_name;
	}
	public String getCont_content() {
		return cont_content;
	}
	public String getCont_user_phone() {
		return cont_user_phone;
	}
	public String getCont_call_date() {
		return cont_call_date;
	}
	public String getCont_call_time() {
		return cont_call_time;
	}
	public String getCont_status() {
		return cont_status;
	}
	public String getCont_return_date() {
		return cont_return_date;
	}
	public String getCont_submit_date() {
		return cont_submit_date;
	}
	public void setCont_idx(int cont_idx) {
		this.cont_idx = cont_idx;
	}
	public void setCont_pack_idx(String cont_pack_idx) {
		this.cont_pack_idx = cont_pack_idx;
	}
	public void setCont_pack_name(String cont_pack_name) {
		this.cont_pack_name = cont_pack_name;
	}
	public void setCont_user_name(String cont_user_name) {
		this.cont_user_name = cont_user_name;
	}
	public void setCont_content(String cont_content) {
		this.cont_content = cont_content;
	}
	public void setCont_user_phone(String cont_user_phone) {
		this.cont_user_phone = cont_user_phone;
	}
	public void setCont_call_date(String cont_call_date) {
		this.cont_call_date = cont_call_date;
	}
	public void setCont_call_time(String cont_call_time) {
		this.cont_call_time = cont_call_time;
	}
	public void setCont_status(String cont_status) {
		this.cont_status = cont_status;
	}
	public void setCont_return_date(String cont_return_date) {
		this.cont_return_date = cont_return_date;
	}
	public void setCont_submit_date(String cont_submit_date) {
		this.cont_submit_date = cont_submit_date;
	}
	
}
