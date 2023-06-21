package com.lgy.ShoppingMall.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lgy.ShoppingMall.dto.CategoryDto;
import com.lgy.ShoppingMall.dto.NoticeDto;
import com.lgy.ShoppingMall.dto.ProductDto;
import com.lgy.ShoppingMall.service.NoticeService;
import com.lgy.ShoppingMall.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
//@RequestMapping("/notice")
public class noticeController {

    @Autowired
    private NoticeService noticeService;

    @RequestMapping("/list")
    public String list(Model model) {
        log.info("@# NoticeController.list() start");

        // 공지사항 리스트를 가져옴
        ArrayList<NoticeDto> list = noticeService.list();
        model.addAttribute("list", list);

        log.info("@# NoticeController.list() end");

        return "list";
    }

    @RequestMapping("/write")
    public String write(@RequestParam HashMap<String, String> param) {
        log.info("@# NoticeController.write() start");

        // 공지사항 작성 서비스 호출
        noticeService.write(param);

        log.info("@# NoticeController.write() end");

        return "redirect:list";
    }

    @RequestMapping("/write_view")
    public String writeView() {
        log.info("@# NoticeController.writeView");

//        return "/notice/write_view";
        return "write_view";
    }

    @RequestMapping("/content_view")
    public String contentView(@RequestParam HashMap<String, String> param, Model model) {
        log.info("@# NoticeController.contentView() start");

        // 공지사항의 내용을 가져옴
        NoticeDto dto = noticeService.contentView(param);
        model.addAttribute("content_view", dto);

        log.info("@# NoticeController.contentView() end");

        return "content_view";
    }

    @RequestMapping("/noticeModify")
    public String noticeModify(@RequestParam HashMap<String, String> param) {
        log.info("@# NoticeController.noticeModify() start");

        // 공지사항 수정 서비스 호출
        noticeService.noticeModify(param);

        log.info("@# NoticeController.noticeModify() end");

//        return "/notice/list";
        return "redirect:list";
    }

    @RequestMapping("/noticeDelete")
    public String noticeDelete(@RequestParam HashMap<String, String> param) {
        log.info("@# NoticeController.noticeDelete() start");

        // 공지사항 삭제 서비스 호출
        noticeService.noticeDelete(param);

        log.info("@# NoticeController.noticeDelete() end");

//        return "/notice/list";
        return "redirect:list";
    }
}