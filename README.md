CONTA BANCARIA

Fazer um programa para ler os dados de uma conta bancária
e depois realizar um saque nesta conta bancária, mostrando o novo
saldo. Um saque não pode ocorrer ou se não houver saldo na conta,
ou se o valor do saque for superior ao limite de saque da conta.
Implemente a conta bancária conforme projeto abaixo:

Account

- number: Integer
- holder: String
- balance: Double
- WithdrawLimit: Double
-----------------------------
+ deposit(amount: Double): void
+ withdraw(amount: Double): void
-----------------------------

EXEMPLOS

Informe os dados da conta
Numero: 8021
Titular: Bob Brown
Saldo Inicial: 500.00
Limite de Saque: 300.00

Informe uma qunatia para sacar: 100.00
Novo saldo: 400.00
-----------------------------

Numero: 8021
Titular: Bob Brown
Saldo Inicial: 500.00
Limite de Saque: 300.00

Informe uma qunatia para sacar: 400.00
Erro de saque: A quantia excede o limite de saque.
-----------------------------

Numero: 8021
Titular: Bob Brown
Saldo Inicial: 500.00
Limite de Saque: 300.00

Informe uma qunatia para sacar: 800.00
Erro de saque: A quantia excede o limite de saque
-----------------------------

Numero: 8021
Titular: Bob Brown
Saldo Inicial: 200.00
Limite de Saque: 300.00

Informe uma qunatia para sacar: 250.00
Erro de saque: Saldo insuficiente.
