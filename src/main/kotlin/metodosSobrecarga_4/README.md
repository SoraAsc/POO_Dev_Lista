# Exercício 4 - Métodos e Sobrecarga

## Descrição

Implemente uma classe `Calculadora` com métodos para adicionar, subtrair, multiplicar e dividir.
Sobrecarregue os métodos para operar com diferentes números de parâmetros.

## Oque foi feito:

Criei a classe Calculadora com os 4 métodos básicos, primeiro criei um que aceita dois parâmetros do tipo Double.
E depois para aplicar os conceitos de sobrecarga usei o vararg para lidar com n parâmetros do tipo Int.

Assim aplicando sobrecarga pelo número de parâmetros e também pelo tipo.

Como eu usei Int e não tratei o cálculo/retorno alguns cálculos vão ser arredondados. Ex: 8 / 3 / 2 = 1,333... = 1