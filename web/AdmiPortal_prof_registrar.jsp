
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
        <title>Portal del Administrador/Profesores</title>
        <link rel="stylesheet"
              href="css/admiPortal_prof.css">
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/registro_prof.css">
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
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210182148/Untitled-design-(29).png"
                                 class="nav-img"
                                 alt="dashboard">
                            <a class="nav-link" href="1_AdmiPortalPrincipal.jsp"><h5>Administradores</h5></a>

                        </div>

                        <div class="option2 nav-option">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183322/9.png"
                                 class="nav-img"
                                 alt="articles">
                            <a class="nav-link" href="AdmiPortal_prof.jsp"><h5>Profesores</h5></a>

                        </div>

                        <div class="nav-option option3">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/5.png"
                                 class="nav-img"
                                 alt="report">
                            <a class="nav-link" href="AdmiPortal_alum.jsp"><h5>Alumnos</h5></a>
                        </div>

                        <div class="nav-option option4">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/6.png"
                                 class="nav-img"
                                 alt="institution">
                            <a class="nav-link" href="AdmiPortal_actividad.jsp"><h5>Eventos</h5></a>
                        </div>

                        <div class="nav-option option5">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183323/10.png"
                                 class="nav-img"
                                 alt="blog">
                            <a class="nav-link" href="AdmiPortal_notas.jsp"><h5>Notas</h5></a>
                        </div>

                        <div class="nav-option option6">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/4.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="Intranet.jsp"><h5>Horario</h5></a>
                        </div>

                        <div class="nav-option logout">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183321/7.png"
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
                        <h2>Registro de Profesores</h2>
                        <form action="ProfesorControl" method="post">
                            <div class="form-group">
                                <label for="first-name">Código de profesor</label>
                                <input type="text" class="form-control" name="IDpro">
                            </div>
                            <div class="form-group">
                                <label for="last-name">Nombre de profesor</label>
                                <input type="text" class="form-control" name="nbpro">
                            </div>
                            <div class="form-group">
                                <label for="country">Apellido de profesor</label>
                                <input type="text" class="form-control" name="appro" >
                            </div>
                            <div class="form-group">
                                <label for="number">DNI del profesor </label>
                                <input type="text" class="form-control" name="ndni">
                            </div>
                            <div class="form-group">
                                <label for="last-name">Género del profesor</label>
                                <input type="text" class="form-control" name="gen">
                            </div>
                            <div class="form-group">
                                <label for="last-name">Nivel del profesor</label>
                                <input type="text" class="form-control" name="ni">
                            </div>
                            <div class="form-group">
                                <label for="country">Email de profesor</label>
                                <input type="text" class="form-control" name="email" >
                            </div>
                            <div class="form-group">
                                <label for="number">N°cel de profesor </label>
                                <input type="text" class="form-control" name="ncel">
                            </div>
                            <div class="form-group">
                                <label for="age">Crea un usuario</label>
                                <input type="text" class="form-control" name="usupro">
                            </div>
                            <div class="form-group">
                                <label for="email">Crea una contraseña</label>
                                <input type="password" class="form-control" name="passpro">
                            </div>
                            <div class="clearfix"></div>
                            <div class="text-center ">
                                <input type="submit" name="acc" value="Registrar" class="btn btn-dark fs-4 mt-3 mb-3 btn-lg">
                            </div>

                            <!-- Corregir bot -->

                            <div class="text-center ">
                                <input type="submit" value="Regresar" class="btn btn-dark fs-4 mt-3 mb-3 btn-lg">
                                <a href="Inicio.jsp"></a>
                            </div>
                        </form>
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