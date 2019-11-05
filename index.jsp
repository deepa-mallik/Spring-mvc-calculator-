<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action = "calc.html"  method = "post">
		<table>

	<tr>
		<td>Enter a number<td><input type=number name=t1 size=20 required>
	</tr> 
	
	<tr>
		<td>Enter a number<td><input type=number name=t2 size=20 required>
	</tr>
			
	<tr>
		<td>
			<td><input type=submit value=add name=b1>
				<input type=submit value=sub name=b1>
				<input type=submit value=mul name=b1>
				<input type=submit value=div name=b1>
	</tr>
</table>
</form>
</body>
</html>