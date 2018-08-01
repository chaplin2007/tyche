package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Message_dao extends SqlSessionDaoSupport{

	public void insMessage(int msg_est_idx, int msg_user_idx, String msg_content) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("msg_est_idx",msg_est_idx);
		map.put("msg_user_idx",msg_user_idx);
		map.put("msg_content",msg_content);
		
		getSqlSession().insert("insMessage", map);
	}

	public List<Message_vo> getMessage(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("msg_user_idx",user_idx);
		List<Message_vo> list = getSqlSession().selectList("getMessage", map);
		return list;
	}
	public List<Message_vo> getMessage_query(String query) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("query",query);
		List<Message_vo> list = getSqlSession().selectList("getMessage_query", map);
		return list;
	}
	public List<Message_vo> getMessage_notice(String query) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("query",query);
		List<Message_vo> list = getSqlSession().selectList("getMessage_notice", map);
		return list;
	}

	public void delUserData_message(int user_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("user_idx", user_idx);
		getSqlSession().delete("delUserData_message", map);
	}

	public void upMessage(int msg_idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("msg_idx", msg_idx);
		getSqlSession().update("upMessage", map);
	}

	public void insMessage_notice(int msg_est_idx, int msg_user_idx, String msg_content, String msg_notice) {
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("msg_est_idx",msg_est_idx);
		map.put("msg_user_idx",msg_user_idx);
		map.put("msg_content",msg_content);
		map.put("msg_notice",msg_notice);
		
		getSqlSession().insert("insMessage_notice", map);
	}

}
