# SINGLE RESPONSABILITY PRINCIPLE
O Princípio da Responsabilidade Única estabelece que uma classe ou método deve ter apenas uma responsabilidade. Em outras palavras, se um elemento de código tiver mais de uma razão para mudar, isso indica uma violação desse princípio.

## :red_circle: Problema Apresentado no Projeto
Neste projeto, identificamos uma classe chamada EmployeeService, que possui três métodos:

- Cria funcionário
- Calcular salário
- Salvar funcionário no banco de dados
  
É evidente que essa classe tem mais de uma responsabilidade, o que vai contra o Princípio da Responsabilidade Única.

## :heavy_check_mark: Solução apresentada
Para resolver o problema mencionado acima, adotamos a seguinte abordagem:

- Criamos a classe EmployeeRepository, que é responsável pelas operações no banco de dados.
- Criamos a classe SalaryService, que cuida das operações relacionadas aos salários.
- Mantivemos a classe EmployeeService, que agora é responsável apenas pelas operações relacionadas aos funcionários.

Dessa forma, cada classe tem uma única responsabilidade, aderindo ao Princípio da Responsabilidade Única e tornando o código mais coeso e manutenível.
