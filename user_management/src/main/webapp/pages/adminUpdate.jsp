<%-- 
    Document   : register
    Created on : 19 May 2020, 07:33:28
    Author     : abish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="en">
  <head>
    <title>Jexi</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Rubik:300,400,500" rel="stylesheet">
    
    <!-- CSS Files -->
  <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link href="assets/css/paper-dashboard.css?v=2.0.1" rel="stylesheet" />
  

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
          <a class="navbar-brand absolute" href="#">User Management</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExample05" aria-controls="navbarsExample05" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse navbar-light" id="navbarsExample05">
            <ul class="navbar-nav mx-auto">
                 
      <a class="navbar-brand absolute" href="#" onclick="history.go(-1)">DashBoard</a>
              <li class="nav-item">
                
              </li>
             

<!--            
              <li class="nav-item">
                <a class="nav-link" href="blog.html">Profile</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="about.html">About</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="contact.html">Contact</a>
              </li>-->
            </ul>
              
         <ul class="navbar-nav ">
              <li>
                 
                  <a class="btn-link text-uppercase text-dark" href="#">Welcome, ${THE_ADMIN.userName}</a> |
                  

                  </li>
            </ul>
             <!--go to login page -->  
          
             
                <!--go to register page -->  
            <ul class="navbar-nav ">
              <li>
                 
              <form action="LogoutServlet" method="post">
                      <input class="btn btn-link" type="submit" value="Logout"/>
              </form>

                  </li>
            </ul>
            
          </div>
        </div>
      </nav>
    </header>
    <!-- END header -->    
    <!-- END header -->

    <!-- END section -->

    
    <div class="container"> 
  <div class="content">
        <div class="row">
          <div class="col-md-4">
            <div class="card card-user">
              <div class="image">
                <img src="assets/img/damir-bosnjak.jpg" alt="...">
              </div>
              <div class="card-body">
                <div class="author">
                  <a href="#">
                    <img class="avatar border-gray" src="img/t.jpg" alt="...">
                    <h5 class="title text-uppercase">${THE_ADMIN.firstName} ${THE_ADMIN.lastName}</h5>
                  </a>
                  <p class="description text-uppercase">
                    @${THE_ADMIN.userName}
                  </p>
                </div>
                <p class="description text-center">
                  "I like the way you work it <br>
                  No diggity <br>
                  I wanna bag it up"
                </p>
              </div>
              <div class="card-footer">
                <hr>
                <div class="button-container">
                  <div class="row">
                    <div class="col-lg-3 col-md-6 col-6 ml-auto">
                      <h5>12<br><small>Files</small></h5>
                    </div>
                    <div class="col-lg-4 col-md-6 col-6 ml-auto mr-auto">
                      <h5>2GB<br><small>Used</small></h5>
                    </div>
                    <div class="col-lg-3 mr-auto">
                      <h5>24,6$<br><small>Spent</small></h5>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="card">
              <div class="card-header">
                <h4 class="card-title">Team Members</h4>
              </div>
              <div class="card-body">
                <ul class="list-unstyled team-members">
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="img/t.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-md-7 col-7">
                        Abishek Bhandari
                        <br />
                        <span class="text-muted"><small>Offline</small></span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="img/t.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-md-7 col-7">
                        Asish Parajuli
                        <br />
                        <span class="text-success"><small>Available</small></span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                  <li>
                    <div class="row">
                      <div class="col-md-2 col-2">
                        <div class="avatar">
                          <img src="img/t.jpg" alt="Circle Image" class="img-circle img-no-padding img-responsive">
                        </div>
                      </div>
                      <div class="col-ms-7 col-7">
                       Aljesh Basnet
                        <br />
                        <span class="text-danger"><small>Busy</small></span>
                      </div>
                      <div class="col-md-3 col-3 text-right">
                        <btn class="btn btn-sm btn-outline-success btn-round btn-icon"><i class="fa fa-envelope"></i></btn>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-8">
            <div class="card card-user">
              <div class="card-header">
                <h5 class="card-title">Edit Profile</h5>
              </div>
              <div class="card-body">
                  <span class="text-danger"><c:out value="${errorMessage}"/></span>
                
                  
                  
                  <!--Update form-->
                <form name ="f" action="UserControllerServlet" method="get">
                    
                  <input type="hidden" name="command" value="UPDATE"/>
                  <input type="hidden" name="uID" value="${THE_ADMIN.id}"> 
                      
                    
                  <div class="row">
                    <div class="col-md-5 pr-1">
                      <div class="form-group">
                        <label>Company (disabled)</label>
                        <input type="text" class="form-control" disabled="" placeholder="Company" value="Creative Code Inc.">
                      </div>
                    </div>
                      
                    <div class="col-md-3 px-1">
                      <div class="form-group">
                      <label >User Name</label>
                      <input name="userName" type="text" id="name"  value="${THE_ADMIN.userName}"class="form-control py-2" required />
                      </div>
                    </div>
                      
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                       <label >Email Address</label>
                      <input name="email" type="email" id="name" value="${THE_ADMIN.email}" class="form-control py-2" required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>First Name</label>
                      <input type="text" name="fName" value="${THE_ADMIN.firstName}" id="name" class="form-control py-2 " required />
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                         <label >Last Name</label>
                      <input name="lName" type="text" value="${THE_ADMIN.lastName}" id="name" class="form-control py-2 " required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label >Address</label>
                      <input name="address" type="text" id="name" value="${THE_ADMIN.address}" class="form-control py-2" required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-4 pr-1">
                      <div class="form-group">
                        <label >Date Of Birth</label>
                      <input name="dob" type="date" id="name" value="${THE_ADMIN.date_of_birth}" class="form-control py-2" required />
                      </div>
                    </div>
                    <div class="col-md-4 px-1">
                      <div class="form-group">
                       <label>Password</label>
                       <input name="pass1" type="password" id="password" value="${THE_ADMIN.password}" class="form-control py-2 " minlength="5" maxlength="10" required />
                      </div>
                    </div>
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                        <label>Confirm Password</label>
                      <input name="pass2" type="password"   id="confirm_password" minlength="5" maxlength="10" value="${THE_ADMIN.rePassword}"class="form-control py-2" required />
                      <span id='message'></span>
                      </div>
                    </div>
                  </div>
                  
                  <div class="row">
                    <div class="update ml-auto mr-auto">
                        <input  type="submit" value="Update" class="btn btn-primary px-5 py-2  " />
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
        </div>
    
     <!-- FOOTER -->
  <footer id="main-footer" class="text-center p-4 ">
    <div class="container">
      <div class="row">
        <div class="col">
          <p class="justify-content-center">
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

  
   <script>
        
        var password = document.getElementById("password")
  , confirm_password = document.getElementById("confirm_password");

function validatePassword(){
  if(password.value != confirm_password.value) {
    confirm_password.setCustomValidity("Passwords Don't Match");
  } else {
    confirm_password.setCustomValidity('');
  }
}

password.onchange = validatePassword;
confirm_password.onkeyup = validatePassword;
        
    </script>
    
    
     <script src="js/jquery-3.2.1.min.js">
        
         
        
    </script>
    <script src="js/jquery-migrate-3.0.0.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.stellar.min.js"></script>
    <script src="js/jquery.animateNumber.min.js"></script>
    

    <script src="js/main.js">
        
         
        
        
        
        
    </script>
    
     <!--   Core JS Files   -->
  <script src="assets/js/core/jquery.min.js"></script>
  <script src="assets/js/core/popper.min.js"></script>
  <script src="assets/js/core/bootstrap.min.js"></script>
  <script src="assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
  <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chart JS -->
  <script src="assets/js/plugins/chartjs.min.js"></script>
  <!--  Notifications Plugin    -->
  <script src="assets/js/plugins/bootstrap-notify.js"></script>
  <!-- Control Center for Now Ui Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="assets/js/paper-dashboard.min.js?v=2.0.1" type="text/javascript"></script><!-- Paper Dashboard DEMO methods, don't include it in your project! -->
  <script src="assets/demo/demo.js"></script>
    
  </body>
</html>