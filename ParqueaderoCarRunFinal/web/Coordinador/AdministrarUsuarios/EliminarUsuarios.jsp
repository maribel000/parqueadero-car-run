<%-- 
    Document   : EliminarUsuarios
    Created on : 16/05/2011, 07:23:56 PM
    Author     : juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html; charset=ISO-8859-1"
http-equiv="content-type">
<title>EliminarUsuariosCoordinador</title>
<style type="text/css"></style>
<style title="style" media="style" type="text/css"></style>
<link rel="stylesheet" href="../../style.css" type="text/css">
</head>
<body>
<small>&nbsp; </small><big style="font-weight: bold;"><big><big><big><big>Bienvenidos
a CarRun</big></big></big></big></big>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="../IndexCordinador.jsp"><big><big style="font-weight: bold;"><big
style="text-decoration: underline;"><span
style="text-decoration: underline;"></span>Inicio Coordinador</big></big></big>
</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<big><big style="font-weight: bold;"><big
style="text-decoration: underline;"><span
style="text-decoration: underline;"></span><a href="../../index.jsp">Cerrar
Sesión</a></big></big></big><br>
<br>
<div style="margin-left: 40px;">&nbsp;
<br>
<br>
</div>
<table style="text-align: left; width: 933px; height: 255px;" border="0"
cellpadding="2" cellspacing="2">
<tbody>
<tr>
<td style="vertical-align: top;"><img
style="width: 259px; height: 195px;" alt="" title="ImagenSesion"
src="../../images/park.jpg"><br>
<big style="font-weight: bold;"><big><br>
<br>
<br>
<br>
Bienvenidos A CarRun</big></big><br>
<br>
<big>Cordinador</big><br>
<br>
<input readonly="readonly" name="Coordinadorsesion"><br>
<br>
<br>
<input name="NombreUsuarioSesion" value="xxxxx" type="hidden"><br>
<br>
</td>
<td style="vertical-align: top;">
<fieldset><legend style="font-weight: bold;"><big><big>Eliminar
Usuarios</big></big></legend>
<div style="text-align: justify;"><big>Informacion del Usuario a Eliminar <br>
<br>
Cedula&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
name="CedulaEliminarUsuario"> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
&nbsp; &nbsp; <span style="font-weight: bold;"></span><strong>&nbsp;&nbsp;&nbsp;&nbsp;
<select name="Roles">
<option>Coordiandor</option>
<option>Portero</option>
<option>Parqueador</option>
<option selected="selected">Cajero</option>
</select>
<br>
&nbsp;&nbsp; &nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</strong><br>
</big><big>Nombre </big><big>&nbsp;&nbsp;&nbsp;&nbsp; <input
name="NombreEliminarUsuario">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<br>
</big><big>Apellido &nbsp;</big><big> &nbsp;&nbsp;&nbsp; <input
name="NombreEliminarUsuario"></big>&nbsp;&nbsp; <span
style="background-color: rgb(93, 0, 0);">EL USUARIO SE ELIMINARA DE
MANERA PERMANENTE</span>&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <br>
<big>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
</big><big>Telefono </big><big>&nbsp;&nbsp;&nbsp;&nbsp; <input
name="TelefonoEliminarUsuario"></big>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<br>
<br>
<big>Email &nbsp; &nbsp; </big><big>&nbsp;&nbsp;&nbsp;&nbsp; <input
name="NombreCrearUsuario"></big><br>
<big> <br>
<br>
<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;<input
name="EliminarUsuario" value="Eliminar Usuario permanentemente"
type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</big><a href="AdministrarUsuarios.jsp"><big><input
name="CancelarEliminarUsuario" value="Cancelar" type="submit"></big></a> </div>
<br>
<br>
</fieldset>
<br>
<br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
<tr>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
<td style="vertical-align: top;"><br>
</td>
</tr>
</tbody>
</table>
<div style="text-align: center;"><br>
</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div style="margin-left: 40px;">
<br>
</div>
<br>
<br>
</body>
</html>


