<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri = "/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Game</title>
    
    <style>
     h1,h2{
		text-shadow: -4px 4px 6px dimgrey;
		font-size:30pt;
		}
    </style>
   
<script type = "text/javascript">

<!--
var errorMessage='';
var now = new Date(); 
var hour = now.getHours(); 
var name;
if ( hour < 12 ) 
document.write( "<center><h1>Good Morning, " );
else
{
hour = hour - 12; 
if ( hour < 6 )
document.write( "<center><h1>Good Afternoon, " );
else
document.write( "<center><h1>Good Evening, " );
}

if ( document.cookie )
{
var myCookie = unescape( document.cookie );
var cookieTokens = myCookie.split( "=" );
name = cookieTokens[ 1 ];
} 

else
{
name = window.prompt( "Please enter your name", "User" );
document.cookie = "name=" + escape( name );
}
document.writeln(
name + ", Welcome!</h1></center>" );
document.writeln( "<center><a href = 'javascript:wrongPerson()'> " +
 "Click here if you are not " + name + "</a></center><hr>" );


function wrongPerson()
{
	document.cookie= "name=null;" + " expires=Thu, 01-Jan-95 00:00:01 GMT";
	location.reload();
} 
</script>

</head>

<body>
<s:form name="game" method="post" action="Controller1" theme="simple">
	<center><h2>Game begins!</h2></center>
	<center><img src="Rock_Paper_Scissors.jpg" alt="Rock,Paper,Scissors"/></center>
	<center>
	Choose your weapon: <s:select name="choice" list="#{'Rock':'Rock', 'Paper':'Paper', 'Scissors':'Scissors'}"/>
	<br><br><br>
	<s:submit label="Submit" />
	</center>
			
</s:form>	

</body>

</html>