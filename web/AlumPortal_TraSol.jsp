<%-- 
    Document   : AlumPortal_TS_TraSol
    Created on : 4 jul. 2023, 16:44:16
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
              href="css/alumportalinicio.css">
        <link rel="stylesheet"
              href="css/admiPortal_horario.css">


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
                            <a class="nav-link" href="AlumPortal_Perfil.jsp"><h5><form action="AlumnoControl" method="post"><input class="nav-link" style="border: none; background-color: transparent" type="submit" name="acc" value="Perfil"></form></h5></a>
                        </div>
                        <div class="nav-option option3">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486287-align-left-paragraph-text-text-control_81239.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="AlumPortal_Nota.jsp"><h5><form action="NotaControl" method="post"><input class="nav-link" style="border: none; background-color: transparent;" type="submit" name="acc" value="Notas"></form></h5></a>
                        </div>
                        <div class="nav-option option4">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="AlumPortal_Horario.jsp"><h5><form action="HorarioControl" method="post"><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Horario Est"></form></h5></a>
                        </div>
                        <div class="nav-option option5">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/2011/PNG/512/calendar_icon_123495.png"
                                 class="nav-img"
                                 alt="blog">
                           <a class="nav-link" href="AlumPortal_Eventos.jsp"><h5><form action="ActividadesControl" method="post"><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Eventos Est"></form></h5></a>
                        </div>
                        <div class="nav-option option6">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1151/PNG/512/1486505376-folder-paper-storage-office-file-storage-data-storage-report_81411.png"
                                 class="nav-img"
                                 alt="blog">
                            <a class="nav-link" href="AlumPortal_TraSol.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent; color: white" type="submit" name="acc" value="Tramites"></h5></a>
                        </div>
                        <div class="nav-option option7">
                            <img src=
                                 "https://cdn.icon-icons.com/icons2/1147/PNG/512/1486486321-arrow-back-player-music-multimedia-left-rewind_81210.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="Intranet.jsp"><h5><input class="nav-link" style="border: none; background-color: transparent; " type="submit" name="acc" value="Salir"></h5></a>
                        </div>


                </nav>
            </div>
            <div class="main">

                <div class="box-container">

                    <div class="container">
                        <p class="container-title">Hola, bienvenido a la sección de Trámites y Solicitudes</p>
                        <div class="gradient-cards">
                            <div class="card" >
                                <div class="container-card bg-green-box">
                                    <p class="card-title">Trámite: Beca</p>
                                    <p class="card-description">¿Desea saber como obtener una beca?</p>
                                    <a href="AlumPortal_TS_Beca.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
                            </div>
                            <div class="card">
                                <div class="container-card bg-white-box"> 
                                    <p class="card-title">Solicitud: Certificado</p>
                                    <p class="card-description">¿Desea saber como obtener su certificado?</p>
                                    <a href="AlumPortal_TS_Certificado.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
                            </div>
                            <div class="card">
                                <div class="container-card bg-yellow-box">
                                    <p class="card-title">Trámite: Rectificación de Nota</p>
                                    <p class="card-description">¿Desea saber el proceso para la rectificación de una nota?</p>
                                    <a href="AlumPortal_TS_RecNota.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
                            </div>
                            <div class="card">
                                <div class="container-card bg-blue-box">
                                    <p class="card-title">Solicitud: Reembolso</p>
                                    <p class="card-description">¿Desea saber como realizar un reembolso?</p>
                                    <a href="AlumPortal_TS_Reemb.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
                            </div>
                            <div class="card">
                                <div class="container-card bg-yellow-box">
                                    <p class="card-title">Trámite: Retiro del semestre</p>
                                    <p class="card-description">¿Desea saber como realizar el retiro del semestre?</p>
                                    <a href="AlumPortal_TS_ReSeme.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
                            </div>
                            <div class="card">
                                <div class="container-card bg-blue-box">
                                    <p class="card-title">Solicitud: Registro de fotografía</p>
                                    <p class="card-description">¿Desea saber como subir su fotografía?</p>
                                    <a href="AlumPortal_TS_Foto.jsp"><input class="button button2" type="button" value="Ingresa Aqui"></a>
                                </div>
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
<script>
    var myLandbot = new Landbot.Livechat({
        configUrl: 'https://storage.googleapis.com/landbot.online/v3/H-1649495-RTV5T6266CPDFM66/index.json',
    });
</script>
</html>
