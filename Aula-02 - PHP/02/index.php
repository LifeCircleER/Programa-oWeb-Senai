<?php

$aluno = " Tico Ferraz";
$n1 = 8;
$n2 = 8;
$n3 = 8;
$presenca = 60;
$media = ($n1 + $n2 + $n3)/3;

echo "$aluno ficou com a media $media";
echo "<br>";

if ($media >= 7 && $presenca >= 70) {
	echo "O $aluno ficou com a media $media e foi aprovado";
}
   else if ($media >= 4) {
   	echo "O $aluno ficou com a media $media e vai pro conselho";
   }
   else {
   	echo "O $aluno ficou com a media $media e foi reprovado";
   }  

?> 