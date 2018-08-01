package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Ques3_dao extends SqlSessionDaoSupport{

	public List<Ques3_vo> selList_ques3(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Ques3_vo> list = getSqlSession().selectList("selList_ques3", map);
		return list;
	}
	public List<Ques3_vo> selIdx_ques3() {
		List<Ques3_vo> list = getSqlSession().selectList("selIdx_ques3");
		return list;
	}
	public void insQues3(int ques_idx, String ques_cate, String ques_title, String ques_card1, String ques_card2, String ques_card3, String ques_card4, int ques_card_cnt) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ques_idx", ques_idx);
		map.put("ques_cate", ques_cate);
		map.put("ques_title", ques_title);
		map.put("ques_card1", ques_card1);
		map.put("ques_card2", ques_card2);
		map.put("ques_card3", ques_card3);
		map.put("ques_card4", ques_card4);
		map.put("ques_card_cnt", ques_card_cnt);
		getSqlSession().insert("insQues3", map);
	}
	public void delQues3(String idx) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ques_idx", idx);
		getSqlSession().delete("delQues3", map);
	}
	public void upQues3(int ques_idx, String ques_cate, String ques_title, String ques_card1, String ques_card2, String ques_card3, String ques_card4, int ques_card_cnt) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("ques_idx", ques_idx);
		map.put("ques_cate", ques_cate);
		map.put("ques_title", ques_title);
		map.put("ques_card1", ques_card1);
		map.put("ques_card2", ques_card2);
		map.put("ques_card3", ques_card3);
		map.put("ques_card4", ques_card4);
		map.put("ques_card_cnt", ques_card_cnt);
		getSqlSession().update("upQues3", map);
	}
}
