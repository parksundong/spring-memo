package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
    클래스 이름 위에 @Controller 어노테이션을 선언하면 해당 클래스를
    요청을 처리하는 컨트롤러로 사용한다.
 */
@Controller
public class HelloController {
    /*
        컨트롤러 클래스에 @GetMapping 어너테이션을 이용해 클라이언트의 요청을
        처리할 URL을 매핑한다. localhost:8000/hello로 오는 요청을 처리할 수
        있도록 value="/hello"로 선언했다.
     */
    @GetMapping(value="/hello")
    //model 객체를 이용해 뷰에 전달할 데이터를 key, value 구조로 넣어준다.
    public void hello(Model model) {
        model.addAttribute("name", "김종호");
    }
}
