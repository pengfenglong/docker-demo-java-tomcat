package com.smartdp.rest.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rest/movie")
public class MovieController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping(value = "view/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object getMovie(@PathVariable("id") Long id, Model model) {
		
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from test");
		
		return list;

	}

}