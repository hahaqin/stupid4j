package org.stupid4j.web.controller;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 进入客户列表页面
 * Created by yangsiqin on 2017/6/30.
 */
@WebService("/customer")
public class CustomerServlet extends HttpServlet {

    /**
     * 进入 客户列表 页面
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO
    }
}
