package partner.model;

public class Message_vo {
	private int msg_idx;
	private int msg_est_idx;
	private int msg_user_idx;
	private String msg_user_name;
	private String msg_content;
	private String msg_status;
	private String msg_notice;
	private String msg_submit_date;
	private Message_vo() {
		super();
	}
	private Message_vo(int msg_idx, int msg_est_idx, int msg_user_idx,
			String msg_user_name, String msg_content, String msg_status,
			String msg_notice, String msg_submit_date) {
		super();
		this.msg_idx = msg_idx;
		this.msg_est_idx = msg_est_idx;
		this.msg_user_idx = msg_user_idx;
		this.msg_user_name = msg_user_name;
		this.msg_content = msg_content;
		this.msg_status = msg_status;
		this.msg_notice = msg_notice;
		this.msg_submit_date = msg_submit_date;
	}
	public int getMsg_idx() {
		return msg_idx;
	}
	public int getMsg_est_idx() {
		return msg_est_idx;
	}
	public int getMsg_user_idx() {
		return msg_user_idx;
	}
	public String getMsg_user_name() {
		return msg_user_name;
	}
	public String getMsg_content() {
		return msg_content;
	}
	public String getMsg_status() {
		return msg_status;
	}
	public String getMsg_notice() {
		return msg_notice;
	}
	public String getMsg_submit_date() {
		return msg_submit_date;
	}
	public void setMsg_idx(int msg_idx) {
		this.msg_idx = msg_idx;
	}
	public void setMsg_est_idx(int msg_est_idx) {
		this.msg_est_idx = msg_est_idx;
	}
	public void setMsg_user_idx(int msg_user_idx) {
		this.msg_user_idx = msg_user_idx;
	}
	public void setMsg_user_name(String msg_user_name) {
		this.msg_user_name = msg_user_name;
	}
	public void setMsg_content(String msg_content) {
		this.msg_content = msg_content;
	}
	public void setMsg_status(String msg_status) {
		this.msg_status = msg_status;
	}
	public void setMsg_notice(String msg_notice) {
		this.msg_notice = msg_notice;
	}
	public void setMsg_submit_date(String msg_submit_date) {
		this.msg_submit_date = msg_submit_date;
	}

}
