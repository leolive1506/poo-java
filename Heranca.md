# Herança
- permite que class herde dados e comportamento de outra
- enxerga e consegue alterar os atributos publicos e procted herdados

## Definições importantes
- Relação "é-um"
  - uma BusinessAccount é um Account
- Generalização / especialização
  - uma class generica e outra uma especializada
- Superclass (class base) / subClass (class derivada)
- Herança extensão
- é uma associação entre classes e nao objetos
  - composição entre duas classes tem-se dois objetos
  - já na herança, ao instanciar tem um único objeto com todos os membros das classes herdadas

# Upcasting
- casting da subclass para superclass
- uso comum: polimorfismo

# Downcasting
- casting da superclass para subclass
- palavra instanceof
- uso comum: métodos que recebem parametro generico (ex: Equals)

```java
// UPCASTING (subclass -> superclass)
// consta businessAccount tbm é uma conta
Account acc1 = bacc;
Account acc2 = new BusinessAccount(1001, "Bob", 0.0, 200.0);
Account acc3 = new SavingsAccount(1003, "Anna", 0.0, 0.01);

// DOWCASTING
BusinessAccount acc4 = (BusinessAccount) acc2;
acc4.loan(100.0);

// erro
// BusinessAccount acc5 = (BusinessAccount) acc3;
if (acc3 instanceof BusinessAccount) {
  BusinessAccount acc5 = (BusinessAccount) acc3;
  acc5.loan(200.0);
  System.out.println("Loan!");
}

if (acc3 instanceof SavingsAccount) {
  SavingsAccount acc5 = (SavingsAccount) acc3;
  acc5.updateBalance();
  System.out.println("Update");
}
```

# Soberposição
- implementação de um metodo da superClass na subClass
- recomendável usar anotação @Override  
  - facilita leitura e avisa compilador

# Super
- executa funções da superclass
  - na hora de instanciar no constructor
  - também pode ser usado em funções isoladas

```java
@Override
public void withdraw(double amount) {
  super.withdraw(amount);
  balance -= 2.0;
}
```

# Final
- palavra chave: final
- Class: evita que a classe seja herdada
- metodo: evita que o metodo seja sobreposto
- Maior segurança
- Maior performace
  - atributos de uma class final são analisados de forma mais rapida