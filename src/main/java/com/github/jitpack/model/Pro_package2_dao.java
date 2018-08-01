package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Pro_package2_dao extends SqlSessionDaoSupport{

	public List<Pro_package2_vo> selIdx_pack2() {
		List<Pro_package2_vo> list = getSqlSession().selectList("selIdx_pack2");
		return list;
	}

	public void insPro_package2(int pack_idx, String pack_sort, String pack_cate, String pack_name, String pack_pro_idx,
			String pack_pro_name, String pack_pro_option, String pack_pay) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pack_idx",pack_idx);
		map.put("pack_sort",pack_sort);
		map.put("pack_cate",pack_cate);
		map.put("pack_name",pack_name);
		map.put("pack_pro_idx",pack_pro_idx);
		map.put("pack_pro_name",pack_pro_name);
		map.put("pack_pro_option",pack_pro_option);
		map.put("pack_pay",pack_pay);
		
		getSqlSession().insert("insPro_package2", map);
	}

	public List<Pro_package2_vo> selPro_package2(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Pro_package2_vo> list = getSqlSession().selectList("selPro_package2", map);
		return list;
	}
	public void upPack2_status(int pack_idx, String pack_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pack_idx",pack_idx);
		map.put("pack_status",pack_status);
		
		getSqlSession().update("upPack2_status", map);
	}

	public void delPro_pack2(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delPro_pack2", map);
	}

	public void upPro_package2(int pack_idx, String pack_sort, String pack_cate, String pack_name, String pack_pro_idx,
			String pack_pro_name, String pack_pro_option, String pack_pay) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pack_idx",pack_idx);
		map.put("pack_sort",pack_sort);
		map.put("pack_cate",pack_cate);
		map.put("pack_name",pack_name);
		map.put("pack_pro_idx",pack_pro_idx);
		map.put("pack_pro_name",pack_pro_name);
		map.put("pack_pro_option",pack_pro_option);
		map.put("pack_pay",pack_pay);
		
		getSqlSession().update("upPro_package2", map);
	}
}
