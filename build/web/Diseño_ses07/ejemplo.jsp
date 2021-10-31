<%-- 
    Document   : ejemplo
    Created on : 24/10/2021, 10:54:18 AM
    Author     : josek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <link href="css/stylepersonal.css" rel="stylesheet" type="text/css"/>
      <link href="css/bootstrap.min_personal.css" rel="stylesheet" type="text/css"/>
      <script src="<%=request.getContextPath()%>/Diseño_ses07/js/juery_personal.js"></script>
      <script src="<%=request.getContextPath()%>/Diseño_ses07/js/boostrap.min.js"></script>
      <script type="text/javascript">
         jQuery()(function($)
         {   $('#carousel1').carourel({
              interval:1000
           });
                   var clickEvent=false;
                           $('#carousel1').on('click','.nav a', function(){
                              clickEvent=true;
                              $('.nav li').removeClass('active');
                              $(this).parent().addClass('active');
                           }).on('slid.bs.carousel1', function(e){
                              if(!clickEvent){
                                 var count=$('nav').children().length -1;
                                 var current=$('nav li.active');
                                 current.removeClass('active').next().addClass('active');
                                 var id=parseInt(current.data('slide-to'));
                                 if(count==id){
                                    $('.nav li').first().addClass('active');
                                 }
                              }
                              clickEvent=false;
                           });
           )};
      </script>
      
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>EJEMPLO</title>
      
   </head>
   <body>
      
      <div class="wrapper">
      <div class="container header_top">
         <img src="imagenes/encabezado.jpg" alt="" width="100%"/>
         <nav class="navbar navbar-default" role="navigation">
           
            <!--Aca va el boton de nuestra pag. ejemplo6 de la ppt-->
            <div class="navbar-header">
               <button type="button" class="navbar-toggle" data-toogle="collapse" data-target=".nabar-exl-collapse">
                  
                  <span class="sr-only">Desplegar navegacion</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
               </button>
            </div>

            <div class="collapse navbar-collapse navbar-exl-collapse">
               
               <ul class="nav navbar-nav">
                  <li class="dropdown">
                     <a href="#">
                        <img src="<%= request.getContextPath()%>/Diseño_ses07/imagenes/main.png" alt="Principal"/>Principal
                     </a>
                  </li>
               </ul>
               
                     <ul class="nav navbar-nav">
                        <li class="dropdown">
                           <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                              <img src="imagenes/mantenimiento.png" alt="Ir Mantenimiento"/>Mantenimiento<b class="caret"></b>
                           </a>
                           <ul class="dropdown-menu">
                              <li><a href="#">Semestre</a></li>
                              <li><a href="#">Carrera Profesional</a></li>
                              <li><a href="#">Alumno</a></li>
                              <li><a href="#">Docente</a></li>
                              <li><a href="#">Materia</a></li>
                              <li><a href="#">Unidad Tematica</a></li>
                              <li><a href="#">Tema</a></li>
                              <li><a href="#">Tipo Examen</a></li>
                              <li><a href="#">Rol</a></li>
                              <li><a href="#">Nivel Dificultad</a></li>
                           </ul>
                        </li>
                     </ul>
                     
            </div>
            
         </nav>
      </div>
      
      
      <div class="container">
         <div class="row">
            
            <!--Aca esta la implementacion de la diapositiva 43 -->
            <div id="contenido">
               <div id="carousel1" class="carousel slide" data-ride="carousel">
                  <div class="carousel-inner">
                     <div class="item-active">
                        <img src="imagenes/principal3.png" width="100%" height="100%" alt="" src="<%=request.getContextPath()%>/Diseño_ses07/imagenes/principal2.png"/>
                        <div class="carousel-caption">
                           <div class="col lg-12 text-center v-center" style="font-size: 35px;">
                              <a href="#"><span class="avatar"><i class="fa fa-google-plus"></i></span></a>
                              <a href="#"><span class="avatar"><i class="fa fa-linkedin"></i></span></a>
                              <a href="#"><span class="avatar"><i class="fa fa-facebook-f"></i></span></a>
                              <a href="#"><span class="avatar"><i class="fa fa-github"></i></span></a>
                              
                           </div>
                        </div>
                     </div>
                        <div class="item">
                           <img src="<%=request.getContextPath()%>imagenes/principal1.png" alt=""height="100%" width="100%"/>
                        </div>
                  </div>
               </div>
            </div>
                        
         </div>
      </div>
      

      <div class="conatiner footer">
         <div class="footer_bottom">
            <div class="copy">
            <p>Derechos Reservados por Ign.Jose Luis Vasqez Mendez</p>
            </div>
            <ul class="social">
               <li><a href="#"><i class="fb"></i></a></li>
               <li><a href="#"><i class="tw"></i></a></li>
            </ul>
         </div>
      </div>
      </div>
         
   </body>
</html>
