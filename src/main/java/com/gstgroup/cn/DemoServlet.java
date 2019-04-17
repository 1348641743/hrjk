package com.gstgroup.cn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		//判断是否正确
		if(checkuser(username,pass)){
//			System.out.println("输入正确");
//			 response.setCharacterEncoding("UTF-8"); // 先指定输出流的编码
//			 response.setContentType("text/html;charset=UTF-8");
//			 response.setCharacterEncoding("UTF-8");
//			
//			 
//			//正确，则进入另一个页面
//			request.setAttribute( "user",username);
			HttpSession session=request.getSession();
			session.setAttribute( "user",username);
			response.sendRedirect("suc.jsp");
//			request.getRequestDispatcher("suc.jsp").forward(request, response);
		}else{
			//不正确，则返回登录页面
			HttpSession session=request.getSession();
			session.setAttribute( "message","账号/密码错误，请重新登录");
			response.sendRedirect("index.jsp");
		}
	}

	public boolean checkuser(String username,String psw){
		
		if (username.equals("admin") && psw.equals("123")){
			return true;
		}
		return false;
	}
	public String stringTolow(String oldstring){
		
		return oldstring.toLowerCase();
	}
	
	 public int plus(int a,int b){
	        return a + b;
	    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
