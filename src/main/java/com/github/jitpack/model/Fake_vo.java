package partner.model;

public class Fake_vo {
	
	private int fake_idx;
	private String fake_etc1;
	private String fake_etc2;
	private String fake_etc3;
	private String fake_status;
	private String fake_cate;
	private String fake_submit_date;
	private Fake_vo() {
		super();
	}
	private Fake_vo(int fake_idx, String fake_etc1, String fake_etc2,
			String fake_etc3, String fake_status, String fake_cate,
			String fake_submit_date) {
		super();
		this.fake_idx = fake_idx;
		this.fake_etc1 = fake_etc1;
		this.fake_etc2 = fake_etc2;
		this.fake_etc3 = fake_etc3;
		this.fake_status = fake_status;
		this.fake_cate = fake_cate;
		this.fake_submit_date = fake_submit_date;
	}
	public int getFake_idx() {
		return fake_idx;
	}
	public String getFake_etc1() {
		return fake_etc1;
	}
	public String getFake_etc2() {
		return fake_etc2;
	}
	public String getFake_etc3() {
		return fake_etc3;
	}
	public String getFake_status() {
		return fake_status;
	}
	public String getFake_cate() {
		return fake_cate;
	}
	public String getFake_submit_date() {
		return fake_submit_date;
	}
	public void setFake_idx(int fake_idx) {
		this.fake_idx = fake_idx;
	}
	public void setFake_etc1(String fake_etc1) {
		this.fake_etc1 = fake_etc1;
	}
	public void setFake_etc2(String fake_etc2) {
		this.fake_etc2 = fake_etc2;
	}
	public void setFake_etc3(String fake_etc3) {
		this.fake_etc3 = fake_etc3;
	}
	public void setFake_status(String fake_status) {
		this.fake_status = fake_status;
	}
	public void setFake_cate(String fake_cate) {
		this.fake_cate = fake_cate;
	}
	public void setFake_submit_date(String fake_submit_date) {
		this.fake_submit_date = fake_submit_date;
	}
	
	
}
