package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Cont_package_dao extends SqlSessionDaoSupport{

	public void insCont_package(int cont_pack_idx, String cont_pack_name, String cont_user_name, String cont_content, String cont_user_phone,
			String cont_call_date, String cont_call_time) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("cont_pack_idx",cont_pack_idx);
		map.put("cont_pack_name",cont_pack_name);
		map.put("cont_user_name",cont_user_name);
		map.put("cont_content",cont_content);
		map.put("cont_user_phone",cont_user_phone);
		map.put("cont_call_date",cont_call_date);
		map.put("cont_call_time",cont_call_time);
		
		getSqlSession().insert("insCont_package", map);
	}
	
	public List<Cont_package_vo> selCont_package(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Cont_package_vo> list = getSqlSession().selectList("selCont_package", map);
		return list;
	}
	public void upCont_package_status(int cont_idx, String cont_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("cont_idx",cont_idx);
		map.put("cont_status",cont_status);
		
		getSqlSession().update("upCont_package_status", map);
	}
}
