package filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Filter
 * Package: servlet
 * Description:
 *
 * @Author CBX
 * @Create 1/9/24 14:36
 * @Version 1.0
 */
@WebFilter(
        filterName = "loggingFilter",
        initParams = {@WebInitParam(name = "dateTimePattern", value = "yyyy-mm-dd HH:mm:ss")},
        urlPatterns = {"*.html", "/servlet1"})
public class LoggingFilter implements Filter {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        // downCasting
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // log texts
        String requestURI = request.getRequestURI();
        String time = dateFormat.format(new Date());
        String beforeLogin = requestURI + " was requested at " + time;

        // print the log
        System.out.println(beforeLogin);

        // get time before execute doFilter()
        long currentTimeMillis1 = System.currentTimeMillis();

        // let request go
        filterChain.doFilter(request, response);

        // get time after executing doFilter()
        long currentTimeMillis2 = System.currentTimeMillis();

        // compromise log texts
        String afterLogin = "spent " + (currentTimeMillis2 - currentTimeMillis1) + " milliseconds for processing the request of " + requestURI + " which was requested at " + time;
        // print the log
        System.out.println(afterLogin);


    }
}
