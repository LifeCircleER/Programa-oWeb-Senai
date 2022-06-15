<?php

include "config/conn.php";

$id = 3;
$nome = "Zeze Mota";
$email = "zze@email";
$senha = "123456";

//preparar
$stmt = $connect->prepare("UPDATE usuarios SET nome = :nome, email = :email, senha = :senha WHERE id = :id");

//trocar
$stmt->bindParam(":id", $id);
$stmt->bindParam(":nome", $nome);
$stmt->bindParam(":email", $email);
$stmt->bindParam(":senha", $senha);

//executar
$stmt->execute();

echo "atualizado com sucesso";

?>