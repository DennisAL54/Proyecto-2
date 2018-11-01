import javax.servlet.http.*;

import java.io.*;
import javax.servlet.*;
import java.util.*;

public class RefreshServlet extends HttpServlet{
	
	//List<Message> list;
	static Message n1 = new Message("Toño",35 ,4, 20);
	static Message n2 = new Message("Ruben",19 ,1, 12);
	static Message n3 = new Message("Gabriel",19,3,52);
	
	/**
	
	public static List<Message> getAllMessages(){

		List<Message> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		System.out.println("Eliminar: "+n1.getNombre());
		System.out.println("Eliminar: "+n2.getNombre());
		System.out.println("Eliminar: "+n3.getNombre());

		return list;
	
	}
	**/
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		
		res.setContentType("text/html");
		
		PrintWriter pw = res.getWriter();
		res.setHeader("refresh", "1");
		
		
		//for(int i=0;i<list.size();i++){
		 //  pw.println(list.get(i));

		
		pw.println(n1.getNombre());
		
		pw.println(n2.getNombre());
		
		//pw.println(n3.getNombre());
		
		pw.close();
		
	}
	
	

}
