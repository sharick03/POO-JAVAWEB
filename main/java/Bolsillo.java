import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bolsillo.Daviplata;

public class Bolsillo extends HttpServlet { /*heredacion de clase externa java */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sc=req.getParameter("sc");
        System.out.println(sc);
        switch(sc){
            case "ingresar":
            req.getRequestDispatcher("login.jsp").forward(req, resp);
            break;
            case "registro":
            req.getRequestDispatcher("registro.jsp").forward(req, resp);
            break;
            case "bolsillos":
            req.getRequestDispatcher("bolsillos.jsp").forward(req, resp);
            break;

            case "dashboard":
            req.getRequestDispatcher("dashboard.jsp").forward(req, resp);
            break;
            case "volver":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "consultar":
            req.setAttribute("dinero",consulta.consultarSaldo());
            req.getRequestDispatcher("consultar.jsp").forward(req, resp);
            break;
            case "retirar":
            req.getRequestDispatcher("retirar.jsp").forward(req, resp);
            break;
            case "recargar":
            req.getRequestDispatcher("recargar.jsp").forward(req, resp);
            break;
        }
    }
    Daviplata consulta=new Daviplata();
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sc=req.getParameter("sc");
        System.out.println(sc);
            switch(sc){
                case "consultar":
                req.getRequestDispatcher("consultar.jsp").forward(req, resp);
                break;

                case "retirar":
                int cantRetiro=Integer.parseInt(req.getParameter("retirar"));
                consulta.setRetiro(cantRetiro);
                req.setAttribute("dinero", consulta.retirarDinero());
                req.getRequestDispatcher("resultadoretiro.jsp").forward(req, resp);
                break;

                case "recargar":
                int cantRecarga=Integer.parseInt(req.getParameter("recargar"));
                consulta.setRecargar(cantRecarga);
                req.setAttribute("dinero", consulta.recargarCuenta());
                req.getRequestDispatcher("resultadorecarga.jsp").forward(req, resp);
                break;
    
    
            }
        }
    }


