package partner.model;

public class Cont_drawer_vo {
	
	private int cont_idx;
	private String cont_cate;
	private String cont_pro_name;
	private String cont_name;
	private String cont_phone;
	private String cont_call_time;
	private String cont_content;
	private String cont_status;
	private String cont_return_date;
	private String cont_submit_date;
	private Cont_drawer_vo() {
		super();
	}
	private Cont_drawer_vo(int cont_idx, String cont_cate,
			String cont_pro_name, String cont_name, String cont_phone,
			String cont_call_time, String cont_content, String cont_status,
			String cont_return_date, String cont_submit_date) {
		super();
		this.cont_idx = cont_idx;
		this.cont_cate = cont_cate;
		this.cont_pro_name = cont_pro_name;
		this.cont_name = cont_name;
		this.cont_phone = cont_phone;
		this.cont_call_time = cont_call_time;
		this.cont_content = cont_content;
		this.cont_status = cont_status;
		this.cont_return_date = cont_return_date;
		this.cont_submit_date = cont_submit_date;
	}
	public int getCont_idx() {
		return cont_idx;
	}
	public String getCont_cate() {
		return cont_cate;
	}
	public String getCont_pro_name() {
		return cont_pro_name;
	}
	public String getCont_name() {
		return cont_name;
	}
	public String getCont_phone() {
		return cont_phone;
	}
	public String getCont_call_time() {
		return cont_call_time;
	}
	public String getCont_content() {
		return cont_content;
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
	public void setCont_cate(String cont_cate) {
		this.cont_cate = cont_cate;
	}
	public void setCont_pro_name(String cont_pro_name) {
		this.cont_pro_name = cont_pro_name;
	}
	public void setCont_name(String cont_name) {
		this.cont_name = cont_name;
	}
	public void setCont_phone(String cont_phone) {
		this.cont_phone = cont_phone;
	}
	public void setCont_call_time(String cont_call_time) {
		this.cont_call_time = cont_call_time;
	}
	public void setCont_content(String cont_content) {
		this.cont_content = cont_content;
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
