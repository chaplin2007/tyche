package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Cont_hall_dao extends SqlSessionDaoSupport{

	public void insCont_hall(String cont_user_idx, String cont_pro_idx, String cont_com_idx, String cont_name_m, String cont_name_w, String cont_tel_m,
			String cont_tel_w, String cont_email_m, String cont_email_w, String cont_name, String cont_schedule, String cont_person,
			String cont_memo, String cont_hall_persons, String cont_hall_tel, String cont_hall_fax, String cont_order_persons, 
			String cont_order_tel, String cont_order_fax, String cont_order_date) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("cont_user_idx",cont_user_idx);
		map.put("cont_pro_idx",cont_pro_idx);
		map.put("cont_com_idx",cont_com_idx);
		map.put("cont_name_m",cont_name_m);
		map.put("cont_name_w",cont_name_w);
		map.put("cont_tel_m",cont_tel_m);
		map.put("cont_tel_w",cont_tel_w);
		map.put("cont_email_m",cont_email_m);
		map.put("cont_email_w",cont_email_w);
		map.put("cont_name",cont_name);
		map.put("cont_schedule",cont_schedule);
		map.put("cont_person",cont_person);
		map.put("cont_memo",cont_memo);
		map.put("cont_hall_persons",cont_hall_persons);
		map.put("cont_hall_tel",cont_hall_tel);
		map.put("cont_hall_fax",cont_hall_fax);
		map.put("cont_order_persons",cont_order_persons);
		map.put("cont_order_tel",cont_order_tel);
		map.put("cont_order_fax",cont_order_fax);
		map.put("cont_order_date",cont_order_date);
		
		getSqlSession().insert("insCont_hall", map);
		
	}

	public List<Cont_hall_vo> selCont_hall(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Cont_hall_vo> list = getSqlSession().selectList("selCont_hall", map);
		return list;
	}

	public void cancleCont_hall(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().update("cancleCont_hall", map);
	}

	public void delUserData_cont_hall(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_idx", user_idx);
		getSqlSession().delete("delUserData_cont_hall", map);
	}


}
