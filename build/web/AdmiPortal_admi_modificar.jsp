<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width,
              initial-scale=1.0">
        <title>Portal del Administrador/Administradores</title>
        <link rel="stylesheet"
              href="css/style_admin.css">
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/registro_admi.css">
        <link rel="stylesheet"
              href="css/dash_admi_listar.css">
    </head>

    <body>

        <!-- for header part -->
        <header>

            <div class="logosec">		
                <img src=
                     "https://media.geeksforgeeks.org/wp-content/uploads/20221210182541/Untitled-design-(30).png"
                     class="icn menuicn"
                     id="menuicn"
                     alt="menu-icon">
                <div class="logo">Portal Administrador</div>
            </div>


            <div class="message">
                <div class="dp">
                    <img src=
                         "https://media.geeksforgeeks.org/wp-content/uploads/20221210180014/profile-removebg-preview.png"
                         class="dpicn"
                         alt="dp">
                </div>
            </div>
        </header>

        <div class="main-container">
            <div class="navcontainer">
                <nav class="nav">
                    <div class="nav-upper-options">
                        <div class="nav-option option1">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2104/PNG/96/manager_icon_129392.png"
                                 class="nav-img"
                                 alt="dashboard">
                            <a class="nav-link" href="1_AdmiPortalPrincipal.jsp"><h5>Administradores</h5></a>
                        </div>
                        <div class="option2 nav-option">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2104/PNG/96/teamwork_icon_129427.png"
                                 class="nav-img"
                                 alt="articles">
                            <a class="nav-link" href="AdmiPortal_prof.jsp"><h5>Profesores</h5></a>
                        </div>
                        <div class="nav-option option3">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2104/PNG/96/curriculum_vitae_icon_129369.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="AdmiPortal_alum.jsp"><h5>Alumnos</h5></a>
                        </div>
                        <div class="nav-option option4">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2104/PNG/96/graphic_design_icon_129286.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="AdmiPortal_actividad.jsp"><h5>Eventos</h5></a>
                        </div>
                        <div class="nav-option option5">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2104/PNG/96/calendar_icon_129357.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="AdmiPortal_horario.jsp"><h5>Horario</h5></a>
                        </div>
                        <div class="nav-option logout">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486321-arrow-back-player-music-multimedia-left-rewind_81210.png"
                                 class="nav-img"
                                 alt="logout">
                            <a class="nav-link" href="Intranet.jsp"><h5>Salir</h5></a>
                        </div>
                    </div>
                </nav>
            </div>

            <!-- Modificar -->



            <div class="main" style="background: #e4f4fd">
                <div class="box-container">

                    <div class="container" id="advanced-search-form" style="margin: auto;">

                        <form  action="AdministradorControl" method="post" >
                            <% Object[] f = (Object[]) session.getAttribute("f");%>
                            <table class="table">
                                <th class="table-dark text-center" colspan="2">
                                    <h1>Editar Administrador</h1>
                                    <br><br>
                                </th>

                                <tbody class="table-light">
                                    <tr>
                                        <td class="text-center align-middle">Código administrador</td>
                                        <td> <input class="form-control" type="text" name="IDadm" value='<%= f[0]%>'/> </td>
                                    </tr>      
                                    <tr>
                                        <td class="text-center align-middle">Nombre</td>
                                        <td> <input class="form-control" type="text" name="nbadm" value='<%= f[1]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Apellido</td>
                                        <td> <input class="form-control" type="text" name="apadm" value='<%= f[2]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">DNI </td>
                                        <td> <input class="form-control" type="number" name="ndni" /> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Género </td>
                                        <td> <select class="form-control" name="gen" value='<%= f[3]%>'>
                                                <option value="Masculino">Masculino</option> 
                                                <option value="Femenino" selected>Femenino</option>
                                                </select> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Email</td>
                                        <td> <input class="form-control" type="email" name="email" value='<%= f[5]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Número de celular</td>
                                        <td> <input class="form-control" type="tel" name="ncel" value='<%= f[6]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Usuario de administrador</td>
                                        <td> <input class="form-control" type="text" name="usuadm" value='<%= f[7]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Contraseña de administrador</td>
                                        <td> <input class="form-control" type="text" name="passadm" value='<%= f[8]%>'/> </td>
                                    </tr>
                                </tbody>

                            </table>
                            <div class="text-center ">
                                <input type="submit" name="acc"   value="Actualizar" class="btn btn-dark fs-4 mt-3 mb-3 btn-sm">
                                <input type="submit" name="acc"   value="Eliminar" class="btn btn-dark fs-4 mt-3 mb-3 btn-sm">
                            </div>
                        </form>
                    </div>
                </div></div>



        </div>    
    </body>

    <script>
        let menuicn = document.querySelector(".menuicn");
        let nav = document.querySelector(".navcontainer");

        menuicn.addEventListener("click", () =>
        {
            nav.classList.toggle("navclose");
        })
    </script>
</html>