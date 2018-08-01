package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Fake_dao extends SqlSessionDaoSupport{

	public List<Fake_vo> selFake(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Fake_vo> list = getSqlSession().selectList("selFake", map);
		return list;
	}

	public void insFake(String fake_etc1, String fake_etc2, String fake_etc3, String fake_cate, String fake_submit_date) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("fake_etc1", fake_etc1);
		map.put("fake_etc2", fake_etc2);
		map.put("fake_etc3", fake_etc3);
		map.put("fake_cate", fake_cate);
		map.put("fake_submit_date", fake_submit_date);
		getSqlSession().insert("insFake", map);
	}

	public void upFake_status(int fake_idx, String fake_status) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("fake_idx",fake_idx);
		map.put("fake_status",fake_status);
		
		getSqlSession().update("upFake_status", map);
	}

	public void delFake(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delFake", map);
	}

	public void upFake_status2(int fake_idx, String fake_etc3) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("fake_idx",fake_idx);
		map.put("fake_etc3",fake_etc3);
		
		getSqlSession().update("upFake_status2", map);
		
	}

}
