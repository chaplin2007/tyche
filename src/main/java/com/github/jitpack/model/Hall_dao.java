package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Hall_dao extends SqlSessionDaoSupport{

	public List<Hall_vo> selIdx_hall() {
		List<Hall_vo> list = getSqlSession().selectList("selIdx_hall");
		return list;
	}

	public void insHall(int pro_idx, String pro_sort, String pro_com_idx, String pro_com_name,
			String pro_category, String pro_name, String pro_homepage, String pro_tel, String pro_zipcode, String pro_addr1,
			String pro_addr2, String pro_subway1, String pro_subway2,String pro_subway3, String pro_bus, String pro_intro1, String pro_intro2, String pro_type, String pro_wedding_type,
			String pro_wedding_time, String pro_hall_seat, String pro_party_seat, String pro_person, String pro_parking, String pro_talk_time, String pro_menu,
			String pro_eat_pay, String pro_other_pay, String pro_rent_pay, String pro_basic_option, String pro_essential_option, String pro_essential_option_pay,
			String pro_menu_name, String pro_menu_pay, String pro_menu_type, String pro_charge1, String pro_charge2, String pro_charge3) {
		
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
		map.put("pro_wedding_type",pro_wedding_type);
		map.put("pro_wedding_time",pro_wedding_time);
		map.put("pro_hall_seat",pro_hall_seat);
		map.put("pro_party_seat",pro_party_seat);
		map.put("pro_person",pro_person);
		map.put("pro_parking",pro_parking);
		map.put("pro_talk_time",pro_talk_time);
		map.put("pro_menu",pro_menu);
		map.put("pro_eat_pay",pro_eat_pay);
		map.put("pro_other_pay",pro_other_pay);
		map.put("pro_rent_pay",pro_rent_pay);
		map.put("pro_basic_option",pro_basic_option);
		map.put("pro_essential_option",pro_essential_option);
		map.put("pro_essential_option_pay",pro_essential_option_pay);
		map.put("pro_menu_name",pro_menu_name);
		map.put("pro_menu_pay",pro_menu_pay);
		map.put("pro_menu_type",pro_menu_type);
		map.put("pro_charge1",pro_charge1);
		map.put("pro_charge2",pro_charge2);
		map.put("pro_charge3",pro_charge3);
		
		getSqlSession().insert("insHall", map);
	}

	public List<Hall_vo> selList_hall(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Hall_vo> list = getSqlSession().selectList("selList_hall", map);
		return list;
	}

	public void delHall(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		getSqlSession().delete("delHall", map);
	}

	public void upHall(int pro_idx, String pro_sort, String pro_com_idx, String pro_com_name,
			String pro_category, String pro_name, String pro_homepage, String pro_tel, String pro_zipcode, String pro_addr1,
			String pro_addr2, String pro_subway1, String pro_subway2,String pro_subway3, String pro_bus, String pro_intro1, String pro_intro2, String pro_type, String pro_wedding_type,
			String pro_wedding_time, String pro_hall_seat, String pro_party_seat, String pro_person, String pro_parking, String pro_talk_time, String pro_menu,
			String pro_eat_pay, String pro_other_pay, String pro_rent_pay, String pro_basic_option, String pro_essential_option, String pro_essential_option_pay,
			String pro_menu_name, String pro_menu_pay, String pro_menu_type, String pro_charge1, String pro_charge2, String pro_charge3) {
		
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
		map.put("pro_wedding_type",pro_wedding_type);
		map.put("pro_wedding_time",pro_wedding_time);
		map.put("pro_hall_seat",pro_hall_seat);
		map.put("pro_party_seat",pro_party_seat);
		map.put("pro_person",pro_person);
		map.put("pro_parking",pro_parking);
		map.put("pro_talk_time",pro_talk_time);
		map.put("pro_menu",pro_menu);
		map.put("pro_eat_pay",pro_eat_pay);
		map.put("pro_other_pay",pro_other_pay);
		map.put("pro_rent_pay",pro_rent_pay);
		map.put("pro_basic_option",pro_basic_option);
		map.put("pro_essential_option",pro_essential_option);
		map.put("pro_essential_option_pay",pro_essential_option_pay);
		map.put("pro_menu_name",pro_menu_name);
		map.put("pro_menu_pay",pro_menu_pay);
		map.put("pro_menu_type",pro_menu_type);
		map.put("pro_charge1",pro_charge1);
		map.put("pro_charge2",pro_charge2);
		map.put("pro_charge3",pro_charge3);
		
		getSqlSession().update("upHall", map);
	}
	public void upStatus_hall(int pro_idx, String pro_status) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pro_idx", pro_idx);
		map.put("pro_status", pro_status);
		getSqlSession().update("upStatus_hall", map);
	}

	public void upHits_hall(int pro_idx, int pro_hits) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("pro_idx", pro_idx);
		map.put("pro_hits", pro_hits);
		getSqlSession().update("upHits_hall", map);
	}

}
