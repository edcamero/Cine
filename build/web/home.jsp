<%-- 
    Document   : home
    Created on : 9 dic. 2019, 19:50:44
    Author     : blade
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession sesion=request.getSession(false);
    String usuario=(String)sesion.getAttribute("usuario");
    if(usuario==null||usuario.equals(""))
    {
        response.sendRedirect("login.jsp");
    }
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cine Moon</title>
    </head>
    <body>
        <div class="container">
            <div class="headertitle">
              <h1 class="pagetitle">Bienvenido a Cine Moon</h1>
              <span class="pagedesc">Aquí podras reservar de forma on-line tus peliculas preferidas</span> </div>
              
              <h3>
                  Menu
|             </h3>
            
            <ul>
                <li>Reservas
                    <ul>
                                <li><a href="https://developer.mozilla.org">Nueva Reserva </a></li>  
                                <li><a>Mis Reservas </a></li>  
                            
                    </ul>
                </li>
                
            </ul>
            
          </div>
    </body>
</html>
