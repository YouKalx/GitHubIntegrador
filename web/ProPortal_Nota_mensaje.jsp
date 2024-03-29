<%-- 
    Document   : ProPortal_Nota_mensaje
    Created on : 4 jul. 2023, 16:47:20
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
        <title>Portal del Docente</title>
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/responsive">
        <link rel="stylesheet"
              href="css/registro_prof.css">
        <link rel="stylesheet"
              href="css/admiPortal_alum.css">
    </head>
    <body>
        <header>
            <div class="logosec">		
                <div class="logo">Portal del Docente</div>
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
                            <a class="nav-link" href="ProPortal_Inicio.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Inicio"></h5></a>
                        </div>
                        <div class="option2 nav-option">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/370/PNG/512/Users2_37173.png"
                                 class="nav-img"
                                 alt="articles">
                            <a class="nav-link" href="ProPortal_Perfil.jsp"><h5><form action="ProfesorControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Perfil"></form></h5></a>
                        </div>
                        <div class="nav-option option3">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486287-align-left-paragraph-text-text-control_81239.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="ProPortal_Nota.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent; color: white" type="submit" name="acc" value="Nota"></h5></a>
                        </div>
                        <div class="nav-option option4">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="ProPortal_Horario.jsp"><h5><form action="HorarioControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Horario Doc"></form></h5></a>
                        </div>
                        <div class="nav-option option5">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="blog">
                           <a class="nav-link" href="ProPortal_Eventos.jsp"><h5><form action="ActividadesControl" method="post"><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Eventos Doc"></form></h5></a>
                        </div>
                        <div class="nav-option option6">
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
                    <div class="container" id="advanced-search-form">
                        <h2>Mensaje del Sistema</h2>
                        <div class="card">
                            <div class="card" style="width: 18rem;">
                                <% String msg = (String) session.getAttribute("msg");%>
                                <div align="center">
                                    <h2 class="card-text">Mensaje: <br> <%= msg%></h2>
                                </div>
                                <a href="ProPortal_Nota.jsp" class="boton" ><input type="submit" name="acc" value="Volver a Notas" style="background-color: green; border-radius: 8px; font-size: 20px; width: 100%; color:white"/></a>
                            </div> 
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script SameSite="None; Secure" src="https://cdn.landbot.io/landbot-3/landbot-3.0.0.js"></script>

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
