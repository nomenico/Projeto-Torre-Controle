# Projeto-Torre-Controle

Bem-vindo ao Projeto: Torre de Controle - Tráfego Aéreo!

## Sobre o projeto:

O projeto foi desenvolvido na Firjan Senai Caxias, com base em um documento de referência criado pelo professor Jonathan Mattos, com o objetivo de aprimorar o conhecimento na linguagem Java. Consiste em um jogo onde um Avião se move no céu até chegar no Aeroporto, localizado no canto superior direito. Entretanto, o caminho até lá é bem perigoso, com posições de Turbulência capazes de destruir o Avião e o risco de gastar por completo o combustível limitado se o piloto não for cuidadoso...

## O que o projeto contém:

- Um arquivo ".java": 'ControleVoo.java' que contém a lógica necessária para executar o jogo;
- Classe Scanner para ler as teclas que o usuário digitar;
- Classe Math para previnir que os stats do Avião fiquem negativos (usando Math.max);
- Movimentação baseada em uma matriz com 25 posições (5 linhas e 5 colunas);
- Validação de movimentos: O programa não aceita que o usuário digite uma tecla diferente de W, A, S e D;
- Validação de bordas "Out Of Bounds": O programa não permite que o Avião se mova para a coluna -1 e/ou coluna 5, nem para a linha -1 e/ou linha 5; 
- Obstáculos: Existem dois vetores (um para coluna e outro para linha) que definem as posições dos obstáculos. Quando a posição do Avião corresponde aos números desses vetores (ex: colunaAviao = 0 e posColTurb = 0 + linhaAviao = 3 e posLinTurb = 3), o Avião recebe um pouco de dano.

## Instruções e Mêcanicas do jogo:

O Avião tem 100 de integridade e 20 de energia.

Para se movimentar, basta digitar:
W (para cima)
A (para a esquerda)
S (para baixo)
D (para a direita)

A seguir uma representação do mapa:
. . . . A
. . . . .
. . . . .
. . . . .
O . . . .

O Avião começa no canto inferior esquerdo no mapa, representado por "O".
A cada movimento, voce gasta 2 de energia.
É possível movimentar pelas diagonais, porém o consumo de energia é dobrado.
Existe a possibilidade de encontrar obstáculos a cada movimento.
Cada um desses obstaculos podem causar algum dano ao Rover, outros podem aumentar o consumo de energia.

Você vence o jogo após o Avião chegar no Aeroporto.
