package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Dress_dao extends SqlSessionDaoSupport{

	public List<Dress_vo> selIdx_dress() {
		List<Dress_vo> list = getSqlSession().selectList("selIdx_dress");
		return list;
	}

	public void insDress(int pro_idx, String pro_sort, String pro_com_idx,
			String pro_com_name, String pro_category, String pro_name, String pro_homepage, String pro_tel, String pro_zipcode,
			String pro_addr1, String pro_addr2, String pro_subway1, String pro_subway2, String pro_subway3, String pro_bus,
			String pro_intro1, String pro_intro2, String pro_type, String pro_brand, String pro_talk_time, String pro_holiday, String pro_parking, 
			String pro_composition, String pro_composition_pay, String pro_composition_charge, String pro_composition_price, String pro_composition_dc, String pro_sdm_pay,
			String pro_add_name, String pro_add_pay, String pro_event, String pro_pay_engine, String pro_pay_number, String pro_pay_name,
			String pro_change_date, String pro_sorry_pay) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pro_idx",pro_idx);
		map.put("pro_sort",pro_sort);
		map.put("pro_com_idx",pro_com_idx);
		map.put("pro_com_name",pro_com_name);
		map.put("pro_category",pro_category);
		map.put("pro_name",pro_name);
		map.put("pro_homepage",pro_homepage);
		map.put("pro_tel",pro_tel);
		map.put("pro_zipcode",pro_zipcode);
		map.put("pro_addr1",pro_addr1);
		map.put("pro_addr2",pro_addr2);
		map.put("pro_subway1",pro_subway1);
		map.put("pro_subway2",pro_subway2);
		map.put("pro_subway3",pro_subway3);
		map.put("pro_bus",pro_bus);
		map.put("pro_intro1",pro_intro1);
		map.put("pro_intro2",pro_intro2);
		map.put("pro_type",pro_type);
		map.put("pro_brand",pro_brand);
		map.put("pro_talk_time",pro_talk_time);
		map.put("pro_holiday",pro_holiday);
		map.put("pro_parking",pro_parking);
		map.put("pro_composition",pro_composition);
		map.put("pro_composition_pay",pro_composition_pay);
		map.put("pro_composition_charge",pro_composition_charge);
		map.put("pro_composition_price",pro_composition_price);
		map.put("pro_composition_dc",pro_composition_dc);
		map.put("pro_sdm_pay",pro_sdm_pay);
		map.put("pro_add_name",pro_add_name);
		map.put("pro_add_pay",pro_add_pay);
		map.put("pro_event",pro_event);
		map.put("pro_pay_engine",pro_pay_engine);
		map.put("pro_pay_number",pro_pay_number);
		map.put("pro_pay_name",pro_pay_name);
		map.put("pro_change_date",pro_change_date);
		map.put("pro_sorry_pay",pro_sorry_pay);
		
		getSqlSession().insert("insDress", map);
	}

	public List<Dress_vo> selList_dress(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Dress_vo> list = getSqlSession().selectList("selList_dress", map);
		return list;
	}

	public void delDress(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delDress", map);
	}

	public void upDress(int pro_idx, String pro_sort, String pro_com_idx,
			String pro_com_name, String pro_category, String pro_name, String pro_homepage, String pro_tel, String pro_zipcode,
			String pro_addr1, String pro_addr2, String pro_subway1, String pro_subway2, String pro_subway3, String pro_bus,
			String pro_intro1, String pro_intro2, String pro_type, String pro_brand, String pro_talk_time, String pro_holiday, String pro_parking, 
			String pro_composition, String pro_composition_pay, String pro_composition_charge, String pro_composition_price, String pro_composition_dc, String pro_sdm_pay,
			String pro_add_name, String pro_add_pay, String pro_event, String pro_pay_engine, String pro_pay_number, String pro_pay_name,
			String pro_change_date, String pro_sorry_pay) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pro_idx",pro_idx);
		map.put("pro_sort",pro_sort);
		map.put("pro_com_idx",pro_com_idx);
		map.put("pro_com_name",pro_com_name);
		map.put("pro_category",pro_category);
		map.put("pro_name",pro_name);
		map.put("pro_homepage",pro_homepage);
		map.put("pro_tel",pro_tel);
		map.put("pro_zipcode",pro_zipcode);
		map.put("pro_addr1",pro_addr1);
		map.put("pro_addr2",pro_addr2);
		map.put("pro_subway1",pro_subway1);
		map.put("pro_subway2",pro_subway2);
		map.put("pro_subway3",pro_subway3);
		map.put("pro_bus",pro_bus);
		map.put("pro_intro1",pro_intro1);
		map.put("pro_intro2",pro_intro2);
		map.put("pro_type",pro_type);
		map.put("pro_brand",pro_brand);
		map.put("pro_talk_time",pro_talk_time);
		map.put("pro_holiday",pro_holiday);
		map.put("pro_parking",pro_parking);
		map.put("pro_composition",pro_composition);
		map.put("pro_composition_pay",pro_composition_pay);
		map.put("pro_composition_charge",pro_composition_charge);
		map.put("pro_composition_price",pro_composition_price);
		map.put("pro_composition_dc",pro_composition_dc);
		map.put("pro_sdm_pay",pro_sdm_pay);
		map.put("pro_add_name",pro_add_name);
		map.put("pro_add_pay",pro_add_pay);
		map.put("pro_event",pro_event);
		map.put("pro_pay_engine",pro_pay_engine);
		map.put("pro_pay_number",pro_pay_number);
		map.put("pro_pay_name",pro_pay_name);
		map.put("pro_change_date",pro_change_date);
		map.put("pro_sorry_pay",pro_sorry_pay);
		
		getSqlSession().update("upDress", map);
	}

	public void upStatus_dress(int pro_idx, String pro_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pro_idx", pro_idx);
		map.put("pro_status", pro_status);
		getSqlSession().update("upStatus_dress", map);
	}
	public void upHits_dress(int pro_idx, int pro_hits) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pro_idx", pro_idx);
		map.put("pro_hits", pro_hits);
		getSqlSession().update("upHits_dress", map);
	}

	

}
