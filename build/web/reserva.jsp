<%-- 
    Document   : reserva
    Created on : 11 dic. 2019, 23:22:24
    Author     : blade
--%>

<%@page import="Modelo.Pelicula"%>
<%@page import="java.util.ArrayList"%>

<%@page import="Modelo.Cine"%>
<%@page pageEncoding="UTF-8"%>
<%
    HttpSession sesion=request.getSession(false);
    String usuario=(String)sesion.getAttribute("usuario");
    if(usuario==null||usuario.equals(""))
    {
        response.sendRedirect("login.jsp");
    }else{
        Cine miCine=null;
        Pelicula miPeli=null;
        
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
        <div class="container" id="app">
            
            <header class="text-center">
                <h1>Cinemas Moon</h1>
                <br>
                <h2>Reserva de Peliculas</h2>
            </header>
            
                
                <jsp:useBean id="list" class="DAO.CineDao" scope="page"></jsp:useBean>
                <div class="container" id="main">
                    <br>
                    <br>
                     <div class="text-center"><h3>Seleccione Cinema:</h3></div>
                     <br>
                     <div class="row">
                            <%
                             for(Cine cine:list.listar()){
                                 %>
                                 <div class="col-sm-4">
                                    <div class="card">
                                      <div class="card-body">
                                        <h5 class="card-title"><%=cine.getNombre()%> </h5>
                                        <p class="card-text">Ubicacion: <%=cine.getDireccion()%></p>
                                        <p class="card-text">Telefono: <%=cine.getTelefono() %></p>
                                        <button  class="btn btn-primary" v-on:click="verPeliculas(<%=cine.getIdcine()%>)">Ver Certelera</button>
                                        
                                      </div>
                                    </div>
                                  </div>
                         <%
                             }
                         %>
                    </div>
                     
                     
             
                   
    </div>
       
    </div>
       <script type="text/javascript" src="js/vue.js"></script>
       <script type="text/javascript" src="https://unpkg.com/axios/dist/axios.min.js"></script>
        <script type="text/javascript" src="js/reserva.js"></script>
        
    
    </body>
     
   
    
   
</html>
