package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Answer2_dao extends SqlSessionDaoSupport{

	public List<Answer2_vo> selAns_idx(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ans_user", user_idx);
		List<Answer2_vo> list = getSqlSession().selectList("selAns_idx", map);
		return list;
	}
	public List<Answer2_vo> selAns_all(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Answer2_vo> list = getSqlSession().selectList("selAns", map);
		return list;
	}
	
	public void upData(int user_idx, String data) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ans_user", user_idx);
		map.put("ans_data", data);
		getSqlSession().update("upData", map);
	}
	public void insData(int user_idx, String data) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ans_user", user_idx);
		map.put("ans_data", data);
		getSqlSession().insert("insData", map);
	}
	public void delUserData_ans2(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_idx", user_idx);
		getSqlSession().delete("delUserData_ans2", map);
	}

}
