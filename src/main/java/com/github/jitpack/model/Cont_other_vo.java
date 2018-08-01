package partner.model;

public class Cont_other_vo {
	
	//스튜디오, 드레스, 메이크업, 본식스냅 ★ 예복, 한복, 예물, 폐백
	
	private int cont_idx;
	private int cont_user_idx;
	private int cont_pro_idx;
	private int cont_com_idx;
	private String cont_com_category;
	private String cont_name_m;
	private String cont_name_w;
	private String cont_tel_m;
	private String cont_tel_w;
	private String cont_email_m;
	private String cont_email_w;
	private String cont_name;
	private String cont_composition; //상품구성
	private String cont_pay; //금액
	private String cont_date; //계약일
	private String cont_column1; // 택배수령주소, 공백, 공백, 택배수령주소 ★ 서비스, 서비스, 서비스, 공백
	private String cont_column2; //공백, 촬영장소, 촬영장소, 공백 ★ 촬영일, 촬영일, 촬영일, 예식장소
	private String cont_column3; //촬영일, 촬영일, 촬영일, 촬영일 ★ 납품일1, 납품일1, 납품일, 납품일 //진행일
	private String cont_column4; //앨범납품일, 예식장소, 예식장소, 앨범납품일 ★ 납품일2, 납품일2, 공백, 공백
	private String cont_column5; //예식일, 예식일, 예식일, 예식일 ★ 예식일, 예식일, 예식일, 예식일
	private String cont_notice; //해약안내
	private String cont_memo; //비고
	private String cont_cancle_date;
	private String cont_status;
	private String cont_submit_date;
	
	private Cont_other_vo() {
		super();
	}

	private Cont_other_vo(int cont_idx, int cont_user_idx, int cont_pro_idx,
			int cont_com_idx, String cont_com_category, String cont_name_m,
			String cont_name_w, String cont_tel_m, String cont_tel_w,
			String cont_email_m, String cont_email_w, String cont_name,
			String cont_composition, String cont_pay, String cont_date,
			String cont_column1, String cont_column2, String cont_column3,
			String cont_column4, String cont_column5, String cont_notice,
			String cont_memo, String cont_cancle_date, String cont_status,
			String cont_submit_date) {
		super();
		this.cont_idx = cont_idx;
		this.cont_user_idx = cont_user_idx;
		this.cont_pro_idx = cont_pro_idx;
		this.cont_com_idx = cont_com_idx;
		this.cont_com_category = cont_com_category;
		this.cont_name_m = cont_name_m;
		this.cont_name_w = cont_name_w;
		this.cont_tel_m = cont_tel_m;
		this.cont_tel_w = cont_tel_w;
		this.cont_email_m = cont_email_m;
		this.cont_email_w = cont_email_w;
		this.cont_name = cont_name;
		this.cont_composition = cont_composition;
		this.cont_pay = cont_pay;
		this.cont_date = cont_date;
		this.cont_column1 = cont_column1;
		this.cont_column2 = cont_column2;
		this.cont_column3 = cont_column3;
		this.cont_column4 = cont_column4;
		this.cont_column5 = cont_column5;
		this.cont_notice = cont_notice;
		this.cont_memo = cont_memo;
		this.cont_cancle_date = cont_cancle_date;
		this.cont_status = cont_status;
		this.cont_submit_date = cont_submit_date;
	}

	public int getCont_idx() {
		return cont_idx;
	}

	public int getCont_user_idx() {
		return cont_user_idx;
	}

	public int getCont_pro_idx() {
		return cont_pro_idx;
	}

	public int getCont_com_idx() {
		return cont_com_idx;
	}

	public String getCont_com_category() {
		return cont_com_category;
	}

	public String getCont_name_m() {
		return cont_name_m;
	}

	public String getCont_name_w() {
		return cont_name_w;
	}

	public String getCont_tel_m() {
		return cont_tel_m;
	}

	public String getCont_tel_w() {
		return cont_tel_w;
	}

	public String getCont_email_m() {
		return cont_email_m;
	}

	public String getCont_email_w() {
		return cont_email_w;
	}

	public String getCont_name() {
		return cont_name;
	}

	public String getCont_composition() {
		return cont_composition;
	}

	public String getCont_pay() {
		return cont_pay;
	}

	public String getCont_date() {
		return cont_date;
	}

	public String getCont_column1() {
		return cont_column1;
	}

	public String getCont_column2() {
		return cont_column2;
	}

	public String getCont_column3() {
		return cont_column3;
	}

	public String getCont_column4() {
		return cont_column4;
	}

	public String getCont_column5() {
		return cont_column5;
	}

	public String getCont_notice() {
		return cont_notice;
	}

	public String getCont_memo() {
		return cont_memo;
	}

	public String getCont_cancle_date() {
		return cont_cancle_date;
	}

	public String getCont_status() {
		return cont_status;
	}

	public String getCont_submit_date() {
		return cont_submit_date;
	}

	public void setCont_idx(int cont_idx) {
		this.cont_idx = cont_idx;
	}

	public void setCont_user_idx(int cont_user_idx) {
		this.cont_user_idx = cont_user_idx;
	}

	public void setCont_pro_idx(int cont_pro_idx) {
		this.cont_pro_idx = cont_pro_idx;
	}

	public void setCont_com_idx(int cont_com_idx) {
		this.cont_com_idx = cont_com_idx;
	}

	public void setCont_com_category(String cont_com_category) {
		this.cont_com_category = cont_com_category;
	}

	public void setCont_name_m(String cont_name_m) {
		this.cont_name_m = cont_name_m;
	}

	public void setCont_name_w(String cont_name_w) {
		this.cont_name_w = cont_name_w;
	}

	public void setCont_tel_m(String cont_tel_m) {
		this.cont_tel_m = cont_tel_m;
	}

	public void setCont_tel_w(String cont_tel_w) {
		this.cont_tel_w = cont_tel_w;
	}

	public void setCont_email_m(String cont_email_m) {
		this.cont_email_m = cont_email_m;
	}

	public void setCont_email_w(String cont_email_w) {
		this.cont_email_w = cont_email_w;
	}

	public void setCont_name(String cont_name) {
		this.cont_name = cont_name;
	}

	public void setCont_composition(String cont_composition) {
		this.cont_composition = cont_composition;
	}

	public void setCont_pay(String cont_pay) {
		this.cont_pay = cont_pay;
	}

	public void setCont_date(String cont_date) {
		this.cont_date = cont_date;
	}

	public void setCont_column1(String cont_column1) {
		this.cont_column1 = cont_column1;
	}

	public void setCont_column2(String cont_column2) {
		this.cont_column2 = cont_column2;
	}

	public void setCont_column3(String cont_column3) {
		this.cont_column3 = cont_column3;
	}

	public void setCont_column4(String cont_column4) {
		this.cont_column4 = cont_column4;
	}

	public void setCont_column5(String cont_column5) {
		this.cont_column5 = cont_column5;
	}

	public void setCont_notice(String cont_notice) {
		this.cont_notice = cont_notice;
	}

	public void setCont_memo(String cont_memo) {
		this.cont_memo = cont_memo;
	}

	public void setCont_cancle_date(String cont_cancle_date) {
		this.cont_cancle_date = cont_cancle_date;
	}

	public void setCont_status(String cont_status) {
		this.cont_status = cont_status;
	}

	public void setCont_submit_date(String cont_submit_date) {
		this.cont_submit_date = cont_submit_date;
	}

	
}
