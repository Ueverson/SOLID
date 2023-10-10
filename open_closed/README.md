# OPEN CLOSED PRINCIPLE

O Princípio do aberto e fechado estabelece que uma classe deve ser aberto para extensão, mas fechada para modificação.

## :red_circle: Problema Apresentado no Projeto
Nesse projeto, temos uma classe chamada CalculateService que possui um método para calcular o valor do pagamento. No entanto, atualmente, é necessário adicionar um "if" e implementar uma nova regra para cada tipo de pagamento. Exemplo:

![image](https://github.com/Ueverson/SOLID/assets/89094981/ad4233e3-4c71-485d-b933-c1b25bdd370f)

Isso não está correto, pois qualquer alteração em um componente já implementado pode causar problemas em outras partes do código.

## :heavy_check_mark: Solução apresentada
Como solução, criamos uma estrutura usando herença e polimorfismo que permite que implementamos várias regras de calcular pagamento, sem alterar a estrutura CalculateService já existente. A estrutura ficou da seguinte maneira:

![image](https://github.com/Ueverson/SOLID/assets/89094981/4b127274-bc26-48db-a7cd-428fd9116216)


CalculateService é a interface que contem o método de de calcular pagamento, e com isso podemos adicionar novos tipos de pagamento criando novas subclasses de pagamento, sem precisar modificar a classe existente. Exemplos:

Cálculo do valor de pagamento com cartão de crédito:

![image](https://github.com/Ueverson/SOLID/assets/89094981/660c458e-3b5d-4484-a067-d410b0f55b17)

Cálculo do valor de pagamento com cartão de débito:

![image](https://github.com/Ueverson/SOLID/assets/89094981/93c02276-89b0-4d44-beff-1efe81c5f40b)




