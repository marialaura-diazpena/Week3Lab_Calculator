
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
public class arithmeticCalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
        getServletContext().setAttribute("message", "---");
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String firstValue = request.getParameter("firstValue");
        String secondValue = request.getParameter("secondValue");
        
        request.setAttribute("firstValue", firstValue);
        request.setAttribute("secondValue", secondValue);
        
        if (firstValue == null || firstValue.equals("") || secondValue == null || secondValue.equals("")) {
            request.setAttribute("message", "Invalid");
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);   
        }
        
        try {
            int value1 = Integer.parseInt(firstValue);
            int value2 = Integer.parseInt(secondValue);
            
            if (request.getParameter("plus")!=null){
                int plusResult = value1 + value2;
                request.setAttribute("message", plusResult);                
            }
            if (request.getParameter("minus")!=null){
                int minusResult = value1 - value2;
                request.setAttribute("message", minusResult);
            }
            if (request.getParameter("multiply")!=null){
                int multiplyResult = value1 * value2;
                request.setAttribute("message", multiplyResult);
            }
            if (request.getParameter("modulus")!=null){
                int modulusResult = value1 % value2;
                request.setAttribute("message", modulusResult);
            }
            
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid");
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }


}
