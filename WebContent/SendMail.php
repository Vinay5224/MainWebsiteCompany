<?php 

$firstname = $_POST['firstname'];
$lastname = $_POST['lastname'];
$email = $_POST['email'];
$messagepari = $_POST['messagepari'];


 

//echo "ok1";
$msg=         "\r\n FirstName  :".$firstname.	
	"\r\n LastName :".$lastname.
	"\r\n Email       :".$email.
	"\r\n Message     :".$messagepari;
	

//echo $msg;

$to="vinay@exafluence.com";
$from="request@parihaara.com";
$headers = "From:" . $from;


 
if(mail($to,"Signed up account ",$msg,$headers))
echo "ok";
else
echo "no";
 




?>






