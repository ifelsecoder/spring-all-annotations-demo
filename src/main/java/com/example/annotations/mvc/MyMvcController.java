package com.example.annotations.mvc;

import com.example.annotations.dto.LoginDto;
import com.example.annotations.dto.LoginLombokDto;
import com.example.annotations.util.MyLogger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MyMvcController {

	private static final String ANNOTATIONS = " [ANNOTATIONS:  " +
													"@Autowired, @Controller, @GetMapping, @PostMapping, " +
                                                    "@RequestParam, @Value" +
												"]";

    @Autowired
    private MyMvcService mvcService;

    @Value("${login.title}")
    private String loginTitle;

    @Value("${authenticated.message}")
    private String authenticatedMessage;


    @GetMapping(value = {"/", "/login"})
    public ModelAndView login() {
		MyLogger.log("MyMvcController, login - called" + ANNOTATIONS);

		ModelAndView modelAndView = new ModelAndView("login");
		modelAndView.addObject("loginTitle", loginTitle);

        return modelAndView;
    }

    @PostMapping(value = {"/authenticate"})
    public ModelAndView authenticate(LoginDto dto) {
		MyLogger.log("MyMvcController, authenticate - called" + ANNOTATIONS);

		mvcService.authenticate(dto);

		ModelAndView modelAndView = new ModelAndView("authenticated");
		modelAndView.addObject("authenticatedMessage", authenticatedMessage);
        modelAndView.addObject("username", dto.getUsername());

        return modelAndView;
    }

    @PostMapping(value = {"/authenticate-by-lombok"})
    public ModelAndView authenticateByLombok(LoginLombokDto dto) {
        MyLogger.log("MyMvcController, authenticateByLombok - called" + ANNOTATIONS);

        mvcService.authenticateByLombok(dto);

        ModelAndView modelAndView = new ModelAndView("authenticated");
		modelAndView.addObject("authenticatedMessage", authenticatedMessage);
        modelAndView.addObject("username", dto.getUsername());

        return modelAndView;
    }

    @PostMapping(value = {"/logout"})
    public String logout() {
		MyLogger.log("MyMvcController, logout - called" + ANNOTATIONS);
        return "redirect:login";
    }


    /////////////   FOR USING JSP VIEWS   //////////////


    @GetMapping(value = {"/loginJsp"})
    public String loginJsp(ModelMap model) {
        MyLogger.log("MyMvcController, loginJsp - called" + ANNOTATIONS);

        model.put("loginTitle", loginTitle);

        return "loginJsp";
    }

    @PostMapping(value = {"/authenticateJsp"})
    public String authenticateJsp(@RequestParam("username") String username,
                                  @RequestParam("password") String password,
                                  ModelMap model) {
        MyLogger.log("MyMvcController, authenticateJsp - called" + ANNOTATIONS);
        MyLogger.log("MyMvcController, authenticateJsp - model: " + model);

        LoginDto dto = new LoginDto();
        dto.setUsername(username);
        dto.setPassword(password);

        mvcService.authenticate(dto);

        model.put("authenticatedMessage", authenticatedMessage);
        model.put("username", dto.getUsername());

        return "authenticatedJsp";
    }

    @PostMapping(value = {"/authenticateJsp-by-lombok"})
    public String authenticateJspByLombok(@RequestParam("username") String username,
                                          @RequestParam("password") String password,
                                          ModelMap model) {
        MyLogger.log("MyMvcController, authenticateJspByLombok - called" + ANNOTATIONS);
        MyLogger.log("MyMvcController, authenticateJspByLombok - model: " + model);

        LoginDto dto = new LoginDto();
        dto.setUsername(username);
        dto.setPassword(password);

        mvcService.authenticate(dto);

        model.put("authenticatedMessage", authenticatedMessage);
        model.put("username", dto.getUsername());

        return "authenticatedJsp";
    }

    @PostMapping(value = {"/logoutJsp"})
    public String logoutJsp() {
        MyLogger.log("MyMvcController, logoutJsp - called" + ANNOTATIONS);
        return "redirect:loginJsp";
    }
}

