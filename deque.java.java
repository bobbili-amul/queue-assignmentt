import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.servlet.*;
import javax.servlet.*;
class deque extends HttpServlet 
{

 public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {



 
 String s1 = request.getParameter("num1");
int number1= Integer.parseInt(s1);



 String s2 = request.getParameter("num2");
int numbe2= Integer.parseInt(s2);



 String s3 = request.getParameter("num2");
int numbe3= Integer.parseInt(s2);



queue.remove(number1);
queue.remove(number2);
queue.remove(number3);

RequestDispatcher rd=request.getRequestDispatcher("dispaly.html");

rd.forward(request,response);
}
}
