<%-- 
    Document   : register
    Created on : 19 May 2020, 07:33:28
    Author     : abish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                <a class="nav-link" href="features.jsp">Feature</a>
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

    <section class="site-hero site-sm-hero overlay" data-stellar-background-ratio="0.5" style="background-image: url(img/h.jpg);">
      <div class="container">
        <div class="row align-items-center justify-content-center site-hero-sm-inner">
          <div class="col-md-7 text-center">
  
            <div class="mb-5 element-animate">
              <h1 class="mb-2">Register</h1>
              <p class="bcrumb"><a href="index.jsp">Home</a> <span class="sep ion-android-arrow-dropright px-2"></span>  <span class="current">Register</span></p>
            </div>
            
          </div>
        </div>
      </div>
    </section>
    <!-- END section -->
    
    <section class="site-section">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-md-7">
            <div class="form-wrap">
                
                <span class="text-danger"><c:out value="${errorMessage}"/></span>
                
                

              <h2 class="mb-5">Register new account</h2>
              
              <!-- Client Register Form -->
              <form action="ClientControllerServlet" method="post">
                  
                  <input type="hidden" name="command" value="REGISTER"/>
                  
                  <div class="row">
                    <div class="col-md-12 form-group">
                        
                              <div class="row">
                    <div class="col-md-12 form-group">
                      <label>First Name</label>
                      <input type="text" name="fName"  id="name" class="form-control py-2 " required />
                    </div>
                  </div>
                  
                              <div class="row">
                    <div class="col-md-12 form-group">
                      <label >Last Name</label>
                      <input name="lName" type="text" id="name" class="form-control py-2 " required />
                    </div>
                  </div>
                  
                                                   <div class="row">
                    <div class="col-md-12 form-group">
                      <label >Email Address</label>
                      <input name="email" type="email" id="name" class="form-control py-2" required />
                    </div>
                  </div>
                        
                                                        <div class="row">
                    <div class="col-md-12 form-group">
                      <label >User Name</label>
                      <input name="userName" type="text" id="name" class="form-control py-2" required />
                    </div>
                  </div>
                        
                        
                                                <div class="row">
                    <div class="col-md-12 form-group">
                        <label >Address</label>
                      <input name="address" type="text" id="name" class="form-control py-2" required />
                    </div>
                  </div>
            
                                                      <div class="row">
                    <div class="col-md-12 form-group">
                  <label >Date Of Birth</label>
                      <input name="dob" type="date" id="name" class="form-control py-2" required />
                    </div>
                  </div>
               
                  <div class="row">
                    <div class="col-md-12 form-group">
                        <label>Password</label>
                      <input name="pass1" type="password" id="name" minlength="5" maxlength="10" class="form-control py-2 " required />
                    </div>
                  </div>
                  
                  
                  <div class="row mb-5">
                    <div class="col-md-12 form-group">
                      <label>Confirm Password</label>
                      <input name="pass2" type="password" id="name" minlength="5" maxlength="10" class="form-control py-2" required />
                    </div>
                  </div>
                        
                        
                        
                     
                  
                  <div class="row">
                    <div class="col-md-6 form-group">
                      <input type="submit" value="Register" class="btn btn-primary px-5 py-2" />
                    </div>
                  </div>
                        
                  
                </form>
              </div>
          </div>
        </div>
      </div>
    </section>
    
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

    <script src="js/main.js"></script>
  </body>
</html>