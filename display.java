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

response.setContenetType("text/html");
PrintWriter pw=response.getPrintWriter();
pw.("<html><body> values in queue are</body></html>");

 if(front < rear ) 
{
         for(int i = front; i != rear; i++ ) 
{
              System.out.println(i +":> " + queue[i]);
         }
    }
     else {
         for(int i = front; i != rear; i= (i + 1) % SIZE ) 
{
              System.out.println(i +":> " + queue[i]);
         }
     }
}