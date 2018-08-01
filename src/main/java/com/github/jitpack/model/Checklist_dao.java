package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Checklist_dao extends SqlSessionDaoSupport{

	public void insChk(int chk_user, String chk_meeting, String chk_hall,String chk_honey, String chk_package, String chk_suit,String chk_korea, 
			String chk_jewelry, String chk_gift,String chk_drawer, String chk_pb, String chk_card,String chk_prepare, String chk_other, String chk_seven) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_meeting", chk_meeting);
		map.put("chk_hall", chk_hall);
		map.put("chk_honey", chk_honey);
		map.put("chk_package", chk_package);
		map.put("chk_suit", chk_suit);
		map.put("chk_korea", chk_korea);
		map.put("chk_jewelry", chk_jewelry);
		map.put("chk_gift", chk_gift);
		map.put("chk_drawer", chk_drawer);
		map.put("chk_pb", chk_pb);
		map.put("chk_card", chk_card);
		map.put("chk_prepare", chk_prepare);
		map.put("chk_other", chk_other);
		map.put("chk_seven", chk_seven);
		getSqlSession().insert("insChk", map);
	}

	public List<Checklist_vo> selChk(int chk_user) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		List<Checklist_vo> list = getSqlSession().selectList("selChk", map);
		return list;
	}

	public void delChk(int chk_user) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		getSqlSession().delete("delChk", map);
	}

	public void upChk(int chk_user, String chk_meeting, String chk_hall,String chk_honey, String chk_package, String chk_suit,String chk_korea, 
			String chk_jewelry, String chk_gift,String chk_drawer, String chk_pb, String chk_card,String chk_prepare, String chk_other, String chk_seven) {
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_meeting", chk_meeting);
		map.put("chk_hall", chk_hall);
		map.put("chk_honey", chk_honey);
		map.put("chk_package", chk_package);
		map.put("chk_suit", chk_suit);
		map.put("chk_korea", chk_korea);
		map.put("chk_jewelry", chk_jewelry);
		map.put("chk_gift", chk_gift);
		map.put("chk_drawer", chk_drawer);
		map.put("chk_pb", chk_pb);
		map.put("chk_card", chk_card);
		map.put("chk_prepare", chk_prepare);
		map.put("chk_other", chk_other);
		map.put("chk_seven", chk_seven);
		getSqlSession().update("upChk", map);
	}

	public void upChk_meeting(int chk_user, String chk_meeting) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_meeting", chk_meeting);
		getSqlSession().update("upChk_meeting", map);
	}
	public void upChk_hall(int chk_user, String chk_hall) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_hall", chk_hall);
		getSqlSession().update("upChk_hall", map);
	}
	public void upChk_honey(int chk_user, String chk_honey) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_honey", chk_honey);
		getSqlSession().update("upChk_honey", map);
	}
	public void upChk_package(int chk_user, String chk_package) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_package", chk_package);
		getSqlSession().update("upChk_package", map);
	}
	public void upChk_suit(int chk_user, String chk_suit) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_suit", chk_suit);
		getSqlSession().update("upChk_suit", map);
	}
	public void upChk_korea(int chk_user, String chk_korea) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_korea", chk_korea);
		getSqlSession().update("upChk_korea", map);
	}
	public void upChk_jewelry(int chk_user, String chk_jewelry) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_jewelry", chk_jewelry);
		getSqlSession().update("upChk_jewelry", map);
	}
	public void upChk_gift(int chk_user, String chk_gift) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_gift", chk_gift);
		getSqlSession().update("upChk_gift", map);
	}
	public void upChk_drawer(int chk_user, String chk_drawer) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_drawer", chk_drawer);
		getSqlSession().update("upChk_drawer", map);
	}
	public void upChk_pb(int chk_user, String chk_pb) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_pb", chk_pb);
		getSqlSession().update("upChk_pb", map);
	}
	public void upChk_card(int chk_user, String chk_card) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_card", chk_card);
		getSqlSession().update("upChk_card", map);
	}
	public void upChk_prepare(int chk_user, String chk_prepare) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_prepare", chk_prepare);
		getSqlSession().update("upChk_prepare", map);
	}
	public void upChk_other(int chk_user, String chk_other) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_other", chk_other);
		getSqlSession().update("upChk_other", map);
	}
	public void upChk_seven(int chk_user, String chk_seven) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("chk_user", chk_user);
		map.put("chk_seven", chk_seven);
		getSqlSession().update("upChk_seven", map);
	}

}
