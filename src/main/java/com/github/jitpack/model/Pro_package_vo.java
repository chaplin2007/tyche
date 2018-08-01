package partner.model;

public class Pro_package_vo {
	
	private int pack_idx;
	private int pack_sort;
	private String pack_name;
	private String pack_pro_idx;
	private String pack_pro_cate;
	private String pack_pro_name;
	private String pack_pro_option;
	private String pack_pay;
	private String pack_people;
	private int pack_cnt;
	private int pack_stats_detail;
	private int pack_stats_submit;
	private int pack_stats_comple;
	private String pack_status;
	private String pack_end_date;
	private String pack_submit_date;
	private Pro_package_vo() {
		super();
	}
	private Pro_package_vo(int pack_idx, int pack_sort, String pack_name,
			String pack_pro_idx, String pack_pro_cate, String pack_pro_name,
			String pack_pro_option, String pack_pay, String pack_people,
			int pack_cnt, int pack_stats_detail, int pack_stats_submit,
			int pack_stats_comple, String pack_status, String pack_end_date,
			String pack_submit_date) {
		super();
		this.pack_idx = pack_idx;
		this.pack_sort = pack_sort;
		this.pack_name = pack_name;
		this.pack_pro_idx = pack_pro_idx;
		this.pack_pro_cate = pack_pro_cate;
		this.pack_pro_name = pack_pro_name;
		this.pack_pro_option = pack_pro_option;
		this.pack_pay = pack_pay;
		this.pack_people = pack_people;
		this.pack_cnt = pack_cnt;
		this.pack_stats_detail = pack_stats_detail;
		this.pack_stats_submit = pack_stats_submit;
		this.pack_stats_comple = pack_stats_comple;
		this.pack_status = pack_status;
		this.pack_end_date = pack_end_date;
		this.pack_submit_date = pack_submit_date;
	}
	public int getPack_idx() {
		return pack_idx;
	}
	public int getPack_sort() {
		return pack_sort;
	}
	public String getPack_name() {
		return pack_name;
	}
	public String getPack_pro_idx() {
		return pack_pro_idx;
	}
	public String getPack_pro_cate() {
		return pack_pro_cate;
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
	public String getPack_people() {
		return pack_people;
	}
	public int getPack_cnt() {
		return pack_cnt;
	}
	public int getPack_stats_detail() {
		return pack_stats_detail;
	}
	public int getPack_stats_submit() {
		return pack_stats_submit;
	}
	public int getPack_stats_comple() {
		return pack_stats_comple;
	}
	public String getPack_status() {
		return pack_status;
	}
	public String getPack_end_date() {
		return pack_end_date;
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
	public void setPack_name(String pack_name) {
		this.pack_name = pack_name;
	}
	public void setPack_pro_idx(String pack_pro_idx) {
		this.pack_pro_idx = pack_pro_idx;
	}
	public void setPack_pro_cate(String pack_pro_cate) {
		this.pack_pro_cate = pack_pro_cate;
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
	public void setPack_people(String pack_people) {
		this.pack_people = pack_people;
	}
	public void setPack_cnt(int pack_cnt) {
		this.pack_cnt = pack_cnt;
	}
	public void setPack_stats_detail(int pack_stats_detail) {
		this.pack_stats_detail = pack_stats_detail;
	}
	public void setPack_stats_submit(int pack_stats_submit) {
		this.pack_stats_submit = pack_stats_submit;
	}
	public void setPack_stats_comple(int pack_stats_comple) {
		this.pack_stats_comple = pack_stats_comple;
	}
	public void setPack_status(String pack_status) {
		this.pack_status = pack_status;
	}
	public void setPack_end_date(String pack_end_date) {
		this.pack_end_date = pack_end_date;
	}
	public void setPack_submit_date(String pack_submit_date) {
		this.pack_submit_date = pack_submit_date;
	}
	
}
