<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Registration</title>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<script>
		$(document).ready(function()
		{
			console.log("hello");
			load_json_data('category');
			
			function load_json_data(id, parent_id)
	 		{
				var html_code = '';
				$.getJSON("Category", function(data){
					
					html_code += '<option value="">Select '+id+'</option>';
					$.each(data, function(key, value){
						if(id == 'category')
						{
							if(value.parent_id=='0')
							{
								html_code += '<option value="'+value.id+'">'+value.name+'</option>';	
							}
						}
						else
						{
							if(value.parent_id == parent_id)
						     {
						      html_code += '<option value="'+value.id+'">'+value.name+'</option>';
						     }
						}
					});
					$('#'+id).html(html_code);
				});
	 		}
			 $(document).on('change', '#category', function(){
				 var category_id=$(this).val();
				 console.log(category_id);
				 if(category_id != '')
				  {
				   load_json_data('Section', category_id);
				  }
			 });
		});
</script>
<body>
<h1>Book Register Form</h1>
<form action="/saveBooks" method="post">
			<table style="with: 50%">
				<tr>
					<td>Title</td>
					<td><input type="text" name="title" /></td>
				</tr>
				<tr>
					<td>Author Name</td>
					<td><input type="text" name="author_name" /></td>
				</tr>
				<tr>
					<td>Publisher Name</td>
					<td><input type="text" name="publisher_name" /></td>
				</tr>
					<tr>
					<td>Publisher Location</td>
					<td><input type="text" name="location" /></td>
				</tr>
				<tr>
					<td>ISBN number</td>
					<td><input type="text" name="isbn" /></td>
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
  						 	<select name="Section" id="Section">
    							<option value="">Select Section</option>
  						 	</select>
  					</td>
				</tr>
				
			</table>
			<input type="submit" value="Submit" /></form>
</body>
</html>