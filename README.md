# Kata Range
### Requisitos:
-	El sistema deberá realizar operaciones con intervalos.
### Criterios de aceptación:
-	El programa debe validar si el intervalo contiene el conjunto de elementos dados.
-	El programa deberá retornar el conjunto de elementos de un intervalo.
-	El programa deberá validar si dos intervalos se solapan.
-	El programa deberá retornar los extremos de un determinado intervalo.
-	El sistema deberá validar si dos intervalos son iguales.
### Escenarios de prueba:
-	includes? “[2,5]” “{2,3,4,5}”=> true
-	all-numbers “[2,5]”=>[2,3,4,5]
-	contains-range? “[2,10) “[2,5]”=>true
-	end-points “[3,8]”=>[3,8]
-	equal? “[2,5]” “(1,5]”=>true
