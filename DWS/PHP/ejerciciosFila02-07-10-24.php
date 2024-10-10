<?php

/*
ALGORITHM
6. Write a PHP program to remove the character in a given position of a given string.
The given position will be in the range 0..string length -1 inclusive.
Sample Input:
"Python", 1
"Python", o
"Python", 4
Sample Output:
Pthon
ython
Pythn
*/

function remove($string, $n){
    return substr($string, 0, $n) . substr($string, $n+1);
};

echo remove("Python", 1);
echo "<br>";
echo remove("Python", 0);
echo "<br>";
echo remove("Python", 3);
echo "<br>";

/*
LOOPS
6. Write a program which will give you all of the potential combinations of a
two-digit decimal combination, printed in a comma delimited format:
Sample output :
00, 01, 02, 03, 04, 05, 06, 07, 08, 09, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99,
*/
for($i = 0; $i < 100; $i++){
    if($i < 10){
    echo "0$i, ";
    } else {
        echo "$i, ";
    }
}
echo "<br>";

/*
ARRAYS
7. Write a PHP script that inserts a new item in an array in any position.
Expected Output :
Original array : 
1 2 3 4 5 
After inserting '$' the array is :
1 2 3 $ 4 5
*/
$lista = [1, 2, 3, 4, 5];

foreach ($lista as $listado){
    echo "$listado ";
}

echo "<br>";

array_splice($lista, 3, 0, "$");

foreach ($lista as $listado){
    echo "$listado ";
}

?>
