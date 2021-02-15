<%-- 
    Document   : index
    Created on : 19 May 2020, 07:21:27
    Author     : abishek
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.13/css/all.css" integrity="sha384-DNOHZ68U8hZfKXOrtjWvjxusGo9WQnrNx2sqG0tfsghAvtVlRW3tvkXWZh58N9jp"
    crossorigin="anonymous">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
    crossorigin="anonymous">
 <!-- BEGIN VENDOR CSS-->
    <link rel="stylesheet" type="text/css" href="theme-assets/css/vendors.css">
    <link rel="stylesheet" type="text/css" href="theme-assets/vendors/css/charts/chartist.css">
    <!-- END VENDOR CSS-->
    <!-- BEGIN CHAMELEON  CSS-->
    <link rel="stylesheet" type="text/css" href="theme-assets/css/app-lite.css">
    <!-- END CHAMELEON  CSS-->
    <!-- BEGIN Page Level CSS-->
    <link rel="stylesheet" type="text/css" href="theme-assets/css/core/menu/menu-types/vertical-menu.css">
    <link rel="stylesheet" type="text/css" href="theme-assets/css/core/colors/palette-gradient.css">
    <link rel="stylesheet" type="text/css" href="theme-assets/css/pages/dashboard-ecommerce.css">
    <!-- END Page Level CSS-->
    <!-- BEGIN Custom CSS-->
    <!-- END Custom CSS-->
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

       <a class="navbar-brand absolute" href="#" onclick="history.go(-1)">Go Back</a>
                
              <li class="nav-item">
                
              </li>
             


            </ul>
              
         <ul class="navbar-nav ">
              <li>
                 
                 
                  

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
    <!--Navbar -->
    <br>
      
     <!-- by this jstl tag we are calling listclient functiion from the servlet-->
      <c:url value = "../ClientControllerServlet" var = "temp">
                 <c:param name = "command" value = "LIST"/>
  
                </c:url>
      <c:import url = "${temp}"/>
  


    
   <div class="my-12 col-md-12 ">

  
            <section>
      
              <ul class="nav nav-tabs" id="myTab" role="tablist">
                  
                <li class="nav-item waves-effect waves-light a">
                    
                 
                    
                    
                  <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">User Creation </a>
                </li>
                
                
               
                     
              
              </ul> <br>
              <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade  active show" id="home" role="tabpanel" aria-labelledby="home-tab">
                    
                  
    <table id="dtMaterialDesignExample" class="table table-striped" cellspacing="0" width="100%">
  <thead>
    <tr>
    <tr>
      <th class="th-sm"> Report ID
      </th>
       <th class="th-sm">Client First Name     
      </th>
       <th class="th-sm">Client Last Name
      </th>
       <th class="th-sm">Client User Name  
      </th>
      <th class="th-sm">Client Delete Date  
      </th>
     
     
    </tr>
  </thead>
  <tbody  id="myTable">
     <c:forEach var="tempUser" items="${delReport}">
         
       
    <tr>
                          <td>${tempUser.id}</td>
                          <td>${tempUser.firstName}</td>
                          <td>${tempUser.lastName}</td>
                          <td>${tempUser.userName}</td>
                        <td>${tempUser.deleteDate}</td>
                       
                    
                        
    </tr>
    
    </c:forEach>
  </tbody>
 
</table>  
                    
               
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                </div>
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                 
  
            <!-- Section: Live preview -->
      
          </div>
          <!-- Grid column -->
      
   
          <!-- Grid column -->
      
        </div>

  </div>   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    
    
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
    
     <script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $("#myTable tr").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
    
  </body>
</html>