package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Cont_other_dao extends SqlSessionDaoSupport{

	public List<Cont_other_vo> selCont_other(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Cont_other_vo> list = getSqlSession().selectList("selCont_other", map);
		return list;
	}

	public void insCont_other(String cont_user_idx, String cont_pro_idx, String cont_com_idx, String cont_com_category,
			String cont_name_m, String cont_name_w, String cont_tel_m, String cont_tel_w, String cont_email_m,
			String cont_email_w, String cont_name, String cont_composition, String cont_pay, String cont_date, String cont_column1,
			String cont_column2, String cont_column3, String cont_column4, String cont_column5, String cont_notice, String cont_memo) {

		HashMap<String, Object> map = new HashMap<>();
		
		map.put("cont_user_idx",cont_user_idx);
		map.put("cont_pro_idx",cont_pro_idx);
		map.put("cont_com_idx",cont_com_idx);
		map.put("cont_com_category",cont_com_category);
		map.put("cont_name_m",cont_name_m);
		map.put("cont_name_w",cont_name_w);
		map.put("cont_tel_m",cont_tel_m);
		map.put("cont_tel_w",cont_tel_w);
		map.put("cont_email_m",cont_email_m);
		map.put("cont_email_w",cont_email_w);
		map.put("cont_name",cont_name);
		map.put("cont_composition",cont_composition);
		map.put("cont_pay",cont_pay);
		map.put("cont_date",cont_date);
		map.put("cont_column1",cont_column1);
		map.put("cont_column2",cont_column2);
		map.put("cont_column3",cont_column3);
		map.put("cont_column4",cont_column4);
		map.put("cont_column5",cont_column5);
		map.put("cont_notice",cont_notice);
		map.put("cont_memo",cont_memo);
		
		getSqlSession().insert("insCont_other", map);
	}

	public void delUserData_cont_other(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_idx", user_idx);
		getSqlSession().delete("delUserData_cont_other", map);
	}

}
