package partner.model;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

public class Payment_sdm_dao extends SqlSessionDaoSupport{

	public void insPayment_sdm(int pm_user_idx, String pm_user_gender,
			String pm_m_name, String pm_m_phone, String pm_w_name,
			String pm_w_phone, String pm_pro_name, String pm_studio,
			String pm_dress, String pm_addpay, String pm_makeup, String pm_pay, String pm_remain,
			String pm_dc, String pm_pay_engine, String pm_pay_number,
			String pm_pay_name, String pm_pay_date, String pm_send_name,
			String pm_rece, String pm_rece_engine, String pm_rece_number) 
	{

		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pm_user_idx",pm_user_idx);
		map.put("pm_user_gender",pm_user_gender);
		map.put("pm_m_name",pm_m_name);
		map.put("pm_m_phone",pm_m_phone);
		map.put("pm_w_name",pm_w_name);
		map.put("pm_w_phone",pm_w_phone);
		map.put("pm_pro_name",pm_pro_name);
		map.put("pm_studio",pm_studio);
		map.put("pm_dress",pm_dress);
		map.put("pm_addpay",pm_addpay);
		map.put("pm_makeup",pm_makeup);
		map.put("pm_pay",pm_pay);
		map.put("pm_remain",pm_remain);
		map.put("pm_dc",pm_dc);
		map.put("pm_pay_engine",pm_pay_engine);
		map.put("pm_pay_number",pm_pay_number);
		map.put("pm_pay_name",pm_pay_name);
		map.put("pm_pay_date",pm_pay_date);
		map.put("pm_send_name",pm_send_name);
		map.put("pm_rece",pm_rece);
		map.put("pm_rece_engine",pm_rece_engine);
		map.put("pm_rece_number",pm_rece_number);
		
		getSqlSession().insert("insPayment_sdm", map);
		
	}
	
	public List<Payment_sdm_vo> selPayment_sdm(String query) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("query", query);
		List<Payment_sdm_vo> list = getSqlSession().selectList("selPayment_sdm", map);
		return list;
	}

	public void upStatus_pm(int pm_user_idx, String pm_status) {
		
		HashMap<String, Object> map = new HashMap<>();
		
		map.put("pm_user_idx",pm_user_idx);
		map.put("pm_status",pm_status);
		getSqlSession().update("upStatus_pm", map);
		
	}

	

}
