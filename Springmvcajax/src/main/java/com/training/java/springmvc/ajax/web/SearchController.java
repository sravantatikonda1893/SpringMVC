package com.training.java.springmvc.ajax.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class SearchController 
{
	@RequestMapping("/searchform")
	public String searchForm(){
		return "search";
	}

	@RequestMapping("/search")
	public List<String> search(@RequestParam String key)
	{
		List<String> allProducts=getAllProducts();
		List<String> result=new ArrayList<String>();
		for(String product:allProducts){
			if(product.startsWith(key))
			{
				result.add(product);
			}
		}
		return result;
	}

	public List<String> getAllProducts()
	{
		return Arrays.asList("Apple Iphone","Apple Ipad","Bisket","Bhanu","Cat","Crane","Drone","drome","elephant","elegant","frome","forg");
	}
}
