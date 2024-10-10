<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>PHP fácil</title>
</head>

<body>
	Hola mundo <br>
	<?php echo "Es muy fácil programar en PHP."; ?>

	<?php
	// Variables:
	$n1 = 10000;
	$n2 = 2000;
	$resultado = $n1 + $n2;
	$resultadoMult = $n1 * $n2;
	echo "<br>";
	echo "<br>";

	// Imprimir:
	echo "El resultado de $n1 + $n2 es $resultado.";
	echo "<br>";
	echo "<br>";

	print "El resultado de $n1 * $n2 es $resultadoMult.";
	echo "<br>";
	echo "<br>";

	print "hola";
	echo "<br>";
	echo "<br>";

	// Condiciones:
	if ($n1 > $n2) {
		print "$n1 es mayor que $n2.";
	} else {
		print "$n2 es mayor que $n1.";
	}
	echo "<br>";
	echo "<br>";

	$hora = 14; // La hora en formato de 24 horas
	if ($hora === 8) {
		echo "Es la hora de desayunar.";
	} else if ($hora === 14) {
		echo "Es la hora de la comida.";
	} else if ($hora === 21) {
		echo "Es la hora de la cena.";
	} else {
		echo "Ahora no toca comer.";
	}
	echo "<br>";

	$hora = "14"; // La hora en formato de 24 horas
	switch ($hora) {
		case 9:
			echo "Es la hora de desayunar.";
			break;
		case 14:
			echo "Es la hora de la comidaaaa.";
			break;
		case 21:
			echo "Es la hora de la cena.";
			break;
		default:
			echo "Ahora no toca comer";
	}
	echo "<br>";

	// Arrays:
	$frutas = ["naranja", "manzana", "melocoton"];
	echo " La posición 2 del array frutas es: $frutas[2].";
	echo "<br>";
	echo "<br>";

	$i = 0;
	for ($i; $i < count($frutas); $i++) {
		echo "La posición $i es $frutas[$i]";
		echo "<br>";
	}
	echo "<br>";
	echo $frutas[0] . " " . $frutas[1];
	?>

	<!--Formularios -->
	<form action="/action_page.php" method="get">
		<p><label for="nombre">Nombre: </label>
			<input type="text" name="nombre" id="nombre">
		</p>
		<p><label for="apellido1">Primer apellido:</label>
			<input type="text" name="apellido1" id="apellido1">
		</p>
		<input type="submit" value="enviar">
	</form>
	<p>
		<?php
		if (isset($_GET['nombre'])) {
			$nombre = $_GET["nombre"];
			$apellido1 = $_GET["apellido1"];

			echo "Hola, $nombre $apellido1";
		}

		?>
		</form>

</body>

</html>