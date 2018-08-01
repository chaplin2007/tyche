package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Est_honey_dao extends SqlSessionDaoSupport{

	public List<Est_honey_vo> selEst_honey(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Est_honey_vo> list = getSqlSession().selectList("selEst_hoeny", map);
		return list;
	}

	public void insEst_hoeny(int user_idx, String est_name, String est_phone, String est_schedule, String est_honey_schedule
			, String est_honey_money, String est_honey_destination,
			String est_honey_style, String est_etc, String est_etc2) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("est_user_idx",user_idx);
		map.put("est_name", est_name);
		map.put("est_phone", est_phone);
		map.put("est_schedule", est_schedule);
		map.put("est_honey_schedule", est_honey_schedule);
		map.put("est_honey_money", est_honey_money);
		map.put("est_honey_destination", est_honey_destination);
		map.put("est_honey_style", est_honey_style);
		map.put("est_etc", est_etc);
		map.put("est_etc2", est_etc2);
		
		getSqlSession().insert("insEst_honey", map);
	}
	
}


