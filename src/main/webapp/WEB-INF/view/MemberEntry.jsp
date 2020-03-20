<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Registration</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<body>
<h1>Member Register Form</h1>
<form id="reg" >
			<table style="with: 50%">
				<tr>
					<td>Name</td>
					<td><input type="text" id="Name" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" id="author_name" /></td>
				</tr>
				<tr>
					<td>Publisher Name</td>
					<td><input type="text" id="publisher_name" /></td>
				</tr>
					<tr>
					<td>Publisher Location</td>
					<td><input type="text" id="publisher_location" /></td>
				</tr>
				<tr>
					<td>ISBN number</td>
					<td><input type="text" id="isbn" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td>
  					 	<select name="category" id="category">
    						<option value="">Select Category</option>
   						</select>
   					</td>
   				</tr>
   				<tr>
   					<td>Section</td>
   					<td>
  						 	<select name="section_name" id="Section" >
    							<option value="">Select Section</option>
  						 	</select>
  					</td>
				</tr>
				<tr>
					<td>Amount</td>
					<td>
						<input type="text" name="amount" id="amount">
					</td>
				</tr>
				<tr>
					<td>
						Edition
					</td>
					<td>
						<input type="text" name="edition" id="edition">
					</td>
				</tr>
			</table>
			<input type="submit" value="Submit" />
</form>
</body>
</body>