package com.yykj.dbz.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yykj.dbz.service.TestService;
import com.yykj.dbz.vo.User;

@Controller  
@RequestMapping("/test")
public class TestController {
private Log log = LogFactory.getLog(this.getClass());
	
	@Autowired
	private TestService testService;
	

	
	/**
	 * 查询右侧协议树总体结构以及自定义树
	 */
	@ResponseBody
	@RequestMapping("/getalluser")
	public Map<String,Object> showFullTree(int id) {
		Map<String,Object> map=new HashMap<String,Object>();
		List<User> users=testService.getAllUser();
		try{
			map.put("users", users);
		} catch (Exception e) {
			log.error(e.getMessage(),e);
		}
		return map;
	}

	@RequestMapping("/index")
	public ModelAndView protocol() {
		ModelAndView mv = new ModelAndView("views/test/index");
		return mv;
	}
}
