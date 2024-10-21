<?php

/*
Basic Algorithm:
*/
echo "<br>";
echo "<hr>";
echo "<b>Basic Algorithm</b>";
echo "<br>";
echo "<hr>";
echo "<br>";

/* 
1. Write a PHP program to compute the sum of the two given integer values. 
If the two values are the same, then returns triple their sum.
Sample Input
1, 2
3, 2
2, 2
Sample Output:
3
5
12
*/
echo "<b>Actividad 01</b>";
echo "<br>";

function suma($na, $nb)
{
    if ($na == $nb) {
        return ($na + $nb) * 3;
    }
    return $na + $nb;
}
echo suma(1, 2);
echo "<br>";

echo suma(3, 2);
echo "<br>";

echo suma(2, 2);
echo "<br>";

/*
2. Write a PHP program to get the absolute difference between n and 51. 
If n is greater than 51 return triple the absolute difference.
Sample Input:
53
30
51
Sample Output:
6
21
0
*/
echo "<br>";
echo "<b>Actividad 02</b>";
echo "<br>";
function test($n)
{
    if ($n > 51) {
        $resultado = ($n - 51) * 3;
    } else {
        $resultado = 51 - $n;
    }
    return $resultado;
}

echo test(53);
echo "<br>";

echo test(30);
echo "<br>";

echo test(51);
echo "<br>";

/*
For loop 
*/
echo "<br>";
echo "<hr>";
echo "<b>For Loop</b>";
echo "<br>";
echo "<hr>";
echo "<br>";

/*
1. Create a script that displays 1-2-3-4-5-6-7-8-9-10 on one line. 
There will be no hyphen(-) at starting and ending position.
*/
echo "<b>Actividad 01</b>";
echo "<br>";
for ($i = 0; $i <= 10; $i++) {
    if ($i == 10) {
        echo "$i";
    } else {
        echo "$i-";
    }
}
echo "<br>";
/*
2. Create a script using a for loop to add all the integers between 0 and 30 
and display the total.
*/
echo "<br>";
echo "<b>Actividad 02</b>";
echo "<br>";
$total = 0;
for ($i = 0; $i <= 30; $i++) {
    $total += $i;
    echo "$i, ";
}
echo "<br>";
echo "Total: $total";
echo "<br>";

/*
Array:
*/
echo "<br>";
echo "<hr>";
echo "<b>Array</b>";
echo "<br>";
echo "<hr>";
echo "<br>";
/*2. $color = array('white', 'green', 'red'')
Write a PHP script which will display the colors in the following way :
Output :
white, green, red,

- green
- red
- white
*/
echo "<b>Actividad 02</b>";
echo "<br>";
$color = ["white", "green", "red"];

sort($color);

foreach ($color as $colors) {
    echo "<li>$colors</li>";
}
echo "<br>";
