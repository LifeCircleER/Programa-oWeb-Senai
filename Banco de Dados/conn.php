<?php 
// host, iuser, pass, bd
$host = "localhost";
$user = "root";
$pass = "";
$database = "senai";

try {
	$connect = new PDO("mysql:host=" . $host . ";dbname=" . $database, $user, $pass );  
	//echo "conexão realizanda com sucesso";
} catch (Exception $e) {
	//echo "Erro: " . $e->getmessage();
	
}

?>