# Chain - Sistema de Aprovação de Compras

## Estrutura de Arquivos

```
/src
  ├── absHandler.java              (Classe abstrata base)
  ├── compradorHandler.java        (Handler até R$ 1.000)
  ├── gerenteHandler.java          (Handler até R$ 50.000)
  ├── diretorHandler.java          (Handler ilimitado)
  ├── AprovadorDeCompras.java      (FACADE - Interface principal)
  ├── consumidor.java              (Classe cliente de exemplo)
  └── TestadorCadeia.java          (Testes automatizados)
```


### Executar exemplo do cliente:
```bash
java consumidor
```

### Executar testes:
```bash
java TestadorCadeia
```

## Hierarquia de Aprovação

- **Comprador**: valores até R$ 1.000,00
- **Gerente**: valores até R$ 50.000,00
- **Diretor**: valores acima de R$ 50.000,00

## Características

 Encapsulamento total - cliente só conhece AprovadorDeCompras
 Cadeia construída automaticamente
 Extensível para novos níveis de aprovação
 Testado e documentado
