package com.tekup.security.admin;


import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping("/info")
    String infoAdmin(Model model){
        model.addAttribute("security",SecurityContextHolder.getContext().getAuthentication());
        return "admin-info";
    }

}
