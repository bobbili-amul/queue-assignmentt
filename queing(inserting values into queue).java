import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.servlet.*;
import javax.servlet.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet {
 
  private String message;
     
   
Queue queue;

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {

queue = new LinkedList<Integer>();

 
 String s1 = request.getParameter("num1");
int number1= Integer.parseInt(s1);



 String s2 = request.getParameter("num2");
int numbe2= Integer.parseInt(s2);


 String s3 = request.getParameter("num3");
int number3= Integer.parseInt(s3);

 String s4 = request.getParameter("num4");
int number4= Integer.parseInt(s4);


 String s5 = request.getParameter("num5");
int number5= Integer.parseInt(s5);


queue.add(number1);
queue.add(number2);

queue.add(number3);

queue.add(number4);

queue.add(number5);

response.setContentType("text/html");

PrintWriter pw=response.getWriter();
  pw.println("Values Inserted sucessfully");

pw.println("do you wish to dequeue if enetr 2");

Scanner sc=new Scanner(System.in);

int ch=sc.nextInt();



if(ch==2)
{
RequestDispatcher rd=new RequestDispatcher(deque.html);

rd.forward(request,response);
}
else
{
pw.println("thank you");
     
  }
  
  
}