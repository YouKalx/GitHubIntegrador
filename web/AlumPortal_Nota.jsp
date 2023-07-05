<%-- 
    Document   : AlumPortal_Nota
    Created on : 4 jul. 2023, 16:37:48
    Author     : ShuKalx
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible"
              content="IE=edge">
        <meta name="viewport"
              content="width=device-width,
              initial-scale=1.0">
        <title>Portal del estudiante</title>
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/registro_admi.css">
        <link rel="stylesheet"
              href="css/dash_admi_listar.css">
        <link rel="stylesheet"
              href="css/admiPortal_alum.css">
        <link rel="stylesheet"
              href="css/alumportalinicio.css">
    </head>
    <body>
        <!-- for header part -->
        <header>
            <div class="logosec">		
                <div class="logo">Portal Alumno</div>
            </div>
            <div class="message">
                <div class="dp">
                </div>
            </div>
        </header>
        <div class="main-container">
            <div class="navcontainer">
                <nav class="nav">
                    <div class="nav-upper-options">
                        <div class="nav-option option1">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1151/PNG/512/1486505383-estate-home-building-shop-store-house-real_81431.png"
                                 class="nav-img"
                                 alt="dashboard">
                            <a class="nav-link" href="AlumPortal_Inicio.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Inicio"></h5></a>

                        </div>
                        <div class="option2 nav-option">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/370/PNG/512/Users2_37173.png"
                                 class="nav-img"
                                 alt="articles">
                            <a class="nav-link" href="AlumPortal_Perfil.jsp"><h5><form action="AlumnoControl" method="post"><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Perfil"></form></h5></a>
                        </div>
                        <div class="nav-option option3">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486287-align-left-paragraph-text-text-control_81239.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="AlumPortal_Nota.jsp"><h5><form action="NotaControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;color: white;" type="submit" name="acc" value="Notas"></form></h5></a>
                        </div>
                        <div class="nav-option option4">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="AlumPortal_Horario.jsp"><h5><form action="HorarioControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Horario Est"></form></h5></a>
                        </div>
                        <div class="nav-option option5">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="blog">
                            <a class="nav-link" href="AlumPortal_Eventos.jsp"><h5><form action="ActividadesControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Eventos Est"></form></h5></a>
                        </div>
                        <div class="nav-option option6">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1151/PNG/512/1486505376-folder-paper-storage-office-file-storage-data-storage-report_81411.png"
                                 class="nav-img"
                                 alt="blog">
                            <a class="nav-link" href="AlumPortal_TraSol.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Tramites"></h5></a>
                        </div>
                        <div class="nav-option option7">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486321-arrow-back-player-music-multimedia-left-rewind_81210.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="Intranet.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Salir"></h5></a>
                        </div>
                    </div>
                </nav>
            </div>

            <div class="main" style="background: #e4f4fd">
                <div class="box-container">
                    <div class="container" id="advanced-search-form" style="margin: auto;" >
                        <form  action="NotaControl" method="post" >
                            <% Object[] f = (Object[]) session.getAttribute("f");%>
                            <table class="table" style="align-items: center; margin: 0 auto" >
                                <th class="table-dark text-center" colspan="2">
                                    <h1>Mis Notas</h1>
                                    <br><br>
                                </th>

                                <tbody class="table-light" ;">
                                    <tr>
                                        <td class="text-center align-middle">Código alumno</td>
                                        <td> <input class="form-control" type="text" name="IDalu" value='<%= f[0]%>'/> </td>
                                    </tr>      
                                    <tr>
                                        <td class="text-center align-middle">Nombre</td>
                                        <td> <input class="form-control" type="text" name="nbalu" value='<%= f[1]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota 1 (20%):</td>
                                        <td> <input class="form-control" type="text" name="n1" value='<%= f[2]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota 2 (20%): </td>
                                        <td> <input class="form-control" type="number" name="n2" value='<%= f[3]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota 3 (20%):</td>
                                        <td> <input class="form-control" type="number" name="n3" value='<%= f[4]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota 4 (20%): </td>
                                        <td> <input class="form-control" type="number" name="n4" value='<%= f[5]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota 5 (20%):</td>
                                        <td> <input class="form-control" type="number" name="n5" value='<%= f[6]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Nota Final: </td>
                                        <td> <input class="form-control" type="number" name="nf" value='<%= f[7]%>'/> </td>
                                    </tr>
                                    <tr>
                                        <td class="text-center align-middle">Estado: </td>
                                        <td> <select class="form-control" name="estado" value='<%= f[8]%>'> 
                                                <option value="Aprobado">Aprobado</option> 
                                                <option value="Desaprobado">Desaprobado</option>
                                            </select></td> <br>
                                    </tr>
                                </tbody>
                            </table>
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
    <script>
        var myLandbot = new Landbot.Livechat({
            configUrl: 'https://storage.googleapis.com/landbot.online/v3/H-1649495-RTV5T6266CPDFM66/index.json',
        });
    </script>
</html>
