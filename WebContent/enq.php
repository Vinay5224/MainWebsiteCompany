<?php 

$name = $_POST['name'];
$designation = $_POST['designation'];
$company = $_POST['company'];
$mobile = $_POST['mobile'];
$email = $_POST['email'];
$comm = $_POST['comm'];
 

//echo "ok1";
$msg=         "\r\n Name  :".$name.	
	"\r\n Designation :".$designation.
	"\r\n Company     :".$company.
	"\r\n Mobile      :".$mobile.
	"\r\n Email       :".$email.
	"\r\n Area of interest       :".$comm;
	

//echo $msg;

$to="ameen@exafluence.com";
$from="request@exafluence.com";
$headers = "From:" . $from;


 
if(mail($to,"Signed up account ",$msg,$headers))
echo "ok";
else
echo "no";
 




?>






