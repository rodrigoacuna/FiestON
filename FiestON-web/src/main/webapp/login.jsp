<%-- 
    Document   : validacion
    Created on : 07-may-2016, 3:11:09
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <!-- Meta, title, CSS, favicons, etc. -->
            <meta charset="utf-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1">

                        <title>FiestON Uy! </title>

                        <!-- Bootstrap core CSS -->

                        <link href="css/bootstrap.min.css" rel="stylesheet">

                            <link href="fonts/css/font-awesome.min.css" rel="stylesheet">
                                <link href="css/animate.min.css" rel="stylesheet">

                                    <!-- Custom styling plus plugins -->
                                    <link href="css/custom.css" rel="stylesheet">
                                        <link href="css/icheck/flat/green.css" rel="stylesheet">


                                            <script src="js/jquery.min.js"></script>

                                            <!--[if lt IE 9]>
                                                  <script src="../assets/js/ie8-responsive-file-warning.js"></script>
                                                  <![endif]-->

                                            <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
                                            <!--[if lt IE 9]>
                                                    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
                                                    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
                                                  <![endif]-->

                                            </head>

                                            <body style="background:#F7F7F7;">
                                            
                                                <div class="">
                                                    <a class="hiddenanchor" id="toregister"></a>
                                                    <a class="hiddenanchor" id="tologin"></a>

                                                    <div id="wrapper">
                                                        <div id="login" class="animate form">
                                                            <section class="login_content">
                                                                <form action="validarUsr" method="POST">
                                                                    <h1>Login FiestOn!</h1>
                                                                    <div>
                                                                        <input name ="usu" type="text" class="form-control" placeholder="Usuario" required="" />
                                                                    </div>
                                                                    <div>
                                                                        <input name="pas" type="password" class="form-control" placeholder="Contrasena" required="" />
                                                                    </div>
                                                                    <div>
                                                                        <!-- <input name="submit" type="submit" value ="LOOOOG"/>-->
                                                                        
                                                                        <%String errores = (String)request.getAttribute("error");
                                                                       if (errores!=null){%>
                                                                       <p style="color: red">
                                                                           <%=errores%>
                                                                         </p>  
                                                                         <%}%><input type="submit" class="btn btn-default submit" value ="Ingresar"/>
                                                                        <!-- <a class="reset_pass" href="#">No recuerda su contraseña?</a> -->
                                                                    </div>
                                                                    <div class="clearfix"></div>
                                                                    
                                                                   <% request.getAttribute("result");%>    

                                                                    <div class="separator">
                                                                        <p class="change_link">Nuevo usuario?
                                                                            <a href="#toregister" class="to_register"> Crear cuenta </a>
                                                                        </p> 
                                                                        <div class="clearfix"></div>
                                                                        <br />
                                                                        <div>
                                                                            <h1><i class="fa fa-paw" style="font-size: 26px;"></i> FiestON uy!</h1>

                                                                           <!-- <p>©2015 All Rights Reserved. FiestON!. Privacy and Terms</p> -->
                                                                        </div>
                                                                    </div>
                                                                </form>
                                                                <!-- form -->
                                                            </section>
                                                            <!-- content -->
                                                        </div>
                                                        <div id="register" class="animate form">
                                                            <section class="login_content">
                                                                <form form action="nuevoUsr" method="POST">
                                                                    <h1>Create Account</h1>
                                                                    <div>
                                                                        <input name = "usuario" type="text" class="form-control" placeholder="Username" required="" />
                                                                    </div>
                                                                    <div>
                                                                        <input name = "email" type="email" class="form-control" placeholder="Email" required="" />
                                                                    </div>
                                                                    <div>
                                                                        <input name = "password" type="password" class="form-control" placeholder="Password" required="" />
                                                                    </div>
                                                                    <div>
                                                                        <input type="submit" class="btn btn-default submit" value ="Submit"/>
                                                                    </div>
                                                                    <div class="clearfix"></div>
                                                                    <div class="separator">

                                                                        <p class="change_link">Already a member ?
                                                                            <a href="#tologin" class="to_register"> Log in </a>
                                                                        </p>
                                                                        <div class="clearfix"></div>
                                                                        <br />
                                                                        <div>
                                                                            <h1><i class="fa fa-paw" style="font-size: 26px;"></i> Gentelella Alela!</h1>

                                                                            <p>©2015 All Rights Reserved. Gentelella Alela! is a Bootstrap 3 template. Privacy and Terms</p>
                                                                        </div>
                                                                    </div>
                                                                </form>
                                                                <!-- form -->
                                                            </section>
                                                            <!-- content -->
                                                        </div>
                                                    </div>
                                                </div>

                                            </body>

                                            </html>
