<html lang="es">
    <head>
        <!-- basic -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- mobile metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="initial-scale=1, maximum-scale=1">
        <!-- site metas -->
        <title>English House/Intranet/Profesor</title>
        <meta name="keywords" content="">
        <meta name="description" content="">
        <meta name="author" content="">
        <!-- bootstrap css -->
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <!-- style css -->
        <link rel="stylesheet" href="css/style.css">
        <!-- Responsive-->
        <link rel="stylesheet" href="css/responsive.css">
        <!-- fevicon -->
        <link rel="icon" href="images/fevicon.png" type="image/gif" />
        <!-- Scrollbar Custom CSS -->
        <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
        <!-- Tweaks for older IEs-->
        <link rel="stylesheet" href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css" media="screen">
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
    </head>
    <!-- body -->
    <body class="main-layout">

        <!-- header -->
        <header>
            <!-- header inner -->
            <div class="header">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-xl-3 col-lg-3 col-md-3 col-sm-3 col logo_section">
                            <div class="full">
                                <div class="center-desk">
                                    <div class="logo">
                                        <a href="index.html"><img src="images/logoeh.png" alt="#" /></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-xl-9 col-lg-9 col-md-9 col-sm-9">
                            <nav class="navigation navbar navbar-expand-md navbar-dark ">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample04" aria-controls="navbarsExample04" aria-expanded="false" aria-label="Toggle navigation">
                                    <span class="navbar-toggler-icon"></span>
                                </button>
                                <div class="collapse navbar-collapse" id="navbarsExample04">
                                    <ul class="navbar-nav mr-auto">
                                        <li class="nav-item ">
                                            <a class="nav-link" href="Inicio.jsp">Inicio</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="Nosotros.jsp">Nosotros</a>
                                        </li>
                                        <li class="nav-item active">
                                            <a class="nav-link" href="Intranet.jsp">Intranet</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <!-- end header inner -->

        <section class="vh-100" style="background: rgb(148,129,161);
                 background: radial-gradient(circle, rgba(148,129,161,1) 0%, rgba(0,0,26,1) 11%, rgba(0,0,26,1) 100%);
                 height: 937px">
            <div class="container py-5 h-100"  >
                <div class="row d-flex justify-content-center align-items-center h-100">
                    <div class="col col-xl-10">
                        <div class="card" style="border-radius: 1rem;">
                            <div class="row g-0">
                                <div class="col-md-6 col-lg-5 d-none d-md-block">
                                    <img src="https://images.pexels.com/photos/5427870/pexels-photo-5427870.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1"
                                         alt="login form" class="img-fluid" style="border-radius: 1rem 0 0 1rem;" />
                                </div>
                                <div class="col-md-6 col-lg-7 d-flex align-items-center">
                                    <div class="card-body p-4 p-lg-5 text-black">

                                        <h2>Intranet Profesor</h2>
                                        <div class="d-flex align-items-center mb-3 pb-1">
                                            <i class="fas fa-cubes fa-2x me-3" style="color: #ff6219;"></i> 
                                            <span class="h1 fw-bold mb-0">English House</span>
                                        </div>

                                        <div class="box-container">
                                            <div class="container" id="advanced-search-form">
                                                <h2>Mensaje del Sistema</h2>

                                                <!-- Card -->
                                                <div class="card">

                                                    <div class="card" style="width: 25rem;">
                                                        <% String msg = (String) session.getAttribute("msg");%>
                                                        <div align="center">
                                                            <h2 class="card-text">Error: <br> <%= msg%></h2>
                                                        </div>
                                                        <a href="Profesor_Intranet.jsp" class="boton" ><input type="submit" name="acc" value="Volver al Intranet" style="background-color: green; border-radius: 8px; font-size: 20px; width: 100%; color:white"/></a>
                                                    </div> 
                                                </div>

                                            </div>
                                            <!-- Card -->                                 
                                        </div>              
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>  


        <!-- end header -->
        <!-- about section -->
        <!-- end footer -->
        <!-- Javascript files-->
        <script src="js/jquery-3.5.0.js" type="text/javascript"></script>
        <script src="js/jquery-3.5.0.min.js" type="text/javascript"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.0.0.min.js"></script>
        <!-- sidebar -->
        <script src="js/jquery.mCustomScrollbar.concat.min.js"></script>
        <script src="js/custom.js"></script>



    </body>
</html>
