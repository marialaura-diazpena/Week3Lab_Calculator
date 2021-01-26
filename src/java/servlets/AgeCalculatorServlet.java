
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 807930
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String ageEntered = request.getParameter("ageEntered");
        
        
        if (ageEntered == null|| ageEntered.equals("")){
            request.setAttribute("ageMessage", "You must give your current age.");
            
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
        }
        try {
            
            int age = Integer.parseInt(ageEntered)+1;
            request.setAttribute("ageMessage", "Your age next birthday will be " + age);
        }
        catch (NumberFormatException e) {
            request.setAttribute("ageMessage", "You must enter a number.");
            
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
        
    }

}
