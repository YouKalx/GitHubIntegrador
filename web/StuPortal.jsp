<%-- 
    Document   : dashboard_admin
    Created on : 3 may. 2023, 20:00:17
    Author     : ShuKalx
--%>

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
        <title>GeeksForGeeks</title>
        <link rel="stylesheet"
              href="css/style_admin.css">
        <link rel="stylesheet"
              href="css/responsive_admin.css">
        <link rel="stylesheet"
              href="css/style">
        <link rel="stylesheet"
              href="css/responsive">
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
                            <a class="nav-link" href="AdmiPortal_nivel.jsp"><h5>Niveles</h5></a>
                        </div>

                        <div class="nav-option option6">
                            <img src=
                                 "https://media.geeksforgeeks.org/wp-content/uploads/20221210183320/4.png"
                                 class="nav-img"
                                 alt="settings">
                            <a class="nav-link" href="AdmiPortal_horario.jsp"><h5>Horario</h5></a>
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
            <div class="main">

                <div class="box-container">

                    <div class="box box1">
                        <div class="text">
                            <h2 class="topic-heading">1</h2>
                            <a class="topic" href="AdmiPortal_admi_registrar.jsp"><h4>Registrar nuevo administrador</h4></a>
                        </div>
                    </div>

                    <div class="box box2">
                        <div class="text">
                            <h2 class="topic-heading">2</h2>
                            <a class="topic"><h4>Listar administradores</h4></a>
                            <form action="AdministradorControl" method="post"><input class="botonlistar"type="submit" name="acc" value="Listar">
                                </div>
                                </div>

                                <div class="box box3">
                                    <div class="text">
                                        <h2 class="topic-heading">3</h2>
                                        <a class="topic" href="AdmiPortal_admi_buscar.jsp"><h4>Buscar / Modificar / Eliminar administrador</h4></a>
                                    </div>
                                </div>


                        </div>

                        <div class="report-container">
                            <div class="report-header">
                                <h1 class="recent-Articles">Recent Articles</h1>
                                <button class="view">View All</button>
                            </div>

                            <div class="report-body">
                                <div class="report-topic-heading">
                                    <h3 class="t-op">Article</h3>
                                    <h3 class="t-op">Views</h3>
                                    <h3 class="t-op">Comments</h3>
                                    <h3 class="t-op">Status</h3>
                                </div>

                                <div class="items">
                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 73</h3>
                                        <h3 class="t-op-nextlvl">2.9k</h3>
                                        <h3 class="t-op-nextlvl">210</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 72</h3>
                                        <h3 class="t-op-nextlvl">1.5k</h3>
                                        <h3 class="t-op-nextlvl">360</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 71</h3>
                                        <h3 class="t-op-nextlvl">1.1k</h3>
                                        <h3 class="t-op-nextlvl">150</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 70</h3>
                                        <h3 class="t-op-nextlvl">1.2k</h3>
                                        <h3 class="t-op-nextlvl">420</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 69</h3>
                                        <h3 class="t-op-nextlvl">2.6k</h3>
                                        <h3 class="t-op-nextlvl">190</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 68</h3>
                                        <h3 class="t-op-nextlvl">1.9k</h3>
                                        <h3 class="t-op-nextlvl">390</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 67</h3>
                                        <h3 class="t-op-nextlvl">1.2k</h3>
                                        <h3 class="t-op-nextlvl">580</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 66</h3>
                                        <h3 class="t-op-nextlvl">3.6k</h3>
                                        <h3 class="t-op-nextlvl">160</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
                                    </div>

                                    <div class="item1">
                                        <h3 class="t-op-nextlvl">Article 65</h3>
                                        <h3 class="t-op-nextlvl">1.3k</h3>
                                        <h3 class="t-op-nextlvl">220</h3>
                                        <h3 class="t-op-nextlvl label-tag">Published</h3>
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
