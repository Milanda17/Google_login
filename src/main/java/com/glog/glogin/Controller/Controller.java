package com.glog.glogin.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller

public class Controller {


    @GetMapping("/start")
    public ModelAndView loginPage(ModelMap model) {
        return new ModelAndView("index");
    }
    @GetMapping("/google")
    public ModelAndView redirectGooglePage(ModelMap model) {
        return new ModelAndView("user");
    }
    @GetMapping("/facebook")
    public ModelAndView redirectFacebookPage(ModelMap model) {
        return new ModelAndView("test");
    }
    @GetMapping("/test")
    public ModelAndView test(ModelMap model) {
        return new ModelAndView("test");
    }

    @GetMapping("/")
    public ModelAndView login(ModelMap model) {
        return new ModelAndView("test");
    }




//    @GetMapping("/exit")
//    public ModelAndView doGet (HttpServletRequest req, HttpServletResponse resp)
//              throws IOException, ServletException {
//            // you can also make an authenticated request to logout, but here we choose to
//            // simply delete the session variables for simplicity
//            HttpSession session =  req.getSession(false);
//            if (session != null) {
//                session.invalidate();
//            }
//            // rebuild session
//            req.getSession();
//
//
//        return new ModelAndView("index");
//    }


//
//    @RequestMapping(value="/exit", method = RequestMethod.GET)
//    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if (auth != null){
//            new SecurityContextLogoutHandler().logout(request, response, auth);
//        }
//        return "redirect:/new";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
//    }
//
//        @RequestMapping("/exit")
//        public void exit(HttpServletRequest request, HttpServletResponse response) {
//            // token can be revoked here if needed
//            new SecurityContextLogoutHandler().logout(request, null, null);
//            try {
//                //sending back to client app
//                response.sendRedirect(request.getHeader("/new"));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//    private Facebook facebook;
//    private ConnectionRepository connectionRepository;
//
//    public MainController(Facebook facebook, ConnectionRepository connectionRepository) {
//        this.facebook = facebook;
//        this.connectionRepository = connectionRepository;
//    }
//
//    @RequestMapping(value = "feed", method = RequestMethod.GET)
//    public String feed(Model model) {
//
//        if(connectionRepository.findPrimaryConnection(Facebook.class) == null) {
//            return "redirect:/connect/facebook";
//        }
//
//        User userProfile = facebook.userOperations().getUserProfile();
//        model.addAttribute("userProfile", userProfile);
//        PagedList<Post> userFeed = facebook.feedOperations().getFeed();
//        model.addAttribute("userFeed", userFeed);
//        return "feed";
//    }

//
//    @GetMapping("/exit")
//    public ResponseEntity logout(@CookieValue(value = "access_token") String access_token,
//                                 HttpServletResponse httpServletResponse) {
//        Cookie cookie = new Cookie("access_token", "");
//        cookie.setHttpOnly(true);
//        cookie.setSecure(true);
//        cookie.setMaxAge(0);
//        httpServletResponse.addCookie(cookie);
//        return ResponseEntity.ok().build();
//    }
}
