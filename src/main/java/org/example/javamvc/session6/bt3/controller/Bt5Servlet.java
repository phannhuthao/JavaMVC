package org.example.javamvc.session6.bt3.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/gameBt5")
public class Bt5Servlet extends HttpServlet {
    private static final String[] choices = {"Búa", "Kéo", "Lá"};

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String choiceUser = request.getParameter("choiceUser");

        // Tạo lựa chọn ngẫu nhiên cho máy
        String choiceMachine = choices[new Random().nextInt(choices.length)];

        String winner;
        if (choiceUser.equals(choiceMachine)) {
            winner = "Hòa!";
        } else if (
                (choiceUser.equals("Búa") && choiceMachine.equals("Kéo")) ||
                        (choiceUser.equals("Kéo") && choiceMachine.equals("Lá")) ||
                        (choiceUser.equals("Lá") && choiceMachine.equals("Búa"))
        ) {
            winner = "Bạn thắng!";
        } else {
            winner = "Máy thắng!";
        }

        request.setAttribute("choiceUser", choiceUser);
        request.setAttribute("choiceMachine", choiceMachine);
        request.setAttribute("winner", winner);

        request.getRequestDispatcher("/Session6/Bt5/game.jsp").forward(request, response);
    }
}
