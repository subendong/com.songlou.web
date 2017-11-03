package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//参考网址：http://www.cnblogs.com/Sunnor/p/6130380.html
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
		//单个字段设置
		mv.addObject("msg", "hello kitty");
		//集合设置
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("oracle");
		mv.addObject("bookList", list);
		//字段设置
		Map<String, String> map = new HashMap<String, String>();
		map.put("zhangsan", "北京");
		map.put("lisi", "上海");
		map.put("wangwu", "深圳");
		mv.addObject("map", map);
		
		return mv;
	}
}
