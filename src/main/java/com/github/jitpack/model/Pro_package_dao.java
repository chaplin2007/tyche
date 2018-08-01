package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Pro_package_dao extends SqlSessionDaoSupport{

	public List<Pro_package_vo> selIdx_pack() {
		List<Pro_package_vo> list = getSqlSession().selectList("selIdx_pack");
		return list;
	}

	public void insPro_package(int pack_idx, String pack_sort, String pack_name, String pack_pro_idx, String pack_pro_cate,
			String pack_pro_name, String pack_pro_option, String pack_pay, String pack_people, String pack_end_date) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pack_idx",pack_idx);
		map.put("pack_sort",pack_sort);
		map.put("pack_name",pack_name);
		map.put("pack_pro_idx",pack_pro_idx);
		map.put("pack_pro_cate",pack_pro_cate);
		map.put("pack_pro_name",pack_pro_name);
		map.put("pack_pro_option",pack_pro_option);
		map.put("pack_pay",pack_pay);
		map.put("pack_people",pack_people);
		map.put("pack_end_date",pack_end_date);
		
		getSqlSession().insert("insPro_package", map);
	}

	public List<Pro_package_vo> selPro_package(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Pro_package_vo> list = getSqlSession().selectList("selPro_package", map);
		return list;
	}
	public void upPack_status(int pack_idx, String pack_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pack_idx",pack_idx);
		map.put("pack_status",pack_status);
		
		getSqlSession().update("upPack_status", map);
	}
	public void upPack_cnt(int pack_idx, int pack_cnt) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pack_idx",pack_idx);
		map.put("pack_cnt",pack_cnt);
		
		getSqlSession().update("upPack_cnt", map);
	}

	public void upStats_pro_package(int pack_idx, int pack_stats_detail, int pack_stats_submit, int pack_stats_comple) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pack_idx",pack_idx);
		map.put("pack_stats_detail",pack_stats_detail);
		map.put("pack_stats_submit",pack_stats_submit);
		map.put("pack_stats_comple",pack_stats_comple);
		
		getSqlSession().update("upStats_pro_package", map);
	}

	public void delPro_pack(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delPro_pack", map);
	}

	public void upPro_package(int pack_idx, String pack_sort, String pack_name, String pack_pro_idx, String pack_pro_cate,
			String pack_pro_name, String pack_pro_option, String pack_pay, String pack_people, String pack_end_date) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pack_idx",pack_idx);
		map.put("pack_sort",pack_sort);
		map.put("pack_name",pack_name);
		map.put("pack_pro_idx",pack_pro_idx);
		map.put("pack_pro_cate",pack_pro_cate);
		map.put("pack_pro_name",pack_pro_name);
		map.put("pack_pro_option",pack_pro_option);
		map.put("pack_pay",pack_pay);
		map.put("pack_people",pack_people);
		map.put("pack_end_date",pack_end_date);
		
		getSqlSession().update("upPro_package", map);
	}
}
