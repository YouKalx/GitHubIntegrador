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
        <title>Portal del estudiante</title>
        <link rel="stylesheet"
              href="css/alumnoPortal.css">
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/responsive">
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
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210182148/Untitled-design-(29).png"
                                 class="nav-img"
                                 alt="dashboard">
                            <a class="nav-link" href="AlumPortal_Inicio.jsp"><h5>Inicio</h5></a>

                        </div>

                        <div class="option2 nav-option">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/9.png"
                                 class="nav-img"
                                 alt="articles">
                            <a class="nav-link" href="AlumPortal_Perfil.jsp"><h5>Perfil</h5></a>

                        </div>

                        <div class="nav-option option3">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/5.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="AlumPortal_Curso.jsp"><h5>Notas</h5></a>
                        </div>

                        <div class="nav-option option4">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/6.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="AlumPortal_Horario.jsp"><h5>Horario</h5></a>
                        </div>

                        <div class="nav-option option5">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183323/10.png"
                                 class="nav-img"
                                 alt="blog">
                            <a class="nav-link" href="Intranet.jsp"><h5>Eventos</h5></a>
                        </div>

                        <div class="nav-option option6">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/4.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="Intranet.jsp"><h5>Salir</h5></a>
                        </div>
                    </div>
                </nav>
            </div>
            <div class="main">

                <div class="box-container">

                    <div class="container">
                        <p class="container-title">Bienvenido(a) al Portal del Estudiante de English House, <br>aquí podrás consultar tus dudas.</p>

                        <div class="gradient-cards">
                            <div class="card" >
                                <div class="container-card bg-green-box">
                                    <p class="card-title">Perfil</p>
                                    <p class="card-description">¿Desear ver tu información personal?</p>
                                    <button class="button button2">Ingresa Aqui</button>
                                </div>
                            </div>

                            <div class="card">
                                <div class="container-card bg-white-box"> 
                                    <p class="card-title">Notas</p>
                                    <p class="card-description">¿Desear ver tus notas?</p>
                                    <button class="button button2">Ingresa Aqui</button>
                                </div>
                            </div>

                            <div class="card">
                                <div class="container-card bg-yellow-box">
                                    <p class="card-title">Horario</p>
                                    <p class="card-description">Dale un ojo a tu horario de clases</p>
                                    <button class="button button2">Ingresa Aqui</button>
                                </div>
                            </div>

                            <div class="card">
                                <div class="container-card bg-blue-box">
                                    <p class="card-title">Eventos</p>
                                    <p class="card-description">Ven y diviertéte con varios eventos recreativos</p>
                                    <button class="button button2">Ingresa Aqui</button>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>








<script>
    let menuicn = document.querySelector(".menuicn");
    let nav = document.querySelector(".navcontainer");

    menuicn.addEventListener("click", () =>
    {
        nav.classList.toggle("navclose");
    })
</script>
</html>
