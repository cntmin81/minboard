package io.github.cntmin81.minboard.admin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin")
public class AdminWebController {

    @GetMapping("/")
    public String index() {
        return "/admin/index";
    }
}
