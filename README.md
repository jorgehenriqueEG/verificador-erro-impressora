# Verificador de erro impressora

## Descrição do Problema

Um técnico precisa verificar quais impressoras da rede apresentaram falha de comunicação com o servidor de impressão.

## Requisitos

- Receber um array de nomes de impressoras.
- Receber um array de códigos de status (1 para ok, 0 para erro).
- Listar apenas as impressoras que apresentaram erro.
- Se não houver erros, exibir "Nenhum erro encontrado".

## Exemplo de Uso

Impressoras: ["IMP-01", "IMP-02", "IMP-03"]
Status: [1, 0, 1]

Saída:

IMP-02

Regras:

- O código 0 indica falha na impressora.
- O código 1 indica que a impressora está funcionando.