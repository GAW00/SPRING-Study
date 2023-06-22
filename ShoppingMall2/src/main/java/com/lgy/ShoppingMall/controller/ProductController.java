package com.lgy.ShoppingMall.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoppingMall.dto.CategoryDto;
import com.lgy.ShoppingMall.dto.ProductDto;
import com.lgy.ShoppingMall.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ProductController {

	 	@Autowired
		private ProductService prService;
		
		@RequestMapping("/category")
		public String category(Model model) {
			log.info("@# ProductController.category() start");

			// 카테고리 목록을 가져옴
			ArrayList<CategoryDto> categoryList =prService.category();
			model.addAttribute("categoryList", categoryList);

			log.info("@# ProductController.category() end");

			return "category";
		}

		@RequestMapping("/register")
		public String register(@RequestParam HashMap<String, String> param) {
			log.info("@# ProductController.register() start");

			// 상품 등록 서비스 호출
			prService.register(param);

			log.info("@# ProductController.register() end");

			
			return "product/register";
		}

		@RequestMapping("/productList")
		public String productlist(Model model) {
			log.info("@# ProductController.productList() start");

			// 상품 목록을 가져옴
			ArrayList<ProductDto> productList = prService.productlist();
			model.addAttribute("productList", productList);

			log.info("@# ProductController.productList() end");

			return "product/productList";
		}

		@RequestMapping("/productView")
		public String productView(@RequestParam HashMap<String, String> param, Model model) {
			log.info("@# ProductController.productView() start");
			
			// 상품 조회 및 카테고리 조인 정보 가져옴
			ProductDto dto = prService.productView(param);
			model.addAttribute("productView", dto);

			log.info("@# ProductController.productView() end");

			return "productView";
		}

		@RequestMapping("/productModify")
		public String productModify(@RequestParam HashMap<String, String> param) {
			log.info("@# ProductController.productModify() start");

			// 상품 수정 서비스 호출
			prService.productModify(param);

			log.info("@# ProductController.productModify() end");

			return "redirect:productlist";
		}

		@RequestMapping("/productDelete")
		public String productDelete(@RequestParam HashMap<String, String> param) {
			log.info("@# ProductController.productDelete() start");

			// 상품 삭제 서비스 호출
			prService.productDelete(param);

			log.info("@# ProductController.productDelete() end");

			return "redirect:productlist";
		}
}
