package com.richy.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.richy.spring.model.Compose;
import com.richy.spring.model.User;

@Controller
@RequestMapping("/user")
public class UserController {

	
	/**
	 * @descrp��
	 * 	@RequestBodyע����Խ����յ�JSON��ʽ����ת����ΪJAVA����
	 *  @ResponseBodyע����Խ�java����ת����JSON��ʽ��������Ӧ���ͻ���
	 *  
	 *   ����ͻ���ͨ��������ʽ�������ݣ�ֻҪ�ֶζ�Ӧ���ϣ������ܽ��ܵĵ�
	 * @author��FyRichy
	 * @time��2019��2��28������9:13:15
	 * @param user
	 * @return
	 */
	
	@RequestMapping("/findAll")
	@ResponseBody
	public String findAll(@RequestBody List<User> users) {
		StringBuffer sb = new StringBuffer();
		if(null != users && users.size() > 0) {
			for(User user:users) {
				sb.append(user.toString()+"\n");
			}
		}
		return sb.toString();
	}
	
	@RequestMapping("/getById")
	public String getById(String userId) {
		
		return "/user/userInfo";
	}
	
	
	/**
	 * descrp����ϲ���������Teacher��User��ʵ������
	 * @author��FyRichy
	 * @time��2019��2��28������1:59:12
	 * @param compose
	 * @return
	 */
	@RequestMapping("/compose")
	@ResponseBody
	public String compose(@RequestBody Compose compose) {
		return compose.toString();
	}
	
	
	/**
	 * @descrp���Զ������������ʵ��
	 * @author��FyRichy
	 * @time��2019��2��28������2:11:41
	 * @param compose
	 * @return
	 */
	@RequestMapping("/customize")
	@ResponseBody
	public String customize(@com.richy.spring.annotation.Compose Compose compose) {
		return compose.toString();
	}
	
}
