package io.yonghochoi.github.web;

import io.yonghochoi.github.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller     // 스프링 MVC 엔진이 웹 컨트롤러로 취급할 수 있도록 함
public class JournalController {
    @Autowired
    JournalRepository repo;

    @RequestMapping("/")    // 기본경로 "/" 요청을 담당하는 핸들러로 지정
    public String index(Model model) {
        model.addAttribute("journal", repo.findAll());  // findAll 메서드를 통해 DB에 저장된 모든 레코드를 반환
        return "index"; // 스프링 MVC엔진은 템플릿 폴더에서 index.html 파일을 찾음
    }
}
