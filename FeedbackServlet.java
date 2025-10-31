import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FeedbackServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String feedback = request.getParameter("feedback");

        out.println("<html><body>");
        out.println("<h1>Thank You, " + name + "!</h1>");
        out.println("<p>Your feedback has been received successfully.</p>");
        out.println("<p><b>Email:</b> " + email + "</p>");
        out.println("<p><b>Feedback:</b> " + feedback + "</p>");
        out.println("</body></html>");
    }
}
