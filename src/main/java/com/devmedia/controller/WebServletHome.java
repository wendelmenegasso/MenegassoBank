package com.devmedia.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home/")
public class WebServletHome extends HttpServlet {
    public WebServletHome() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);

    }
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.getWriter();
        request.setAttribute("/testLogin",new ClienteController().testLogin(request,response));
        request.setAttribute("/logout", new ClienteController().logout());
    }
}
