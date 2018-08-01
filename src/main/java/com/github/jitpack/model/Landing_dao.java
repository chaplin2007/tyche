package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Landing_dao extends SqlSessionDaoSupport{

	public List<Landing_vo> selLanding(String query) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("query",query);
		List<Landing_vo> list = getSqlSession().selectList("selLanding", map);
		return list;
	}

	public void insLanding(String lan_site, String lan_agent, String lan_name, String lan_gender, String lan_phone, String lan_due_date) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("lan_site",lan_site);
		map.put("lan_agent",lan_agent);
		map.put("lan_name",lan_name);
		map.put("lan_gender",lan_gender);
		map.put("lan_phone",lan_phone);
		map.put("lan_due_date",lan_due_date);
		
		getSqlSession().insert("insLanding", map);
		
	}
}
