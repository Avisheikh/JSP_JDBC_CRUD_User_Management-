<%-- 
    Document   : index
    Created on : 19 May 2020, 07:21:27
    Author     : abishek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <title>Jexi</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500" rel="stylesheet">

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/animate.css">
    <link rel="stylesheet" href="css/owl.carousel.min.css">

    <link rel="stylesheet" href="fonts/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="fonts/fontawesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <!-- Theme Style -->
    <link rel="stylesheet" href="css/style.css">
  </head>
  <body>
    
    <header role="banner">
     
      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container">
          <a class="navbar-brand absolute" href="index.jsp">User Management</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05" aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse navbar-light" id="navbarsExample05">
            <ul class="navbar-nav mx-auto">
              <li class="nav-item">
                <a class="nav-link active" href="index.jsp">Home</a>
              </li>
             

            
              <li class="nav-item">
                <a class="nav-link" href="#">Feature</a>
              </li>
            
            </ul>
              
              
             <!--go to login page -->  
            <ul class="navbar-nav ">
              <li>
                 
                  <form action="Login" method="post">
                      <input class="btn btn-link" type="submit" value="Login"/> |
              </form>
          
                  

                  </li>
            </ul>
             
                <!--go to register page -->  
            <ul class="navbar-nav ">
              <li>
                 
                  <form action="ClientControllerServlet" method="post">
                      <input class="btn btn-link" type="submit" value="Register "/>
              </form>

                  </li>
            </ul>
            
          </div>
        </div>
      </nav>
    </header>
    <!-- END header -->

    <section class="site-section element-animate">
      <div class="container col-11 mx-auto justify-content-center">
        <div class="row align-items-center ">
            
            
          
                
                <ul class="list-group list-group-flush" style="font-size: 16.5px" >
                    
                    <li class="list-group-item">
                        
                        <p class="text-success">
                Admin be able to access the history of individual user and able to block any user.



                </p>
                        
                    </li>
                    
                    
                      <li class="list-group-item">
                        
                        <p class="text-info">
                 Client have the functionality of signup, login/logout, forgot Password, 
                  history log and dashboard.
               


                </p>
                        
                    </li>
                    
                        <li class="list-group-item">
                        
                        <p class="text-danger">
           Report are generated according to user created with in a given date range and blocked with in a given date range.


                </p>
                        
                    </li>
                    
                                            <li class="list-group-item">
                        
                        <p class="text-primary ">
        Guest can signup and newly signup will be regsitered as always a client. Admin have to contact database manager to get username and password to sign in.



                </p>
                        
                    </li>
                    
                    
                    
                    
                      <li class="list-group-item">
                        
                        <p>
                 Admin have the functionality of signup, login/logout, forgot Password, 
                 view list of users, create new user, edit user, delete/block user, profile page, history log, dashboard
                 and report.


                </p>
                        
                    </li>
                    
                   
                </ul>
                
         
          
          
        </div>

      </div>
    </section>
    
    <!-- END section -->
    
    

    <br><br>
  

    
    
    <!-- FOOTER -->
  <footer id="main-footer" class="text-center p-4">
    <div class="container">
      <div class="row">
        <div class="col">
          <p class="float-md-center">
Copyright &copy;<script>document.write(new Date().getFullYear());
</script> All rights reserved | This Web Application is made with <i class="fa fa-heart" aria-hidden="true">
    
</i> by <a href="#" target="_blank" class="text-primary">Jexi</a>
</p>
        </div>
      </div>
    </div>
  </footer>
    <!-- END footer -->
    
    <!-- loader -->
    <div id="loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#f4b214"/></svg></div>

    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/jquery-migrate-3.0.0.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.stellar.min.js"></script>
    <script src="js/jquery.animateNumber.min.js"></script>
    
    <script src="js/jquery.magnific-popup.min.js"></script>

    <script src="js/main.js"></script>
  </body>
</html>