package com.smartdp.rest.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		
		System.out.println("===================================================================");
		List<Map<String, String>> list = new ArrayList<Map<String,String>>();
//		// 载入驱动  
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			// 建立连接  
//			Connection con = DriverManager.getConnection(  
//			  "jdbc:mysql://10.10.26.58:3306/rWGc8qiFbSaRouO1", "uDMLaE7XRohHspWG", "pvcipx3Ty7RfqYrg2");  
//			// 创建状态  
//			Statement stmt = con.createStatement();  
//			// 执行SQL语句，返回结果集  
//			ResultSet rs = stmt.executeQuery("SELECT * FROM test");  
//			// 对结果集进行处理  
//			while (rs.next()) {  
//			 int _id = rs.getInt("id");  
//			 String name = rs.getString("name");  
//			 Map<String, String> m = new HashMap<String, String>();
//			 
//			 m.put("id", _id + "");
//			 m.put("name", name + "");
//			 
//			 list.add(m);
//			}  
//			// 释放资源  
//			stmt.close();  
//			con.close();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
		return list;
		
	}

}