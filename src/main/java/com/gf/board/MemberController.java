package com.gf.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    private String join() {
        return "join";
    }

    @GetMapping("/login")
    private String login() {
        return "login";
    }

    @GetMapping("/find")
    private String find() {
        return "find";
    }

    @PostMapping("/email_check")
    @ResponseBody
    private String emailCheck() {
        return "ok";
    }

}
