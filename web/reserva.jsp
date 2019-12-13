<%-- 
    Document   : reserva
    Created on : 11 dic. 2019, 23:22:24
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
        <link rel="stylesheet" href="css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
        <title>Reserva</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div><h5>Seleccione Cinema:</h5></div>
                 <select>
                    <option value="1">metro</option>
                    <option value="2">cinemax</option>
                    <option value="3">Corioto</option>
                    
                  </select> 
            </div>
            <div class="row">
                <div class="container">
                        <h5>Seleccionar pelicula</h5>
                </div>
                <% for (int i=0;i<=12;i++){%>
                <div class="col-3">
                    
                        <div class="container">
                        <img src="img/cartelera1.jpg" alt="Avatar" class="img-fluid">
                        <div>
                            <div class="tex-center">
                                <h5><b>Carlos Cowboy</b></h5>
                                <p>Genero Comedia</p>
                              </div>
                        </div>
                        
                         
                    </div>
                    
                
            </div>
            <% } %>
        </div>
    </div>
    </body>
</html>
