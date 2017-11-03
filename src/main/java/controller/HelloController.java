package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//�ο���ַ��http://www.cnblogs.com/Sunnor/p/6130380.html
//http://localhost:8080/com.songlou.web/hello/index
//http://localhost:8080/com.songlou.web/css/hello.css
@Controller
@RequestMapping("/hello")
public class HelloController {
	/*
	 * @RequestMapping("/index") public @ResponseBody String index() { return
	 * "hello, world! This com from spring!"; }
	 */

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("hello");
		//�����ֶ�����
		mv.addObject("msg", "hello kitty");
		//��������
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
		mv.addObject("bookList", list);
		//�ֶ�����
		Map<String, String> map = new HashMap<String, String>();
		map.put("zhangsan", "����");
		map.put("lisi", "�Ϻ�");
		map.put("wangwu", "����");
		mv.addObject("map", map);
		
		return mv;
	}
}
