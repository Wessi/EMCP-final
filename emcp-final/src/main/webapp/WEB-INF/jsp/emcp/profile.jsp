<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> User Lists</title>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/v/bs4/dt-1.10.21/datatables.min.css"/>
 <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/fixedheader/3.1.7/css/fixedHeader.dataTables.min.css"/>
 <script src="https://unpkg.com/jquery@3.3.1/dist/jquery.min.js"></script>
 </head>
 <body>
<div class="container">
<br>
<br>

<br><br>
	
	
	<h1  align ="center">${user.username}</h1>
	
					<table class="table table-striped"> 
	         <thead   class  ="thead thead-dark thead-bordered">
    <tr>
      <th scope="col">#ID</th>
      <th scope="col">${user.id}</th>
      </tr>
  </thead>
  
  <tbody>
    <tr> 
      <th scope="col">FirstName</th>
      <td>${user.firstname}</td>
      </tr>
  </tbody>  
   <tbody>
    <tr>
      <th scope="col" >LastName</th>
      <td>${user.lastname}</td>
      </tr>
  </tbody>
  
  <tbody>
    <tr>
      <th scope="col">OrganizationCode:</th>
      <td>${user.theorgid}</td>
      </tr>
  </tbody>
  
</table> 
	</div>





<%@ include file="common/footer.jspf"%>
</body>
</html>

  