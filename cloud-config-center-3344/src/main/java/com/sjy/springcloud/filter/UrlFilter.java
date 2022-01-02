package com.sjy.springcloud.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: xstre
 * Date: 2022/1/2
 * Time: 14:06
 * Description: No Description
 */
@WebFilter("*")
public class UrlFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        String uri = request1.getRequestURI();
        System.out.println(uri);
        if(!uri.endsWith("/actuator/bus-refresh")) {
            chain.doFilter(request, response);
            return;
        }
        String body = (request).toString();
        System.out.println("original body: " + body);
        ServletRequestWrapper servletRequestWrapper = new ServletRequestWrapper(request);
        chain.doFilter(servletRequestWrapper, response);
    }

    private class RequestWrapper extends HttpServletRequestWrapper {
        public RequestWrapper(HttpServletRequest request) {
            super(request);
        }

        @Override
        public ServletInputStream getInputStream() throws IOException {
            byte[] bytes = new byte[0];
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            ServletInputStream servletInputStream = new ServletInputStream() {
                @Override
                public int read() throws IOException {
                    return byteArrayInputStream.read();
                }

                @Override
                public boolean isFinished() {
                    return byteArrayInputStream.read() == -1 ? true : false;
                }

                @Override
                public boolean isReady() {
                    return false;
                }

                @Override
                public void setReadListener(ReadListener listener) {

                }
            };
            return servletInputStream;
        }


    }
}
