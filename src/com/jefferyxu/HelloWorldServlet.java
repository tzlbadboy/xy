package com.jefferyxu;  
import java.io.IOException;  
import java.io.PrintWriter;  

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
/** 
 * @author jefferyxu 
 * 
 */  
public class HelloWorldServlet extends HttpServlet {  
    /* (non-Javadoc) 
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse) 
     */  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        // TODO Auto-generated method stub  
          
    	resp.setContentType("text/html; charset=gb2312");
    	ServletContext sc = getServletContext();
    	RequestDispatcher rd = null;
    	rd = sc.getRequestDispatcher("/index.jsp"); //定向的页面
    	rd.forward(req, resp);
    }  
    /** 
     *  
     */  
    private static final long serialVersionUID = 1L;  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
    }  
}  