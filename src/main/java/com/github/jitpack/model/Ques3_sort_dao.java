package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Ques3_sort_dao extends SqlSessionDaoSupport{

	public List<Ques3_sort_vo> selQues3_sort() {
		List<Ques3_sort_vo> list = getSqlSession().selectList("selQues3_sort");
		return list;
	}

	public void upQues_sort(String ques_meet, String ques_hall, String ques_honey, String ques_package, String ques_suit,
			String ques_korea, String ques_jewelry, String ques_gift,
			String ques_drawer, String ques_card, String ques_pb, String ques_ready, String ques_other) {
		
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("ques_meet",ques_meet);
		map.put("ques_hall",ques_hall);
		map.put("ques_honey",ques_honey);
		map.put("ques_package",ques_package);
		map.put("ques_suit",ques_suit);
		map.put("ques_korea",ques_korea);
		map.put("ques_jewelry",ques_jewelry);
		map.put("ques_gift",ques_gift);
		map.put("ques_drawer",ques_drawer);
		map.put("ques_card",ques_card);
		map.put("ques_pb",ques_pb);
		map.put("ques_ready",ques_ready);
		map.put("ques_other",ques_other);
		getSqlSession().update("upQues_sort", map);
	}


//	public void upQues_sort(String ques_sort, String ques_honey, String ques_package, String ques_suit, String ques_korea, String ques_jewelry, String ques_gift, String ques_drawer, String ques_card, String ques_pb, String ques_ready, String ques_other) {
//		
//		HashMap<String, Object> map = new HashMap<>();
//		map.put("ques_meet",ques_meet);
//		map.put("ques_hall",ques_hall);
//		map.put("ques_honey",ques_honey);
//		map.put("ques_package",ques_package);
//		map.put("ques_suit",ques_suit);
//		map.put("ques_korea",ques_korea);
//		map.put("ques_jewelry",ques_jewelry);
//		map.put("ques_gift",ques_gift);
//		map.put("ques_drawer",ques_drawer);
//		map.put("ques_card",ques_card);
//		map.put("ques_pb",ques_pb);
//		map.put("ques_ready",ques_ready);
//		map.put("ques_other",ques_other);
//		getSqlSession().update("upQues_sort", map);
//	}
}
