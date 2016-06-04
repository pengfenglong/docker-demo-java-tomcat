package com.smartdp.rest.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/movie")
public class MovieController {

	@RequestMapping(value = "view/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object getMovie(@PathVariable("id") Long id, Model model) {
		String catalog = "";
		// 载入驱动
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			Connection con = DriverManager.getConnection(
//					"jdbc:mysql://10.10.26.58:3306/rWGc8qiFbSaRouO1", "uDMLaE7XRohHspWG", "pvcipx3Ty7RfqYrg2");
//			catalog = con.getCatalog();
			
			
			
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// 建立连接
//		catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		model.addAttribute("movie", id);
		Map<String, String> m = new HashMap<String, String>();
		m.put("a", "a");
		m.put("b", "b");
		m.put("catalog", catalog);
		return System.getenv();

	}

}