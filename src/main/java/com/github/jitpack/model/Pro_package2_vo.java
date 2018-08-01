package partner.model;

public class Pro_package2_vo {
	
	private int pack_idx;
	private int pack_sort;
	private String pack_cate;
	private String pack_name;
	private String pack_pro_idx;
	private String pack_pro_name;
	private String pack_pro_option;
	private String pack_pay;
	private String pack_status;
	private String pack_submit_date;
	private Pro_package2_vo() {
		super();
	}
	private Pro_package2_vo(int pack_idx, int pack_sort, String pack_cate,
			String pack_name, String pack_pro_idx, String pack_pro_name,
			String pack_pro_option, String pack_pay, String pack_status,
			String pack_submit_date) {
		super();
		this.pack_idx = pack_idx;
		this.pack_sort = pack_sort;
		this.pack_cate = pack_cate;
		this.pack_name = pack_name;
		this.pack_pro_idx = pack_pro_idx;
		this.pack_pro_name = pack_pro_name;
		this.pack_pro_option = pack_pro_option;
		this.pack_pay = pack_pay;
		this.pack_status = pack_status;
		this.pack_submit_date = pack_submit_date;
	}
	public int getPack_idx() {
		return pack_idx;
	}
	public int getPack_sort() {
		return pack_sort;
	}
	public String getPack_cate() {
		return pack_cate;
	}
	public String getPack_name() {
		return pack_name;
	}
	public String getPack_pro_idx() {
		return pack_pro_idx;
	}
	public String getPack_pro_name() {
		return pack_pro_name;
	}
	public String getPack_pro_option() {
		return pack_pro_option;
	}
	public String getPack_pay() {
		return pack_pay;
	}
	public String getPack_status() {
		return pack_status;
	}
	public String getPack_submit_date() {
		return pack_submit_date;
	}
	public void setPack_idx(int pack_idx) {
		this.pack_idx = pack_idx;
	}
	public void setPack_sort(int pack_sort) {
		this.pack_sort = pack_sort;
	}
	public void setPack_cate(String pack_cate) {
		this.pack_cate = pack_cate;
	}
	public void setPack_name(String pack_name) {
		this.pack_name = pack_name;
	}
	public void setPack_pro_idx(String pack_pro_idx) {
		this.pack_pro_idx = pack_pro_idx;
	}
	public void setPack_pro_name(String pack_pro_name) {
		this.pack_pro_name = pack_pro_name;
	}
	public void setPack_pro_option(String pack_pro_option) {
		this.pack_pro_option = pack_pro_option;
	}
	public void setPack_pay(String pack_pay) {
		this.pack_pay = pack_pay;
	}
	public void setPack_status(String pack_status) {
		this.pack_status = pack_status;
	}
	public void setPack_submit_date(String pack_submit_date) {
		this.pack_submit_date = pack_submit_date;
	}
	
}
