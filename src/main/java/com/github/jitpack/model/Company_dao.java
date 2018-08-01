package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Company_dao extends SqlSessionDaoSupport{
	
	public List<Company_vo> overlap(String overlap_id) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("overlap_id", overlap_id);
		List<Company_vo> list = getSqlSession().selectList("overlap", map);
		return list;
	}

	public List<Company_vo> selIdx_company() {
		List<Company_vo> list = getSqlSession().selectList("selIdx_company");
		return list;
	}

	public void insCompany(int com_idx, String com_id, String com_pw, String com_persons, String com_persons_tel, String com_category, 
			String com_name, String com_ceo, String com_number, String com_condition, String com_type, String com_tel,
			String com_fax, String com_email, String com_homepage, String com_zipcode, String com_addr1, String com_addr2,
			String com_subway1, String com_subway2, String com_subway3, String com_bus, String com_pay_engine, String com_pay_number,String com_pay_name) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("com_idx", com_idx);
		map.put("com_id", com_id);
		map.put("com_pw", com_pw);
		map.put("com_persons", com_persons);
		map.put("com_persons_tel", com_persons_tel);
		map.put("com_category", com_category);
		map.put("com_name", com_name);
		map.put("com_ceo", com_ceo);
		map.put("com_number", com_number);
		map.put("com_condition", com_condition);
		map.put("com_type", com_type);
		map.put("com_tel", com_tel);
		map.put("com_fax", com_fax);
		map.put("com_email", com_email);
		map.put("com_homepage", com_homepage);
		map.put("com_zipcode", com_zipcode);
		map.put("com_addr1", com_addr1);
		map.put("com_addr2", com_addr2);
		map.put("com_subway1", com_subway1);
		map.put("com_subway2", com_subway2);
		map.put("com_subway3", com_subway3);
		map.put("com_bus", com_bus);
		map.put("com_pay_engine", com_pay_engine);
		map.put("com_pay_number", com_pay_number);
		map.put("com_pay_name", com_pay_name);
		
		getSqlSession().insert("insCompany", map);
	}

	public List<Company_vo> selList_company(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Company_vo> list = getSqlSession().selectList("selList_company", map);
		return list;
	}

	public void delCompany(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delCompany", map);
	}

	public void upComProName(String com_idx, String com_pro_name) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("com_idx", com_idx);
		map.put("com_pro_name", com_pro_name);
		getSqlSession().update("upComProName", map);
	}

	public void upCompany(int com_idx, String com_id, String com_pw, String com_persons, String com_persons_tel, String com_category, 
			String com_name, String com_ceo, String com_number, String com_condition, String com_type, String com_tel,
			String com_fax, String com_email, String com_homepage, String com_zipcode, String com_addr1, String com_addr2,
			String com_subway1, String com_subway2, String com_subway3, String com_bus, String com_pay_engine, String com_pay_number,String com_pay_name) {

		HashMap<String, Object> map = new HashMap<>();
		
		map.put("com_idx", com_idx);
		map.put("com_id", com_id);
		map.put("com_pw", com_pw);
		map.put("com_persons", com_persons);
		map.put("com_persons_tel", com_persons_tel);
		map.put("com_category", com_category);
		map.put("com_name", com_name);
		map.put("com_ceo", com_ceo);
		map.put("com_number", com_number);
		map.put("com_condition", com_condition);
		map.put("com_type", com_type);
		map.put("com_tel", com_tel);
		map.put("com_fax", com_fax);
		map.put("com_email", com_email);
		map.put("com_homepage", com_homepage);
		map.put("com_zipcode", com_zipcode);
		map.put("com_addr1", com_addr1);
		map.put("com_addr2", com_addr2);
		map.put("com_subway1", com_subway1);
		map.put("com_subway2", com_subway2);
		map.put("com_subway3", com_subway3);
		map.put("com_bus", com_bus);
		map.put("com_pay_engine", com_pay_engine);
		map.put("com_pay_number", com_pay_number);
		map.put("com_pay_name", com_pay_name);
		
		getSqlSession().update("upCompany", map);
		
	}

}
