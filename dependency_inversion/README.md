# DEPENDECY INVERSION PRINCIPLE
A ideia desse princípio é fazer com que não tenha dependência de implementações e sim de abstrações.

## :red_circle: Problema Apresentado no Projeto
Temos um serviço de envio de mensagem, onde atualmente são enviadas mensagens por email, então fizemos da seguinte forma:

![image](https://github.com/Ueverson/SOLID/assets/89094981/88568f52-c8e2-41f0-8f53-be55f1c10553)

Mas, percebe-se que há uma forte dependência da classe 'EmailService" na "MensagemService" deixando ela com um forte acoplamento. E se por acaso algum dia eu precise mudar o tipo de evnio da mensagem de email para sms, eu precisária ir nessa classe e trocar tudo que era "EmailService" por "SmsService".

## :heavy_check_mark: Solução apresentada
Para resolver esse forte acoplamento que tinhamos, introduzimos uma interface 'ServicoDeMensagem" que define o contrato para enviar mensagens.

![image](https://github.com/Ueverson/SOLID/assets/89094981/10ffaaab-bead-4c16-81ce-92dcab023f4c)
 
A classe MensagemService agora depende da abstração ServicoDeMensagem em vez de depender diretamente da implementação do serviço de e-mail,

![image](https://github.com/Ueverson/SOLID/assets/89094981/28d82ea2-778d-49d2-92ff-42048f4a3ab8)


sendo assim eu fico livre para fazer futuras trocas no tipo de envio.
