<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">

	<div class="panel panel-primary">
		<div class="panel-heading"> <h3>Send your Reports To MOFED !  Make Sure You Choose The Right Document !</h3></div>
		
		<br></br>
		
		<div class ="container"  align ="center">
		
		  <form action="/uploadFiles" method="post" enctype="multipart/form-data">
		
		<br>
		<label for="propertydirectorate">Choose a Report Type :</label>
        <select  id="ddlpropertyid" name="transactiondocumentid"  required>
			       <option>--SELECT--</option>
			       	<c:forEach items="${documents}" var="dir">
				      <option value="${dir.id}">${dir.reportype}
				   </option>
				   </c:forEach>
			    </select>	
				    <br>
            <br>
            
  <label for="files">Select files:</label>
  <br>
  <input type="file" id="files" name="files"><br><br>
  
  <select  id = "reportstatus"  name = "reportstatus"  hidden=true>
            <option value = "Complete">Complete</option>
            <option value = "pending" selected >Pending</option>
            <option value = "Incomplete">Incomplete</option>
         </select>
         
       <div class="form-group"   hidden=true>
            <label for="recipient-name" class="col-form-label">OrgID:</label>
            <input type="text" class="form-control" id="recipient-name" name="organizaid">
          </div> 
          <div class="form-group"   hidden=true>
            <label for="recipient-name" class="col-form-label">Remarks:</label>
            <input type="text" class="form-control" id="recipient-name" name="remarks">
          </div>            
		<div align ="center">	    
        <input type="submit"  class ="btn btn-primary">
  </div>
</form>
		</div>
		
    
		</div>
	</div>
<%@ include file="common/footer.jspf" %>


  