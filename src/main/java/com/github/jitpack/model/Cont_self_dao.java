package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Cont_self_dao extends SqlSessionDaoSupport{

	public void insCont_self(int cont_user_idx, String cont_pro_idx, String cont_pro_name, String cont_pro_option, String cont_see_date, String cont_name, String cont_phone, String cont_call_time, String cont_content) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("cont_user_idx",cont_user_idx);
		map.put("cont_pro_idx",cont_pro_idx);
		map.put("cont_pro_name",cont_pro_name);
		map.put("cont_pro_option",cont_pro_option);
		map.put("cont_see_date",cont_see_date);
		map.put("cont_name",cont_name);
		map.put("cont_phone",cont_phone);
		map.put("cont_call_time",cont_call_time);
		map.put("cont_content",cont_content);
		
		getSqlSession().insert("insCont_self", map);
	}
	
	public List<Cont_self_vo> selCont_self(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Cont_self_vo> list = getSqlSession().selectList("selCont_self", map);
		return list;
	}
	public void upCont_self_status(int cont_idx, String cont_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("cont_idx",cont_idx);
		map.put("cont_status",cont_status);
		
		getSqlSession().update("upCont_self_status", map);
	}
}
