# Projeto-Torre-Controle

Bem-vindo ao Projeto: Torre de Controle - Tráfego Aéreo!

## Sobre o projeto:

O projeto foi desenvolvido na Firjan Senai Caxias, com base em um documento de referência criado pelo professor Jonathan Mattos, com o objetivo de aprimorar o conhecimento na linguagem Java. Consiste em um jogo onde um Avião, começando no canto inferior esquerdo no mapa, se move em Marte até chegar no Aeroportoo, localizada nas coordenadas (10,10), que é o objetivo principal. Entretanto, o caminho até lá é bem perigoso, com eventos aleatórios que podem destruir o Rover ou deixá-lo sem energia.

## O que o projeto contém:

- Um arquivo ".java": 'ControleVoo.java' que contém a lógica necessária para executar o jogo;
- Classe Scanner para ler as teclas que o usuário digitar;
- Classe Math para previnir que os stats do Avião fiquem negativos (usando Math.max);
- Movimentação de posições baseada em dois vetores (matriz).
- Validação de movimentos: O programa não aceita que o usuário digite uma tecla diferente de W, A, S e D;
- Prevenção "Out Of Bounds": O programa não permite que o Avião se mova para a coluna -1 e/ou linha 5
- Obstáculos: Existem dois vetores (um para coluna e outro para linha) que definem as posições dos obstáculos. Quando a posição do Avião corresponde aos números desses vetores, o Avião recebe um pouco de dano.

## Instruções e Mêcanicas do jogo:

Seu Rover tem 100 de integridade e 100 de energia.

Para se movimentar, basta digitar:
W (para cima)
A (para a esquerda)
S (para baixo)
D (para a direita)

O Rover comeca nas coordenadas (0,0).
A cada movimento, voce gasta 3 de energia.
Pense em um plano cartesiano, onde 'W' e 'S' movimentam o eixo Y e 'A' e 'D' movimentam o eixo X.
Existe a possibilidade de encontrar obstáculos a cada movimento.
Cada um desses obstaculos podem causar algum dano ao Rover, outros podem aumentar o consumo de energia.

Existem dois "dados" que sao jogados automaticamente. Um dado para definir os imprevistos e outro para definir o tipo de solo onde o Rover caminha:

Dado de Eventos (é jogado a cada movimento):
Valores entre 1 e 3 = Buraco (reduz 3 de integridade e consome 6 de energia)
Valores entre 4 e 6 = Tempestade de Areia (reduz 5 de integridade)
Valores entre 7 e 8: Colisão contra rocha (reduz 7 de integridade)
Valores entre 9 e 10: Nada acontece

Dado de Tipo de Solo (é jogado a cada 3 movimentos):
Valor 1: Solo Normal (nenhum dano extra)
Valor 2: Solo Arenoso (consumo de energia dobrado)
Valor 3: Solo Rochoso (perde 2 de integridade a cada movimento)

Você vence o jogo após as posições X e Y forem iguais a 10.
