<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!--  Linking and including of local Bootstrap files  --> 
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.css" >
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap-theme.css" >

<!-- jQuery included locally -->
<script type="text/javascript" src='<c:url value="/resources/jQuery/jquery-3.1.1.js"/>'></script>

<!-- To use Bootstrap's javascript such as plug-in, below script has to be included -->
<script type="text/javascript" src='<c:url value="/resources/bootstrap/js/bootstrap.min.js"/>'></script>

<title>My Portfolio</title>
</head>
<body>

	<table border="1" width="100%" height="100%" bordercolor="Gray">
		
		<tr align="center">
			<td height="10%" colspan="2">
				<tiles:insertAttribute name="header" />	<!-- Inserting the header by its setting of tiles-def.xml -->
			</td>
		</tr>
		
		<tr>
			<td width="20%" align="left" valign="top">
				<tiles:insertAttribute name="menu" /> <!-- Inserting the menu by its setting of tiles-def.xml -->
			</td>
			<td>
				<tiles:insertAttribute name="content"/> <!-- Inserting the content by its setting of tiles-def.xml -->
			</td>
		</tr>
		
		<tr align="center">
			<td height="10%" colspan="2">
				<tiles:insertAttribute name="footer" /> <!-- Inserting the footer by its setting of tiles-def.xml -->
			</td>
		</tr>
	</table>

</body>
</html>
