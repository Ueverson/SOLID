# LISKOV SUBSTITUTION PRINCIPLE
O Princípio da Substituição de Liskov afirma que uma classe mãe pode ser substituída por uma subclasse sem que isso altere ou quebre a lógica do código.


## :red_circle: Problema Apresentado no Projeto
Nesse projeto, temos uma classe "Ave" que possui o metodo voar e acasalar.

![image](https://github.com/Ueverson/SOLID/assets/89094981/3cfae101-a321-482e-9b5c-f1546b65a895)

E temos duas classes que a estendem, "Aguia" e "Pinguin", que sobreescrevem os métodos voar e acasalar.

![image](https://github.com/Ueverson/SOLID/assets/89094981/f7f08b43-f875-4335-9f02-39fa6cece415)

![image](https://github.com/Ueverson/SOLID/assets/89094981/6243efd0-1ed7-4fb6-b416-dde5b7c91b33)

Porém como pinguins não voam, ao implentar esse método ele lança uma exceção, e caso em algum lugar do sistema troque a classe "Ave' por "Pinguin" irá quebrar a lógica e comportamento do codigo, ferindo o principio da substituição de Liskov.

## :heavy_check_mark: Solução apresentada
A solução é bastante simples, tendo em vista que a classe "Ave" já tem uma implementação padrão para voar, a classe "Pinguim" não deve sobrescrever esse método, mesmo que os pinguins não voem. Exemplo:

![image](https://github.com/Ueverson/SOLID/assets/89094981/500548f9-7c9a-4766-9c72-67fa7f7e0c0b)

