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
			$.ajax({
				url:'/Allbooks',
				method:'GET',
				dataType:"json",
				contentType:"application/json",
				encode:true,
				success: function(data){
					console.log(data);
				}
			});

			
			function load_json_data(id, parent_id)
	 		{
				var html_code = '';
				$.getJSON("Category_Section.json", function(data){
					html_code += '<option value="">Select '+id+'</option>';
					
					$.each(data, function(key, value){
						if(id == 'category')
						{
							if(value.t=='5')
							{
								console.log("category_id"+value.id);
								html_code += '<option value="'+value.parent_id+'" >'+value.name+'</option>';	
							}
						}
						else
						{
							console.log(parent_id);
							if(value.parent_id == parent_id)
						     {
								console.log("section_id"+value.id);
						      html_code += '<option value="'+value.name+'" >'+value.name+'</option>';
						     }
						}
					});
					$('#'+id).html(html_code);
				});
	 		}
			 $(document).on('change', '#category', function(){
				 var category_id=$(this).val();
				 console.log(category_id);
				 if(category_id != "p")
				  {
					 console.log(category_id);
				   load_json_data('Section', category_id);
				  }
			 });
			 
			 $('#reg').submit(function(event) {
				/* var formData = {
				            'author_name'              : $('input[name=author_name]').val(),
				            'email'             : $('input[name=email]').val(),
				            'superheroAlias'    : $('input[name=superheroAlias]').val()
				        };*/
				        
				 event.preventDefault();
				 var jsonStr="{\"author\":{\"author_name\":\""+$('#author_name').val()+"\"},\"publisher\":{\"publisher_name\":\""+$('#publisher_name').val()+"\",\"location\":\""+$('#publisher_location').val()+"\"},\"isbn\":\""+$('#isbn').val()+"\",\"title\":\""+$('#title').val()+"\",\"section\":{\"section_name\":\""+$('#Section').val()+"\",\"category\":{\"category_name\":\""+$("#category").val()+"\"}},\"amount\":\""+$('#amount').val()+"\",\"edition\":\""+$('#edition').val()+"\"}";
				 
				 console.log($('#category').val()+"  "+$('#Section').val());
				// var obj=JSON.parse(jsonStr);
				var obj=jsonStr;
				console.log(obj);
				$.ajax({
					url:'/saveBooks',
					method:'POST',
					data:obj,
					dataType:"text",
					contentType:"application/json",
					encode:true,
					success: function(data){
						alert("Saved");
					}
				});
				 console.log("sdsd");
			 });
		});
</script>
<body>
<h1>Book Register Form</h1>
<form id="reg" >
			<table style="with: 50%">
				<tr>
					<td>Title</td>
					<td><input type="text" id="title" /></td>
				</tr>
				<tr>
					<td>Author Name</td>
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
</html>