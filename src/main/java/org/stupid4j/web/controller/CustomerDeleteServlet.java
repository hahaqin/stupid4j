package org.stupid4j.web.controller;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 删除客户
 * Created by yangsiqin on 2017/6/30.
 */
@WebService("/cutomer_delete")
public class CustomerDeleteServlet extends HttpServlet {

    /**
     * 删除客户
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //TODO
    }
}
