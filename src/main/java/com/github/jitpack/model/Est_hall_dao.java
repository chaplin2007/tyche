package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Est_hall_dao extends SqlSessionDaoSupport{

	public List<Est_hall_vo> selEst_hall(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Est_hall_vo> list = getSqlSession().selectList("selEst_hall", map);
		return list;
	}

	public void insEst_hall(int user_idx, String est_schedule, String est_addr1, String est_addr2, String est_want_hall, String est_want_date, String est_hall_type,
			String est_menu, String est_wedding_type, String est_people, String est_name, String est_phone, String est_memo, String est_status,
			String est_history) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("est_user_idx",user_idx);
		map.put("est_name", est_name);
		map.put("est_phone", est_phone);
		map.put("est_schedule", est_schedule);
		map.put("est_addr1", est_addr1);
		map.put("est_addr2", est_addr2);
		map.put("est_want_hall", est_want_hall);
		map.put("est_want_date", est_want_date);
		map.put("est_hall_type", est_hall_type);
		map.put("est_wedding_type", est_wedding_type);
		map.put("est_menu", est_menu);
		map.put("est_people", est_people);
		map.put("est_memo", est_memo);
		map.put("est_status", est_status);
		map.put("est_history", est_history);
		
		getSqlSession().insert("insEst_hall", map);
	}

	public void upEst_status_hall(int est_idx, String est_status, String est_history) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("est_idx",est_idx);
		map.put("est_status",est_status);
		map.put("est_history",est_history);
		
		getSqlSession().update("upEst_status_hall", map);
	}

	public void upEst_bank_hall(int bank_idx, String est_bank) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("est_idx",bank_idx);
		map.put("est_bank",est_bank);
		
		getSqlSession().update("upEst_bank_hall", map);
	}

	public void upEst_comment_hall(int comment_idx, String est_comment) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("est_idx",comment_idx);
		map.put("est_comment",est_comment);
		
		getSqlSession().update("upEst_comment_hall", map);
	}

	public void submitEst(int est_idx, String est_product) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("est_idx",est_idx);
		map.put("est_product",est_product);
		
		getSqlSession().update("submitEst", map);
	}

	public void upEst_res_hall(int res_idx, String est_res_date) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("est_idx",res_idx);
		map.put("est_res_date",est_res_date);
		
		getSqlSession().update("upEst_res_hall", map);
	}

	public void delUserData_est_hall(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_idx", user_idx);
		getSqlSession().delete("delUserData_est_hall", map);
	}

	public void getMoney(int est_idx, String est_product) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("est_idx", est_idx);
		map.put("est_product", est_product);
		getSqlSession().update("getMoney", map);
	}
	

}
