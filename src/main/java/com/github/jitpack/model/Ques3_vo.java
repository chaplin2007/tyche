package partner.model;

public class Ques3_vo {
	private int ques_idx;
	private String ques_cate;
	private String ques_title;
	private String ques_card1;
	private String ques_card2;
	private String ques_card3;
	private String ques_card4;
	private int ques_card_cnt;
	private String ques_submit_date;
	private Ques3_vo() {
		super();
	}
	private Ques3_vo(int ques_idx, String ques_cate, String ques_title,
			String ques_card1, String ques_card2, String ques_card3,
			String ques_card4, int ques_card_cnt, String ques_submit_date) {
		super();
		this.ques_idx = ques_idx;
		this.ques_cate = ques_cate;
		this.ques_title = ques_title;
		this.ques_card1 = ques_card1;
		this.ques_card2 = ques_card2;
		this.ques_card3 = ques_card3;
		this.ques_card4 = ques_card4;
		this.ques_card_cnt = ques_card_cnt;
		this.ques_submit_date = ques_submit_date;
	}
	public int getQues_idx() {
		return ques_idx;
	}
	public String getQues_cate() {
		return ques_cate;
	}
	public String getQues_title() {
		return ques_title;
	}
	public String getQues_card1() {
		return ques_card1;
	}
	public String getQues_card2() {
		return ques_card2;
	}
	public String getQues_card3() {
		return ques_card3;
	}
	public String getQues_card4() {
		return ques_card4;
	}
	public int getQues_card_cnt() {
		return ques_card_cnt;
	}
	public String getQues_submit_date() {
		return ques_submit_date;
	}
	public void setQues_idx(int ques_idx) {
		this.ques_idx = ques_idx;
	}
	public void setQues_cate(String ques_cate) {
		this.ques_cate = ques_cate;
	}
	public void setQues_title(String ques_title) {
		this.ques_title = ques_title;
	}
	public void setQues_card1(String ques_card1) {
		this.ques_card1 = ques_card1;
	}
	public void setQues_card2(String ques_card2) {
		this.ques_card2 = ques_card2;
	}
	public void setQues_card3(String ques_card3) {
		this.ques_card3 = ques_card3;
	}
	public void setQues_card4(String ques_card4) {
		this.ques_card4 = ques_card4;
	}
	public void setQues_card_cnt(int ques_card_cnt) {
		this.ques_card_cnt = ques_card_cnt;
	}
	public void setQues_submit_date(String ques_submit_date) {
		this.ques_submit_date = ques_submit_date;
	}
	
}
