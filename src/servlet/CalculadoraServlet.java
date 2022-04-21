package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class CalculadoraServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try {
			int param1 = Integer.parseInt(request.getParameter("param1"));
			int param2 = Integer.parseInt(request.getParameter("param2"));
			int operacion = Integer.parseInt(request.getParameter("param3"));
			String operacionString = null;
			int result = 0;
			switch (operacion) {
			case 1:
				result = param1 + param2;
				operacionString = "suma";
				break;
			case 2:
				result = param1 - param2;
				operacionString = "resta";
				break;
			case 3:
				result = param1 * param2;
				operacionString = "multiplicación";
				break;
			case 4:
				result = param1 / param2;
				operacionString = "división";
				break;
			}

			response.setStatus(200);
			PrintWriter out = response.getWriter();

			out.println("<!DOCTYPE HTML>");
			out.println("<HTML>");
			out.println("<HEAD>");
			out.println("<META charset=\"ISO-8859-1\">");
			out.println("<TITLE>Práctica 5a</TITLE>");
			out.println("</HEAD>");
			out.println("<BODY>");
			out.println("El resultado de la " + operacionString + " es: " + result);
			out.println("<BR><BR>");
			out.println("Fecha y hora: " + Calendar.getInstance().getTime().toString() + "<BR>");
			out.println("Navegador: " + request.getHeader("User-Agent") + "<BR>");
			out.println("Dirección IP: " + request.getRemoteAddr() + "<BR>");
			out.println("<BR><BR>");
			out.println("<A href=\"/Practica5a/index.html\">Volver a hacer un cálculo...</A>");
			out.println("</BODY>");
			out.println("</HTML>");
		} catch (NumberFormatException ex) {
			response.sendError(500, "Alguno de los números no contenía dígitos válidos...");
		} catch (ArithmeticException ex) {
			response.sendError(500, "Operación matemática no válida...");
		}
	}
}
