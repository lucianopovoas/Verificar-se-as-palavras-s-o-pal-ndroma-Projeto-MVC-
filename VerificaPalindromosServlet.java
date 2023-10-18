import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VerificaPalindromosServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String palavra1 = request.getParameter("palavra1");
        String palavra2 = request.getParameter("palavra2");

        boolean palindromo1 = isPalindromo(palavra1);
        boolean palindromo2 = isPalindromo(palavra2);

        request.setAttribute("palavra1", palavra1);
        request.setAttribute("palindromo1", palindromo1);
        request.setAttribute("palavra2", palavra2);
        request.setAttribute("palindromo2", palindromo2);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    private boolean isPalindromo(String palavra) {
        palavra = palavra.toLowerCase();
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }
}
