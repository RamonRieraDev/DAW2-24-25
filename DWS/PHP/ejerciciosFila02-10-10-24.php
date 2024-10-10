<?php
/*ARRAYS*/
/*
13. Write a PHP  script which displays all the numbers between 200 and 250 
that are divisible by 4.
Note : Do not use any PHP control statement.
Expected Output : 200,204,208,212,216,220,224,228,232,236,240,244,248
*/

for($i = 200; $i <= 250; $i++){ 
    if($i % 4 == 0){
        echo "$i, ";
    }
}
echo "<br>";

/*
16. Write a PHP script to get the largest key in an array.
*/
$frutas = [
    'manzanaaaa',
    'peraaaaaaaaaaaa',
    'naranja',
    'platano',
    'limon',
];

$max = 0;

for ($i = 0; $i < count($frutas); $i++) {
    if (strlen($frutas[$i]) > strlen($max)) {
        $max = $frutas[$i];
    }
}

echo $max;
echo "<br>";

$numeros = [
    1,
    2,
    3,
    40,
    5,
    6,
    7,
    8,
    9,
    10
];

$maxNum = 0;

for ($i = 0; $i < count($numeros); $i++){
    if($numeros[$i] > $maxNum){
        $maxNum = $numeros[$i];
    }
};

echo $maxNum;
echo "<br>";

/*FOR LOOP*/
/*
8. Write a PHP script that creates the following table using for loops. 
Add cellpadding="3px" and cellspacing="0px" to the table tag.
*/
for ($i = 1; $i <= 6; $i++) {
    echo "<table border='1' cellpadding='3px' cellspacing='0px'>";
    echo "<tr>";
    echo "<td>$i* 1 = " . $i * 1 ."</td>
        <td>$i * 2 = " . $i * 2 ."</td>
        <td>$i * 3 = " . $i * 3 ."</td>
        <td>$i * 4 = " . $i * 4 ."</td>
        <td>$i * 5 = " . $i * 5 ."</td>";
    echo "</tr>";
    echo "</table>";
}
echo "<br>";

/*
10. Write a PHP script that creates the following table (use for loops).
*/
for ($i = 1; $i <= 10; $i++){
    echo "<table border='1' cellpadding='2px'>";
    echo "<tr>";
    echo "<td>" . $i+1 . " </td>";
    echo "<td>" . $i+2 . " </td>";
    echo "<td>" . $i+3 . " </td>";
    echo "<td>" . $i*4 . " </td>";
    echo "<td>" . $i*5 . " </td>";
    echo "<td>" . $i*6 . " </td>";
    echo "<td>" . $i*7 . " </td>";
    echo "<td>" . $i*8 . " </td>";
    echo "<td>" . $i*9 . " </td>";
    echo "<td>" . $i*10 . " </td>";
}

?>

