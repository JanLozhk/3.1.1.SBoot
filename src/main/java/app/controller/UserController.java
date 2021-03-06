package app.controller;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String user(/*Principal principal*/ Model model) { //@AuthenticationPrincipal
//        String username = principal.getName();
        User user = userService.findByLogin("admin");
        model.addAttribute("user", user);
        return "user";
    }

}
