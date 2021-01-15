# Kata Range
### Requisitos: 
-	El sistema deberá ser capaz de realizar operaciones con intervalos.
### Criterios de aceptación:
-	El sistema deberá validar si un intervalo contiene el conjunto dado.
-	El sistema deberá retornar el conjunto de números de un intervalo.
-	El sistema deberá validar si dos intervalos se solapan.
-	El sistema deberá retornar los extremos de un determinado intervalo.
-	El sistema deberá validar si dos intervalos son iguales.
### Escenarios de prueba:
-	includes? “[2,5]” “{2,3,4,5}”=>true
-	all-numbers “[2,5]”=>[2,3,4,5]
-	contains-range? “[2,10)” “[2,5]”=>true
-	end-points “[3,8]”=>[3,8]
-	equal? “[2,5]” “(1,5]”=>true
