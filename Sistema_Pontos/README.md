# Gerenciamento de Programa de Fidelidade

**Descrição:**  
Este sistema simula um programa de fidelidade para uma loja. Permite o cadastro de clientes regulares e premium, e registra os pontos de fidelidade com base no valor das compras. Clientes premium ganham pontos em dobro e têm um bônus especial de aniversário.

**Conceitos Abordados:**
- **Herança e Polimorfismo**: A classe `ClientePremium` herda de `Cliente` e sobrescreve métodos para comportamentos exclusivos, como o bônus de aniversário e pontos em dobro.
- **Encapsulamento**: Proteção de atributos com getters/setters e controle de acesso.
- **Abstração**: Definição de comportamento comum na classe base `Cliente` e implementação de funcionalidades específicas na classe filha `ClientePremium`.

**Objetivo:**  
Simular o gerenciamento de um programa de fidelidade com clientes regulares e premium, onde clientes premium recebem mais benefícios, como bônus de aniversário e pontos em dobro.

**Funcionalidades:**
- Cadastro de clientes regulares e premium.
- Registro de pontos de fidelidade com base nas compras.
- Clientes premium ganham o dobro de pontos e um bônus de aniversário de 100 pontos.

**Como Usar:**
1. Compile e execute a classe `Main.java`.
2. Crie instâncias de **Cliente** e **ClientePremium** e registre compras.
3. O sistema exibe os pontos de fidelidade e os bônus especiais para os clientes premium.
