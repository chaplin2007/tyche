package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Cont_drawer_dao extends SqlSessionDaoSupport{

	public void insCont_drawer(String cont_cate, String cont_pro_name, String cont_name, String cont_phone, String cont_call_time, String cont_content) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("cont_cate",cont_cate);
		map.put("cont_pro_name",cont_pro_name);
		map.put("cont_name",cont_name);
		map.put("cont_phone",cont_phone);
		map.put("cont_call_time",cont_call_time);
		map.put("cont_content",cont_content);
		
		getSqlSession().insert("insCont_drawer", map);
	}
	
	public List<Cont_drawer_vo> selCont_drawer(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Cont_drawer_vo> list = getSqlSession().selectList("selCont_drawer", map);
		return list;
	}
	public void upCont_drawer_status(int cont_idx, String cont_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("cont_idx",cont_idx);
		map.put("cont_status",cont_status);
		
		getSqlSession().update("upCont_drawer_status", map);
	}
}
