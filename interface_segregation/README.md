# INTERFACE SEGREGATION PRINCIPLE
No Princípio de Segregação de Interfaces, diz-se que não devemos criar interfaces genéricas de tal forma que uma classe seja obrigada a implementar métodos que não utiliza.

## :red_circle: Problema Apresentado no Projeto
Nesse projeto temos uma interface "DispositivoEletronico", possuindo três métodos.

![image](https://github.com/Ueverson/SOLID/assets/89094981/00e77465-b264-4fd1-bd7d-a6a3d06fd497)

E temos duas classes que estendem essa interface a "MidiaPlayer" E "SmartLamp"

![image](https://github.com/Ueverson/SOLID/assets/89094981/5abacad0-e4c5-4bd6-8ca9-e55aede3d73c)

![image](https://github.com/Ueverson/SOLID/assets/89094981/cee7f993-9d71-448c-932a-09c459597d3a)


Porém a classe "SmartLamp" não possui implementação do reproduceMedia pois não reproduz midia, dessa forma ferimos o principio da segregação de interface.

## :heavy_check_mark: Solução apresentada
A solução para esse problema foi quebrar a interface "DispositivoEletronico" em duas, deixando mais especificas, de modo que seja possível implementar apenas o método necessário. Exemplo:

interfaces "DispositivoEletronico" e "DispositivoEletronicoReproduzivel"

![image](https://github.com/Ueverson/SOLID/assets/89094981/c1104be9-3865-45e1-ab41-446a99bf3ba4)

![image](https://github.com/Ueverson/SOLID/assets/89094981/4454610c-c1e2-4e80-8926-e300ce6f27af)

Como SmartLamp só precisa dos métodos ligar e desligar, implemento apenas a interface DispositivoEletronico, não deixando métodos desnecessários e seguindo principio da Segregação de Interfaces.

![image](https://github.com/Ueverson/SOLID/assets/89094981/b8918eab-9fa9-4d2f-a6b9-98606f186464)






