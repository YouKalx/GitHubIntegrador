
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
        <title>Portal del Administrador/Horarios</title>

        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/registro_prof.css">
        <link rel="stylesheet"
              href="css/admiPortal_horario.css">
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

            <!-- Registro -->

            <div class="main" style="background: #e4f4fd">
                <div class="box-container">

                    <div class="container" id="advanced-search-form">
                        <h2>Registro de Horario</h2>
                        <form action="HorarioControl" method="post">
                            
                            <div class="form-group">
                                <label>Código del horario</label><br>
                                <input type="text" class="form-control"  name="codho">
                            </div>
                            <div class="form-group">
                                <label>Turno de horario</label><br>
                                <select class="form-control" name="tur">
                                    <option value="Mañana">Mañana</option>
                                    <option value="Tarde">Tarde</option>
                                    <option value="Noche">Noche</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label>Desde la </label>
                                <input type="time" class="form-control" name="hoini">
                            </div>
                            <div class="form-group">
                                <label>Hasta la </label>
                                <input type="time" class="form-control" name="hofin">
                            </div>
                            <div class="form-group">
                                <label>¿Hay clases los Lunes?</label><br>
                                <select class="form-control" name="lun">
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>
                                </select>
                            </div>  
                            <div class="form-group">
                                <label>¿Hay clases los Martes?</label><br>
                                <select class="form-control" name="mar">
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>
                                </select>
                            </div>  
                            <div class="form-group">
                                <label>¿Hay clases los Miércoles?</label><br>
                                <select class="form-control" name="mie">
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>
                                </select>
                            </div>  
                            <div class="form-group">
                                <label>¿Hay clases los Jueves?</label><br>
                                <select class="form-control" name="jue">
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>
                                </select>
                            </div>  
                            <div class="form-group">
                                <label>¿Hay clases los Viernes?</label><br>
                                <select class="form-control" name="vie">
                                    <option value="Si">Si</option>
                                    <option value="No">No</option>
                                </select><br>
                            </div>
                            
                            
                            <div class="clearfix"></div>
                            <div class="text-center ">
                                <br><br><input type="submit" name="acc" value="Registrar" class="btn btn-dark fs-3 mt-4 mb-4 btn-lg">
                            </div>

                        </form>
                    </div>
                </div>            	
            </div>
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