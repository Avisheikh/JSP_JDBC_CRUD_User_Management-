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
                    
                 
                    
                    
                  <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">Admin List</a>
                </li>
                
                
                <li class="nav-item waves-effect waves-light">
                    
                
           
                  <a class="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Client List</a>
                </li>
                
                
                   <li class="nav-item waves-effect waves-light">
                    
                
           
                  <a class="nav-link" id="profile-tab" data-toggle="tab" href="#ADD_USER" role="tab" aria-controls="profile" aria-selected="false">Add User</a>
                </li>
                
                <li class="nav-item waves-effect waves-light col-md-4"  >
                    
                
           
                    <input class="form-control" id="myInput" type="text" placeholder="Search" aria-label="Search">
                </li>
                
              
              
              </ul> <br>
              <div class="tab-content" id="myTabContent">
                <div class="tab-pane fade  active show" id="home" role="tabpanel" aria-labelledby="home-tab">
                    
                  
    <table id="dtMaterialDesignExample" class="table table-striped" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm"> ID
      </th>
      <th class="th-sm">First Name  
      </th>
      <th class="th-sm">Last Name
      </th>
      
       <th class="th-sm">User Name
      </th>
      <th class="th-sm">Email
      </th>
      <th class="th-sm">Address
      </th>
      <th class="th-sm">Date of Birth
      </th>
      <th class="th-sm">Password
          
      </th>
       <th class="th-sm">Confirm Password
      </th>
       <th class="th-sm">Action
      </th>
    </tr>
  </thead>
  <tbody id="myTable" >
     <c:forEach var="tempUser" items="${user_list}">
         
         <c:url var="updateTemp" value="UserControllerServlet">
             
             <c:param name="command" value="LOAD" />
           <c:param name="adminUserName" value="${tempUser.userName}"/>
             
             
         </c:url>
         
             <c:url var="delTemp" value="UserControllerServlet">
                 <c:param name="command" value="DELETE"/>
                 <c:param name="adminId" value="${tempUser.id}"/>
                 
                 
                 
             </c:url>
         
         
         
         
    <tr>
         <td>${tempUser.id}</td>
         
                        <td>${tempUser.firstName}</td>
                        <td>${tempUser.lastName}</td>
                        <td>${tempUser.userName}</td>
                        <td>${tempUser.email}</td>
                        <td>${tempUser.address}</td>
                        <td>${tempUser.date_of_birth}</td>
                        <td>${tempUser.password}</td>
                        <td>${tempUser.rePassword}</td>
                        <td><a href="${updateTemp}">
                            Update
                                
                            </a>
                             |
                             <a href="${delTemp}" 
                                
                                
                                
                                onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
                           
                            Delete
                                
                            </a>
                        
                        </td>
                        
    </tr>
    
    </c:forEach>
  </tbody>
 
</table>  
                    
               
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                </div>
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                   <table id="dtMaterialDesignExample" class="table table-striped" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm"> ID
      </th>
      <th class="th-sm">First Name  
      </th>
      <th class="th-sm">Last Name
      </th>
      
       <th class="th-sm">User Name
      </th>
      <th class="th-sm">Email
      </th>
      <th class="th-sm">Address
      </th>
      <th class="th-sm">Date of Birth
      </th>
      <th class="th-sm">Password
          
      </th>
       <th class="th-sm">Confirm Password
      </th>
       <th class="th-sm">Action
      </th>
    </tr>
  </thead>
  <tbody id="myTable">
      
      
            
       <c:forEach var="tempClient" items="${client_list}">
                        
                        <!-- set up a link for each user    -->
                        <c:url var="tempUpdateLink" value="ClientControllerServlet">
                            <c:param name="command" value="LOAD"/>
                            <c:param name="userName" value="${tempClient.userName}"/>
                            
                        </c:url>
                        
                        <!--set up a link to delete a user -->
                           <c:url var="delLink" value="ClientControllerServlet">
                            <c:param name="command" value="DELETE"/>
                            <c:param name="adminId" value="${tempClient.id}"/>
                            <c:param name="clientFirstName" value="${tempClient.firstName}"/>
                  <c:param name="clientLastName" value="${tempClient.lastName}"/>
                   <c:param name="clientUserName" value="${tempClient.userName}"/>
                            
                        </c:url>
    <tr>
         <td>${tempClient.id}</td>
                        <td>${tempClient.firstName}</td>
                        <td>${tempClient.lastName}</td>
                        <td>${tempClient.userName}</td>
                        <td>${tempClient.email}</td>
                        <td>${tempClient.address}</td>
                        <td>${tempClient.date_of_birth}</td>
                        <td>${tempClinet.password}</td>
                        <td>${tempClient.rePassword}</td>
                        <td><a href="${tempUpdateLink}">
                            Update
                                
                            </a>
                             |
                             <a href="${delLink}" onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false">
                           
                            Delete
                                
                            </a>
                        
                        </td>
                        
    </tr>
    
    </c:forEach>
  </tbody>
 
</table>  
                    
                
                </div>
                  
                  
                  
                  
                  
                  <!--Update form-->
                                   
                <div class="tab-pane fade" id="ADD_USER" role="tabpanel" aria-labelledby="profile-tab">
                   <table id="dtMaterialDesignExample" class="table table-striped" cellspacing="0" width="100%">

                     
  <div class="content">
        <div class="row">
          
          <div class="col-md-12">
            <div class="card card-user">
              <div class="card-header">
                <h5 class="card-title">Add USER</h5>
              </div>
              <div class="card-body">
                  <span class="text-danger"><c:out value="${errorMessage}"/></span>
                
                  
                  
                  <!--Update form-->
                <form  action="AdminSiteAddUserServlet" method="get">
                    
                
                 
                      
                    
                  <div class="row">
                    <div class="col-md-5 pr-1">
                      <div class="form-group">
                             <label >User Type</label>
                             
                       
                          <!--Blue select-->
                          <select class="browser-default custom-select custom-select-lg mb-3" name="userType">
                      <option value="1">Admin</option>
                      <option value="2">Client</option>
                    </select>

<!--/Blue select-->
                          
        
                      </div>
                    </div>
                      
                    <div class="col-md-3 px-1">
                      <div class="form-group">
                      <label >User Name</label>
                      <input name="userName" type="text" id="name"  class="form-control py-2" required />
                      </div>
                    </div>
                      
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                       <label >Email Address</label>
                      <input name="email" type="email" id="name"  class="form-control py-2" required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-1">
                      <div class="form-group">
                        <label>First Name</label>
                      <input type="text" name="fName"  id="name" class="form-control py-2 " required />
                      </div>
                    </div>
                    <div class="col-md-6 pl-1">
                      <div class="form-group">
                         <label >Last Name</label>
                      <input name="lName" type="text"  id="name" class="form-control py-2 " required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-12">
                      <div class="form-group">
                        <label >Address</label>
                      <input name="address" type="text" id="name" class="form-control py-2" required />
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-4 pr-1">
                      <div class="form-group">
                        <label >Date Of Birth</label>
                      <input name="dob" type="date" id="name"  class="form-control py-2" required />
                      </div>
                    </div>
                    <div class="col-md-4 px-1">
                      <div class="form-group">
                       <label>Password</label>
                       <input name="pass1" type="password" id="password"  class="form-control py-2 " minlength="5" maxlength="10" required />
                      </div>
                    </div>
                    <div class="col-md-4 pl-1">
                      <div class="form-group">
                        <label>Confirm Password</label>
                      <input name="pass2" type="password"   id="confirm_password" minlength="5" maxlength="10" class="form-control py-2" required />
                      <span id='message'></span>
                      </div>
                    </div>
                  </div>
                  
                  <div class="row">
                    <div class="update ml-auto mr-auto">
                        <input  type="submit" value="Submit" class="btn btn-primary px-5 py-2  " />
                    </div>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
      
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                       
                
                </div>
               
      
            </section>
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