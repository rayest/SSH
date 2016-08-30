package cn.rayest.action;

import cn.rayest.entity.User;
import cn.rayest.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Rayest on 2016/8/31 0031.
 */
@Controller
public class UserAction extends ActionSupport implements ServletRequestAware {

    private HttpServletRequest request;
    private User user;
    private String error;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Resource
    private UserService userService;

    public String login() {
        HttpSession session = request.getSession();
        User currentUser = userService.findUserByNameAndPassword(user);
        if (currentUser != null) {
            session.setAttribute("currentUser", currentUser);
            return SUCCESS;
        } else {
            error = "用户名或密码错误";
            return ERROR;
        }
    }

    public void setServletRequest(HttpServletRequest request) {
        this.request = request;

    }
}
